package com.example.ahuang.myframe.activity.rxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.util.CommonMethod;
import com.example.ahuang.myframe.util.LogUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class BasicUsedActivity extends AppCompatActivity {

    @BindView(R.id.et_send)
    EditText mEtSend;
    @BindView(R.id.btn_send)
    Button mBtnSend;
    @BindView(R.id.receive)
    TextView mReceive;

    private String mess;

    //创建Observable，被观察者，它决定什么时候触发事件以及触发怎样的事件
    @OnClick(R.id.btn_send)
    public void sendEms() {
        mess="";
        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<String> e) throws Exception {
                LogUtil.d("Observable Thread="+Thread.currentThread().getName());
                e.onNext("start");
                e.onNext(mEtSend.getText().toString().trim());
                e.onNext("complent");
                e.onComplete();
            }
        })
                .subscribeOn(Schedulers.newThread()) //指定 subscribe()的线程，上游线程，事件生产的线程,只有第一次的有效
                .observeOn(AndroidSchedulers.mainThread())  //指定 Subscriber 的回调发生在主线程 ,下游线程，事件消费线程
                .subscribe(new Observer<String>() {
            private int i;
            private Disposable mDisposable;

            @Override
            public void onSubscribe(@NonNull Disposable d) {
            //    CommonMethod.showToast(BasicUsedActivity.this, "onSubscribe: " + d.isDisposed() + "\n");
                mDisposable = d;
            }

            @Override
            public void onNext(@NonNull String s) {
                LogUtil.d("Subscribe Thread="+Thread.currentThread().getName());
                mess += s + "\n";
                mReceive.setText(mess);
                // /在RxJava 2.x 中，新增的Disposable可以做到切断的操作，让Observer观察者不再接收上游事件
               /* if (i==1){
                    mDisposable.dispose();
                    CommonMethod.showToast(BasicUsedActivity.this, "i== " + mDisposable.isDisposed() + "\n");
                }
                i++;*/
            }

            @Override
            public void onError(@NonNull Throwable e) {
                CommonMethod.showToast(BasicUsedActivity.this, "onError: " +e.getMessage() + "\n");
            }

            @Override
            public void onComplete() {
                CommonMethod.showToast(BasicUsedActivity.this, "onComplete" + "\n");
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_used2);
        ButterKnife.bind(this);

    }
}
