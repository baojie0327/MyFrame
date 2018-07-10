package com.example.ahuang.myframe.activity.other;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.ahuang.myframe.R;
import com.example.ahuang.myframe.classes.Apple;
import com.example.ahuang.myframe.classes.Orange;
import com.example.ahuang.myframe.classes.Student;
import com.example.ahuang.myframe.util.LogUtil;

import java.util.ArrayList;
import java.util.List;

public class FanxingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fanxing);

        Student<String> student = new Student<>("shuang");
        LogUtil.d("key==" + student.getKet());

        Student<Integer> student1 = new Student<>(20);
        LogUtil.d("key==" + student1.getKet());

        // 不传入泛型实参
        Student student2 = new Student(18.88);
        LogUtil.d("key==" + student2.getKet());

        //泛型接口，未传入泛型实参
        Orange orange = new Orange("wen");
        LogUtil.d("key==" + orange.printNmae());

        Orange orange1 = new Orange(30);
        LogUtil.d("key==" + orange1.printNmae());

        // 泛型接口，传入了泛型实参
        Apple apple = new Apple("jing");
        LogUtil.d("key==" + apple.printNmae());

        List<String> list = new ArrayList<>();
        list.add("qq");
        list.add("mo");
        showList(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(30);
        showList(list1);
        // 泛型方法，无返回值
        show("name");
        show(230);

        // 泛型方法，有参数
        String str = showt("wenshuang");
        LogUtil.d("str==" + str);

        int age = showt(23);
        LogUtil.d("age==" + age);

        showMsg(22,"abs",57,"fdsd");

    }

    /**
     * 泛型通配符，解决类型无法确定的情况
     *
     * @param list
     */
    private void showList(List<?> list) {
        for (Object o : list) {
            LogUtil.d("object==" + o);
        }
    }

    /**
     * 泛型方法,无返回值
     *
     * @param t
     * @param <T>
     */
    public <T> void show(T t) {
        LogUtil.d("t==" + t);
    }

    /**
     * 泛型方法，有返回值
     *
     * @param t
     * @param <T>
     * @return
     */
    public <T> T showt(T t) {
        return t;
    }

    /**
     * 可变参数
     * @param ags
     * @param <T>
     */
    public <T> void showMsg(T... ags) {
        for (T t : ags) {
            LogUtil.d("ags==" + t);
        }
    }


}
