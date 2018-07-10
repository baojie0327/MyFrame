package com.example.ahuang.myframe.classes; /**
 * Teacher  2018-04-16
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

/**
 * class description here
 *
 * @author Jackson
 * @version 1.0.0
 *          since 2018 04 16
 */
public class Teacher<T, K> {

    private T t;
    private K k;

    public Teacher(T t, K k) {
        this.t = t;
        this.k = k;
    }


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }
}

