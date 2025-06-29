package com.alan.singleton.structure;

public class SingletonClass {
    private static SingletonClass instance;
   
    //important!
    private SingletonClass(){}

    public static SingletonClass getInstance() {
        //late initialization
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }

    public void doSomething(){
        System.out.println(" I'm the same instance! "+ instance.toString());
    }
}
