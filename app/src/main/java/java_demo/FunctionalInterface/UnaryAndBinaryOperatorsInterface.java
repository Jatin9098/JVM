package java_demo.FunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperatorsInterface {

    public static void start(){

        //UnaryOperatorInterface -> is used when both argument and return type is same

        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println("UnaryOperator square of 4 is "+ unaryOperator.apply(4));

        BinaryOperator<Integer> binaryOperator = (a,b) -> a * b;
        System.out.println("BinaryOperator multiplication of 4 and 5 is "+ binaryOperator.apply(4,5));
    }
}