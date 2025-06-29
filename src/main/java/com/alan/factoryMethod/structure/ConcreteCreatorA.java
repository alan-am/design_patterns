package com.alan.factoryMethod.structure;

public class ConcreteCreatorA extends Creator{

    @Override
    public Product createProduct() {
        ConcreteProductA pA = new ConcreteProductA();
        recordProduct();
        return pA;
    }

    @Override
    public void recordProduct() {
        System.out.println("Recording creation of an ConcreteProductA on DB: ");
    }

}
