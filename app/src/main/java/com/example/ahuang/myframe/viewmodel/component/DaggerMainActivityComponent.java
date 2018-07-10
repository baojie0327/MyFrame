package com.example.ahuang.myframe.viewmodel.component;

import com.example.ahuang.myframe.activity.dagger.DaggerMainActivity;
import com.example.ahuang.myframe.viewmodel.module.CarModule;

import dagger.Component;

/**
 * Created by Lenovo on 2017/9/2.
 */

@Component(modules = CarModule.class)
public interface DaggerMainActivityComponent {
    void inject(DaggerMainActivity daggerMainActivity);
}
