package com.example.ahuang.myframe.classes; /**
 * Apple  2018-04-16
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

/**
 * 实现了泛型接口的类，传入了泛型实参
 * @author Jackson
 * @version 1.0.0
 * since 2018 04 16
 */
public class Apple implements Fruit<String>{

    private String name;

    public Apple(String name){
        this.name=name;
    }

    @Override
    public String printNmae() {
        return name;
    }
}

