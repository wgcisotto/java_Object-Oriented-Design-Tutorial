package com.wgcisotto.ood.concepts.abstraction;

public class AbstractionShapeTest {

    public static void main (String args[]){
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }

}
