package com.alan.builder.structure;

public interface ProductBuilder {
    void reset(String name);
    void buildStepA();
    void buildStepB();
    void buildStepC();

}
