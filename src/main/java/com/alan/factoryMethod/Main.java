package com.alan.factoryMethod;

import com.alan.factoryMethod.structure.ConcreteCreatorA;
import com.alan.factoryMethod.structure.ConcreteCreatorB;
import com.alan.factoryMethod.structure.Creator;
import com.alan.factoryMethod.structure.Product;

public class Main {

    public static void main(String[] args) {
        //The client only interact with Creator and Product
        Creator a = new ConcreteCreatorA();
        a.someOperation();

        System.out.println("--------------------------");
        Creator b = new ConcreteCreatorB();
        Product productB = b.createProduct();
        productB.getInfo();
    }
}
