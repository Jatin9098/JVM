package java_demo.FunctionalInterface;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodAndConsReference {
    
    public static void start(){

        List<String> names = Arrays.asList("Jatinder", "Rahul","Amar","Ram");
        System.out.println("Method Reference--------");

        names.forEach(x -> System.err.println(x)); //method 1
        names.forEach(MethodAndConsReference::print); // method reference

        System.out.println("Constructor Reference--------");

        List<Student> students = names.stream().map(x -> new Student(x)).collect(Collectors.toList()); // constructor 1
        List<Student> students2 = names.stream().map(Student::new).toList(); // constructor reference

        System.out.println("Student 1 "+students);
        System.out.println("Student 2 "+students2);

        students.forEach(x -> System.out.println(x.name));

    }

    public static void print(String s){
        System.err.println(s);
    }

    static class  Student {
        public Student(String name) {
            this.name = name;
        }

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    
        
    }
}
