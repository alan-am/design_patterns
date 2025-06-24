package com.alan.builder.structure;

public class ConcreteBuilder1 implements ProductBuilder{
    private Product1 product1;

    public void reset(String productName){
        //this method start the construction of the final version Product1
        product1  = new Product1(productName);
        System.out.println("Starting construction for: "+ product1.getName());
    }

    public void buildStepA(){
        System.out.println("built Step A in a concreteBuilder1 for: "+ product1.getName());
    }
    public void buildStepB(){
        System.out.println("built Step B in a concreteBuilder1 for: "+ product1.getName());
    }
    public void buildStepC(){
        System.out.println("built Step C in a concreteBuilder1 for: "+ product1.getName());
    }
    public Product1 getResult(){
        System.out.println("Getting final: "+ product1.getName());
        return product1;
    }
}
