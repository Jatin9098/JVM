package java_demo.FunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {


   

    public static void start(){

        System.out.println("---------Predicate Example Start---------");

        Predicate<Integer> isSalaryGreaterThan1000 = x -> x > 1000;

        System.out.println("Salary greater than 1000 "+isSalaryGreaterThan1000.test(5000));

        Predicate<String> letterStartWithJ = x -> x.toLowerCase().charAt(0) == 'j';
        Predicate<String> letterEndsWithR = x -> x.toLowerCase().charAt(x.length() - 1) == 'r';
        
        System.out.println("Evalueate condition "+letterEndsWithR.test("Jatinder"));
        System.out.println("And Predicate for Jatin "+letterStartWithJ.and(letterEndsWithR).test("Jatin"));
        System.out.println("Or Predicate for Kumar "+letterStartWithJ.or(letterEndsWithR).test("Kumar"));
       
        System.out.println("Negate Predicate for Jatin "+letterStartWithJ.negate().test("Jatin"));
        System.out.println("Negate Predicate for Kumar "+letterStartWithJ.negate().test("Kumar"));

        Predicate<String> predicate = Predicate.isEqual("Jatinder");
        System.out.println("Predicate Jatinder isEquals Jatinder "+predicate.test("Jatinder"));
        System.out.println("Predicate Jatinder isEquals jatinder "+predicate.test("jatinder"));
        System.out.println("Predicate Jatinder isEquals to Kumar "+predicate.test("kumar"));


        BiPredicate<String,String> biPredicate = (s1,s2) -> s1.equals(s2);
        System.out.println("BiPredicate "+biPredicate.test("jatinder", "Jatinder"));

        System.out.println("---------Predicate Example End---------\n");
    }
    
}