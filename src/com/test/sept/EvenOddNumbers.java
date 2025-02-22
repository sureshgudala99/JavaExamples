package com.test.sept;

import com.test.dtst.FirstNonRepeatableCharecter;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenOddNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,10,12,21,35,44,68,33,10,21);

        System.out.println("First Element is");
        list.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Count of Element is "+list.stream().count());

        System.out.println("Even Numbers are......");
        list.stream().filter(num -> num%2==0).forEach(System.out::println);





        System.out.println("Odd Numbers are......");
        list.stream().filter(num -> num%2!=0).forEach(System.out::println);

        System.out.println("Starts with......3");

        list.stream().filter(num -> num.toString().startsWith("3")).forEach(System.out::println);

        System.out.println("Removing Duplicates....");

        Set<Integer> set = new HashSet<>();
        list.stream().filter(num -> !set.add(num)).forEach(System.out::println);



        Optional<Integer> max =list.stream().max(Integer::compareTo);
        System.out.println("Max value...."+max);

        System.out.println("list in sorting order");
        list.stream().sorted(Integer::compareTo).forEach(System.out::println);


        System.out.println("list in sorting Descending order");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);



        int[] numbers ={2,5,7,6,9};

        if(Arrays.stream(numbers).distinct().count() != numbers.length)
        {
            System.out.println("Duplicate Values in Array");
        }

        System.out.println("Square Root of list of numbers which greater than 50");

        list.stream().map(num ->num*num).filter(num -> num>50).forEach(System.out::println);


        List<String> strList =Arrays.asList("Dev","Byte","Hello","Dev","Howareyou","aeiou");

        strList.stream().map(word -> word.toUpperCase()).forEach(System.out::println);

        Stream<Integer> s1= Stream.of(1,2,3);

        Stream<Integer> s2= Stream.of(4,5,6);
        Stream.concat(s1,s2).forEach(System.out::println);

        Random random =new Random();

        System.out.println("Random 10 numbers are");
        Stream.generate(random::nextInt).limit(10).forEach(System.out::println);

        System.out.println("Date and Time");

        LocalDateTime lt =LocalDateTime.now();
        System.out.println(lt);

        System.out.println("Date in DDMMYYYY  format");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dtf.format(lt));

        List<String> frlist= Arrays.asList("banana","apple","banana","grapes","apple","guava");

        Map<String,Long> dupfrList = frlist.stream().collect(Collectors.groupingBy(s->s,Collectors.counting() ));

        dupfrList.entrySet().stream().filter(m->m.getValue()>1).forEach(m->System.out.println(m.getKey()+"::"+m.getValue()));

        List<Employee> employeeList =new ArrayList<>();

        Employee e1 =new Employee("Sachin",5000);
        Employee e2 =new Employee("Virat",10000);
        Employee e3 =new Employee("rohit",50000);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        System.out.println(employeeList.stream().mapToDouble(Employee::getSalary).sum());

        String val ="Iloveindiaitismarvellous";

        Map<Character,Long> charMap= val.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(charMap);

        String input ="WelcomeToFarminton";

   //Character ch = input.chars().mapToObj(c->c)
     //           .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
        //        .entrySet().stream().
           //      filter(entry ->entry.getValue()==1)
          //      .map(Map.Entry::getKey)
            //    .findFirst().orElse(null);



//find first unique charecter in String;













    }


}
