package java_demo.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    

    public static void start(){


        System.out.println("-----------Function Example Start------------");
        Function<String, Integer> countLength = x -> x.length();
        System.out.println(countLength.apply("Jatinder"));

        Function<String, String> startsWithMr = x -> x.substring(0,2);
        System.out.println(startsWithMr.apply("Jatinder"));


        // Filter list on basis of substring
        ArrayList<Student> results = new ArrayList<>();
        Function<List<Student>,List<Student>> filteredStudents = x -> {

            
            for(Student s : x){
                if (startsWithMr.apply(s.getName()).equalsIgnoreCase("mr")) {
                    results.add(s);
                }
            }
        return results;


            
          
        };

        Student s1 = new Student(12, "Mr Jatinder");
        Student s2 = new Student(14, "Jatin");
        Student s3 = new Student(16, "Mr Kumar");
        Student s4 = new Student(10, "jkumar");
        
        List<Student> students = Arrays.asList(s1,s2,s3,s4);
        System.out.println("Filtered Student List with Mr prefix "+filteredStudents.apply(students));

        //andThen

        Function<Integer, Integer> function1 = x -> x * 2;

        Function<Integer, Integer> function2 = x -> x * x * x;

        System.out.println("andThen "+function1.andThen(function2).apply(3)); //216

        System.out.println("andThen "+function2.andThen(function1).apply(3)); // 54
        System.out.println("andThen "+function1.compose(function2).apply(3)); // 54 reverse of andThen

        Function<String,String> identityFunction = Function.identity();
        System.out.println("Identity function "+identityFunction.apply("Jatinder"));

        BiFunction<String,String,Integer> biFunction = (s5,s6) -> s5.length() + s6.length();
        System.out.println("BiFunction "+biFunction.apply("Jatinder", "Kumar"));


        System.out.println("-----------Function Example End------------\n");

    }

    public static class Student {

        private int age;
        private String name;
        
        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return "Student [age=" + age + ", name=" + name + "]";
        }
        
    }

}


