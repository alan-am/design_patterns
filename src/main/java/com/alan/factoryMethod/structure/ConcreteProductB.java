package com.alan.factoryMethod.structure;

public class ConcreteProductB implements Product{
    @Override
    public void getInfo() {
        System.out.println("This is a concreteProductB: "+ this.toString());
    }
}
