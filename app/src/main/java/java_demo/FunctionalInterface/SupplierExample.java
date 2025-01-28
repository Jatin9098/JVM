package java_demo.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierExample {
    

    public static void start(){


        System.out.println("-----------Supplier Example start---------- ");
        Supplier<Integer> s1 = () -> 4;
        Supplier<String> s2 = () -> "jatinder";

        System.out.println("Supplier s1 "+s1.get());
        System.out.println("Supplier s1 "+s2.get());

        System.out.println("-----------Supplier Example End---------- \n");
    }
}
