package com.test.dtst;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StartingWithLetterA {
    public static void main(String[] args) {

        List<Employee> employeeList = Stream.of(new Employee(1,"Rohit", "Mumbai"),
                                     new Employee(2, "Virat", "Bangalore"),
                                     new Employee(3, "surya", "Mumbai"),
                                      new Employee(4, "sunny", "Ahmedabad")).collect(Collectors.toList());

       List<Employee> employeeList1= employeeList.stream().filter(e -> e.getName().startsWith("s")).collect(Collectors.toList());

       for(Employee e :employeeList1 ) {
           System.out.println(e.getId()+":"+e.getCity() );
       }


    }
}
