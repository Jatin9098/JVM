package java_demo.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {



    public static void start(){

        
        List<String> fruitList = Arrays.asList("apple","banana","orange");

        Stream<String> myStream = fruitList.stream();

        String[] array = {"apple","banana","orange"};
        Stream<String> stream = Arrays.stream(array);

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);


        Stream<Integer> limit = Stream.iterate(0, n -> n+1).limit(10);
        System.out.println("Limit Stream "+limit.collect(Collectors.toList()));

        List<Integer> list = Arrays.asList(1,3,4,6,78,9,7,45,343,22,43,66,88,21,00,1,1,4,3,3);

        List<Integer> result = list.stream() // 1,3,4,6,78,9,7,45,343,22,43,66,88,21,00,1,1,4,3,3
        .filter(x -> x%2 == 0)               // 4, 6, 78, 22, 66, 88, 0, 4
        .map(x -> x /2)                      // 2, 3, 39, 11, 33, 44, 0, 2
        .distinct()                          // 2, 3, 39, 11, 33, 44, 0
        .sorted((a,b) -> b -a)               // 44, 39, 33, 11, 3, 2, 0
        .skip(2)                           // 33,   11, 3, 2, 0
        .limit(3)                    // 33, 11, 3
        .collect(Collectors.toList());
        
        System.out.println("Result stream "+result);
    
    }
    
}
