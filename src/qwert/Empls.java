package qwert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Empls {
   static class Employee{
       private String name;
       private int age;
       private int salary;

       public Employee(String name, int age, int salary) {
           this.name=name;
           this.age = age;
           this.salary=salary;
       }
   }




    public static List<Employee> arrayEmployee(){

       List<Employee> employees = new ArrayList<>(Arrays.asList( new Employee("Emp1", 46, 45444),
        new Employee("Empp2", 36, 56544),
       new Employee("Empppp3", 23, 38765) ,
       new Employee("Emp4", 43, 65325) ,
       new Employee("Emp5", 39, 43286) ,
       new Employee("Emp6", 29, 54127)) );
       return employees;

    }
    public static void avgEmploers(){
        System.out.println(arrayEmployee().stream()
                .collect(Collectors.averagingInt(Employee->Employee.salary))
        );
    }
    public static void age(int n){
        System.out.print(n);
        System.out.println(arrayEmployee().stream()
                .sorted((e1,e2)->e1.age-e2.age)
                .map((Function< Employee, String>) Employee->Employee.name )
                .limit(n)
                        .sorted((e1,e2)->e1.length()-e2.length())
                .collect(Collectors.joining(",",
                        " самых старших сотрудников зовут:",";")));

    }


}
