package com.alan.factoryMethod.structure;

public abstract class Creator {

    //factory method
    public abstract Product createProduct();

    //some methods abouts factories(not mandatory)
    public abstract void recordProduct();



    public void someOperation(){
        System.out.println("Doing something...");
        Product p = createProduct(); //instantiation and registration
        p.getInfo();
    };

}
