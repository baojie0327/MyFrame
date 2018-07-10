package com.example.ahuang.myframe.viewmodel.module; /**
 * CarModule  2017-09-02
 * Copyright (c) 2017 KL Co.Ltd. All right reserved.
 */

import com.example.ahuang.myframe.viewmodel.ViewModeClass.Car;

import dagger.Module;
import dagger.Provides;

/**
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2017 09 02
 */
@Module
public class CarModule {

    @Provides
    public Car provideCar(){
        return new Car();
    }
}

