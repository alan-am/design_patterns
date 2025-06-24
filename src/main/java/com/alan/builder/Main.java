package com.alan.builder;

import com.alan.builder.structure.ConcreteBuilder1;
import com.alan.builder.structure.ConcreteBuilder2;
import com.alan.builder.structure.Product1;
import com.alan.builder.structure.Product2;
import com.alan.builder.structure.ProductDirector;

public class Main {
    public static void main(String[] args) {
        
        //creating builder for products wanted
        ConcreteBuilder1 builderP1 = new ConcreteBuilder1();
        ConcreteBuilder2 builderP2 = new ConcreteBuilder2();

        //creating de director
        ProductDirector director = new ProductDirector(builderP1);
        //the director executes the steps
        director.makeSimpleProduct("SimpleProduct- P1");
        //getting the final version produced by the builder
        Product1 simpleProduct1 = builderP1.getResult();

        System.out.println("\n\n");
        // changing the builder for make other product
        director.setProductBuilder(builderP2);
        director.makeFullProduct("FullProduct- P2");
        Product2 fullProduct2 = builderP2.getResult();


    }
}
