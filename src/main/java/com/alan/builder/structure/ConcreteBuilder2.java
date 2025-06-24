package com.alan.builder.structure;

public class ConcreteBuilder2 implements ProductBuilder{
     private Product2 product2;

    public void reset(String productName){
        //this method start the construction of the final version Product1
        product2  = new Product2(productName);
        System.out.println("Starting construction for: "+ product2.getName());
    }

    public void buildStepA(){
        System.out.println("built Step A in a concreteBuilder2 for: "+ product2.getName());
    }
    public void buildStepB(){
        System.out.println("built Step B in a concreteBuilder2 for: "+ product2.getName());
    }
    public void buildStepC(){
        System.out.println("built Step C in a concreteBuilder2 for: "+ product2.getName());
    }

    public Product2 getResult(){
        System.out.println("Getting final: "+ product2.getName());
        return product2;
    }
}
