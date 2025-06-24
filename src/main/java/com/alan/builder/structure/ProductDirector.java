package com.alan.builder.structure;

//defines the diferents Steps to build for a type of product
public class ProductDirector {
    private ProductBuilder productBuilder;

    public void makeSimpleProduct(String productName){
        productBuilder.reset(productName);
        productBuilder.buildStepA();
    }

    public void makeFullProduct(String productName){
        productBuilder.reset(productName);
        productBuilder.buildStepA();
        productBuilder.buildStepB();
        productBuilder.buildStepC();
    }

    public ProductDirector(ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }

    public ProductBuilder getProductBuilder() {
        return productBuilder;
    }

    public void setProductBuilder(ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }
    
}
