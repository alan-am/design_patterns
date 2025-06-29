package com.alan.factoryMethod.structure;

public class ConcreteCreatorB extends Creator{

    @Override
    public Product createProduct() {
        ConcreteProductB pB = new ConcreteProductB();
        recordProduct();
        return pB;
    }

    @Override
    public void recordProduct() {
        System.out.println("Recording creation of an ConcreteProductB on DB");
    }
}
