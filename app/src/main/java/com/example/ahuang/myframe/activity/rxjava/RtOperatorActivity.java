package com.example.ahuang.myframe.activity.rxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.util.CommonMethod;
import com.example.ahuang.myframe.util.LogUtil;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;

public class RtOperatorActivity extends AppCompatActivity {

    @BindView(R.id.tv_map)
    TextView mTvMap;
    @BindView(R.id.tv_show)
    TextView mTvShow;
    @BindView(R.id.tv_flatMap)
    TextView mTvFlatMap;
    @BindView(R.id.tv_zip)
    TextView tvZip;
    @BindView(R.id.tv_filter)
    TextView mTvFilter;
    @BindView(R.id.tv_sample)
    TextView mTvSample;
    @BindView(R.id.tv_flowable)
    TextView mTvFlowable;
    @BindView(R.id.btn_request)
    Button mBtnRequest;
    @BindView(R.id.tv_concat)
    TextView mTvConcat;
    @BindView(R.id.tv_distinct)
    TextView mTvDistinct;
    @BindView(R.id.tv_buffer)
    TextView mTvBuffer;
    @BindView(R.id.tv_interval)
    TextView mTvInterval;
    @BindView(R.id.tv_doOnNext)
    TextView mTvDoOnNext;
    @BindView(R.id.tv_skip)
    TextView mTvSkip;
    @BindView(R.id.tv_take)
    TextView mTvTake;
    @BindView(R.id.tv_debounce)
    TextView mTvDebounce;
    @BindView(R.id.tv_last)
    TextView mTvLast;
    @BindView(R.id.tv_merge)
    TextView mTvMerge;
    @BindView(R.id.tv_reduce)
    TextView mTvReduce;
    @BindView(R.id.tv_scan)
    TextView mTvScan;

    private String mess;
    private Subscription mSubscription;

    //map操作,对上游发送的每一个事件应用一个函数, 使得每一个事件都按照指定的函数去变化
    @OnClick(R.id.tv_map)
    public void mapOperator() {
        mess = "";
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Integer> e) throws Exception {
                e.onNext(1);
                e.onNext(2);
                e.onNext(3);
                e.onNext(4);
                e.onNext(5);
                e.onComplete();
            }
        }).map(new Function<Integer, String>() {
            @Override
            public String apply(@NonNull Integer integer) throws Exception {
                return "" + integer;
            }
        }).subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull String s) {
                mess += s;
                mTvShow.setText(mess);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                CommonMethod.showToast(RtOperatorActivity.this, "onError: " + e.getMessage() + "\n");
            }

            @Override
            public void onComplete() {
                CommonMethod.showToast(RtOperatorActivity.this, "onComplete" + "\n");
            }
        });
    }

    /**
     * flatMap操作,将一个发送事件的上游Observable变换为多个发送事件的Observables，
     * 然后将它们发射的事件合并后放进一个单独的Observable里,这里需要注意的是, flatMap并不保证事件的顺序, 也就是图中所看到的,
     * 并不是事件1就在事件2的前面. 如果需要保证顺序则需要使用concatMap
     **/
    @OnClick(R.id.tv_flatMap)
    public void flatMapOperator() {
        mess = "";
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Integer> e) throws Exception {
                e.onNext(1);
                e.onNext(2);
                e.onNext(3);
                e.onComplete();
            }
        }).flatMap(new Function<Integer, ObservableSource<String>>() {
            @Override
            public ObservableSource<String> apply(@NonNull Integer integer) throws Exception {
                List<String> list = new ArrayList<String>();
                for (int i = 0; i < 3; i++) {
                    list.add("" + integer);
                }
                return Observable.fromIterable(list).delay(10, TimeUnit.MILLISECONDS);
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                LogUtil.d(s);
            }
        });

        // concatMap 严格按照上游的顺序

    }


    /**
     * zip操作,Zip通过一个函数将多个Observable发送的事件结合到一起，然后发送这些组合到一起的事件.
     * 它按照严格的顺序应用这个函数。它只发射与发射数据项最少的那个Observable一样多的数据。
     **/
    @OnClick(R.id.tv_zip)
    public void zipOperator() {
        Observable<Integer> observable1 = Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Integer> e) throws Exception {
                e.onNext(1);
                e.onNext(2);
                e.onNext(3);
                e.onComplete();
            }
        }).subscribeOn(Schedulers.io()); //在io线程里发送

        Observable<String> observable2 = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<String> e) throws Exception {
                e.onNext("A");
                e.onNext("B");
                e.onNext("C");
                e.onComplete();
            }
        }).subscribeOn(Schedulers.io());  //在io线程里发送

        Observable.zip(observable1, observable2, new BiFunction<Integer, String, String>() {
            @Override
            public String apply(@NonNull Integer integer, @NonNull String s) throws Exception {
                return integer + s;
            }
        }).subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull String s) {
                LogUtil.d("onNext:" + s);
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });


    }

    @OnClick(R.id.tv_filter) //filter操作
    public void filterOpertor() {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Integer> e) throws Exception {
                for (int i = 0; ; i++) {
                    e.onNext(i);
                }
            }
        }).subscribeOn(Schedulers.io())
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(@NonNull Integer integer) throws Exception {
                        return integer % 10 == 0;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        LogUtil.d("" + integer);
                    }
                });
    }

    @OnClick(R.id.tv_sample) //sample操作
    public void sampleopertor() {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Integer> e) throws Exception {
                for (int i = 0; ; i++) {
                    e.onNext(i);
                }
            }
        }).subscribeOn(Schedulers.io())
                .sample(2, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        LogUtil.d("" + integer);
                    }
                });
    }

    @OnClick(R.id.tv_flowable) //Flowable操作
    public void flowableOperator() {
        Flowable.create(new FlowableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull FlowableEmitter<Integer> e) throws Exception {
                LogUtil.d("请求事件; " + e.requested());
               /* e.onNext(1);
                e.onNext(2);
                e.onNext(3);*/
                boolean flag;
                for (int i = 0; ; i++) {
                    flag = false;
                    while (e.requested() == 0) {
                        if (!flag) {
                            flag = true;
                        }
                    }
                    e.onNext(i);
                    LogUtil.d("emitter: " + i);
                }


            }
        }, BackpressureStrategy.ERROR)  //BackpressureStrategy.BUFFER
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Integer>() {
                    @Override
                    public void onSubscribe(Subscription s) {
                        mSubscription = s;
                        //   s.request(Integer.MAX_VALUE); //注意这句话，只有加上request，下游才会消费事件
                        //s.cancel();
                    }

                    @Override
                    public void onNext(Integer integer) {
                        LogUtil.d("onNext:" + integer);
                    }

                    @Override
                    public void onError(Throwable t) {
                        LogUtil.d("onError: " + t.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @OnClick(R.id.btn_request)
    public void consumer_request() {
        request();
    }

    /**
     * 单一的把两个发射器连接成一个发射器,和zip不同，它不合并事件，事件还是独立的
     */
    @OnClick(R.id.tv_concat)
    public void concatOperator() {
        Observable.concat(Observable.just(1, 2, 3), Observable.just(3, 2, 1))
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        LogUtil.d(integer + "");
                    }
                });
    }

    //去重
    @OnClick(R.id.tv_distinct)
    public void distinctOperator() {
        Observable.just(1, 1, 2, 2, 3, 3)
                .distinct()
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        LogUtil.d("" + integer);
                    }
                });
    }

    //buffer
    @OnClick(R.id.tv_buffer)
    public void bufferOperator() {
        Observable.just(1, 2, 3, 4, 5, 6, 7, 8)
                .buffer(3, 2)  // 参数 每组最大数 -- 每次跳跃步数
                .subscribe(new Consumer<List<Integer>>() {
                    @Override
                    public void accept(List<Integer> integers) throws Exception {
                        LogUtil.d("size=" + integers.size());
                        for (Integer integer : integers) {
                            LogUtil.d("" + integer);
                        }
                    }
                });
    }

    //interval 用于间隔时间执行某个操作，其接受三个参数，分别是第一次发送延迟，间隔时间，时间单位
    private Disposable mDisposable; //用于Activity销毁时停止执行

    @OnClick(R.id.tv_interval)
    public void intervalOperator() {
        mDisposable = Observable.interval(3, 2, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        LogUtil.d("" + aLong);
                    }
                });

    }

    // doOnNext操作，作用是让订阅者在接收到数据之前干点有意思的事情
    @OnClick(R.id.tv_doOnNext)
    public void doOnNextOperaator() {
        Observable.just(1, 2, 3, 4, 5)
                .doOnNext(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        LogUtil.d("保存" + integer);
                    }
                }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                LogUtil.d("" + integer);
            }
        });
    }

    //skip 操作，跳过 count 个数目开始接收
    @OnClick(R.id.tv_skip)
    public void skipOperator() {
        Observable.just(1, 2, 3, 4, 5)
                .skip(2)
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        LogUtil.d("" + integer);
                    }
                });
    }

    //take操作，至多接收 count 个数据
    @OnClick(R.id.tv_take)
    public void takeOperator() {
        Observable.just(1, 2, 3, 4, 5)
                .take(3)
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        LogUtil.d("" + integer);
                    }
                });
    }

    //tv_debounce操作，去除发送频率过快的项
    @OnClick(R.id.tv_debounce)
    public void debounceOperator() {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Integer> e) throws Exception {
                e.onNext(1);
                Thread.sleep(200);
                e.onNext(2);
                Thread.sleep(230);
                e.onNext(3);
                Thread.sleep(220);
                e.onNext(4);
                Thread.sleep(250);
                e.onNext(5);
                Thread.sleep(230);

            }
        }).debounce(220, TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        LogUtil.d("" + integer);
                    }
                });
    }

    //last操作，仅取出可观察到的最后一个值，或者是满足某些条件的最后一项
    @OnClick(R.id.tv_last)
    public void lastOperator() {
        Observable.just(1, 2, 3, 4, 5)
                .last(5)
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        LogUtil.d("" + integer);
                    }
                });
    }

    //merge 的作用是把多个 Observable 结合起来，接受可变参数，也支持迭代器集合。
    // 注意它和 concat 的区别在于，不用等到 发射器 A 发送完所有的事件再进行发射器 B 的发送。
    @OnClick(R.id.tv_merge)
    public void mergeOperator() {
        Observable.merge(Observable.just(1, 2, 3), Observable.just(4, 5, 6))
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        LogUtil.d("" + integer);
                    }
                });
    }

    //每次用一个方法处理一个值，可以有一个 seed 作为初始值
    @OnClick(R.id.tv_reduce)
    public void reduceOperator() {
        Observable.just(1, 2, 3, 4, 5)
                .reduce(new BiFunction<Integer, Integer, Integer>() {
                    @Override
                    public Integer apply(@NonNull Integer integer, @NonNull Integer integer2) throws Exception {
                        return integer + integer2;
                    }
                }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                LogUtil.d("" + integer);
            }
        });
    }

    //scan 操作符作用和上面的 reduce 一致，唯一区别是 reduce 是个只追求结果的坏人，
    // 而  scan 会始终如一地把每一个步骤都输出。

    @OnClick(R.id.tv_scan)
    public void scanOperator() {
        Observable.just(1, 2, 3, 4, 5)
                .scan(new BiFunction<Integer, Integer, Integer>() {
                    @Override
                    public Integer apply(@NonNull Integer integer, @NonNull Integer integer2) throws Exception {
                        return integer + integer2;
                    }
                }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                LogUtil.d("" + integer);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rt_operator);
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mDisposable != null && !mDisposable.isDisposed()) {
            mDisposable.dispose();
        }
    }

    public void request() {
        mSubscription.request(96); //请求96个事件
    }
}
