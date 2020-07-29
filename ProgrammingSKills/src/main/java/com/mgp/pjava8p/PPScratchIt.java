package com.mgp.pjava8p;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PPScratchIt {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "scala", "python","sur", "jython");
        filter(languages, (str)->str.toString().startsWith("j"));


        // using predicates
        Predicate<String> startsWithj = (n) -> n.startsWith("j");
        Predicate<String> hasForLetters = (n) -> n.length() == 4;

        languages.stream()
                .filter(startsWithj.and(hasForLetters))
                .forEach(System.out::println);

        // map() function

        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        for(Integer cost : costBeforeTax) {
            double price = cost + cost *12;
            System.out.println(price);
        }

        System.out.println("Using nly map");
        costBeforeTax.stream().map((cost) -> cost + cost*.12).forEach(System.out::println);

        double totalPrice = 0;
        for(Integer cost : costBeforeTax) {
            double price = cost + cost *12;
            totalPrice+= price;

        }
        System.out.println("Total --> "+totalPrice);

        // calculate totalPrice using map and reduce function of java8

        double pricing = costBeforeTax.stream()
                .map((cost) -> cost + .12 * cost )
                .reduce((sum,cost) -> sum +cost ).get();

        System.out.println("Total pricing java8 way  --> "+totalPrice);

        //further optimzied
        double pricer = costBeforeTax.stream()
                .map((cost) -> cost + .12 * cost )
                .reduce(Double::sum).get();

        System.out.println("Total pricing optimized  java8 way  --> "+totalPrice);

        // filtering over a list

        List<String > stringList = Arrays.asList("muddu", "padddu", "muddda", "dungu");
        List<String> filtered = stringList
                                    .stream()
                                    .filter(x -> x.length() <= 5)
                                    .collect(Collectors.toList());
        System.out.printf("Original List : %s, filtered list : %s %n", stringList, filtered);



        // convert the given strings to upper case and have it separated by a comma
        List<String > countries = Arrays.asList("USA", "India", "Hindusthan","Bharatha");
        String upperCountries = countries
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));

        System.out.println("Converted String -->" + upperCountries);

        List<String> tenants = Arrays.asList("t1","t1.t11", "t2", "t2.t21");
        String tenantHeader = "t2.t11";
        String childTenants = tenants.stream().filter(t -> t.equalsIgnoreCase(tenantHeader)).collect(Collectors.joining());
        System.out.println("Children tenant --> " + childTenants.toUpperCase());



    }


//    public static void filter(List<String> names, Predicate condition){
//        for(String s : names) {
//            if(condition.test(s)) {
//                System.out.println(s + " ");
//
//            }
//        }
//    }
    public static void filter(List langs, Predicate condition) {
        langs.stream().filter((lang) -> (condition.test(lang)))
                .forEach(System.out::println);
    }



}
