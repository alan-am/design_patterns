package com.alan.singleton;

import com.alan.singleton.structure.SingletonClass;

public class Main {
    public static void main(String[] args) {

        SingletonClass A = SingletonClass.getInstance();
        A.doSomething();
        SingletonClass B = SingletonClass.getInstance();
        B.doSomething();
        SingletonClass C = SingletonClass.getInstance();
        C.doSomething();
    }
}
