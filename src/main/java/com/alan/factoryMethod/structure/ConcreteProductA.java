package com.alan.factoryMethod.structure;

public class ConcreteProductA implements Product{

    @Override
    public void getInfo() {
        System.out.println("This is a concreteProductA: "+ this.toString());
    }

}
