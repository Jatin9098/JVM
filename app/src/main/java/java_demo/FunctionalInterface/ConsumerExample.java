package java_demo.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void start(){

        System.out.println("-------------Consumer Start------------");
        Consumer<String> consumer = x -> System.out.println("value is "+x);
        consumer.accept("Jatinder");

        Consumer<List<Integer>> fun1 = list -> {
            for(int i : list){
                System.out.println(i + 1000);
            }
        };

        Consumer<List<Integer>> fun2 = list -> {
            for(int i : list){
                System.out.println(i);
            }
        };

        fun1.andThen(fun2).accept(Arrays.asList(1,2,3,4,5,6));

        BiConsumer<Integer,Integer> biConsumer = (x1,x2) -> System.out.println("BiConsumer "+(x1+x2));
        biConsumer.accept(50, 12);

        System.out.println("-------------Consumer End------------\n");
    }
    
}
