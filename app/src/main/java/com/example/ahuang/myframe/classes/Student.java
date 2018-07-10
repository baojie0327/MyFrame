package com.example.ahuang.myframe.classes; /**
 * Student  2018-04-16
 * Copyright (c) 2018 JS Co.Ltd. All right reserved.
 */

/**
 * 泛型类
 * @author Jackson
 * @version 1.0.0
 * since 2018 04 16
 */
public class Student<T> {

    private T t;

    /**
     * 构造方法
     */
    public Student(T t){
        this.t=t;
    }


     public void setKey(T t){
         this.t=t;
     }

     public T getKet(){
        return t;
     }

}

