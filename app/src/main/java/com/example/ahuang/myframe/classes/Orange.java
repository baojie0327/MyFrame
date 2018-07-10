package com.example.ahuang.myframe.classes; /**
 * Orange  2018-04-16
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

/**
 * 实现泛型接口的类，未传入泛型实参
 *
 * @author Jackson
 * @version 1.0.0
 *          since 2018 04 16
 */
public class Orange<T> implements Fruit<T> {

    private T t;

    public Orange(T t) {
        this.t = t;
    }

    @Override
    public T printNmae() {
        return t;
    }
}

