package collection_example;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class Printer1 implements Consumer {
    public void accept(Object t) {
        System.out.println(t);
    }
}

public class StreamExplain {

    static void streamRecap() {
        //stream -> flow of elements
        // internal looping

        List<Integer> li = Arrays.asList(1, 2, 3, 4);
        li.stream().forEach(System.out::println); //:: -> reference
        li.stream().forEach(new Printer1()); //:: -> reference
        System.out.println(li.stream().filter(num -> num % 2 == 0).collect(Collectors.toList())); //:: -> reference
        li.stream().filter(num -> num % 2 == 0).forEach(System.out::println);//:: -> reference
        Integer arr[] = {10, 12};
        List<Integer> a1 = Arrays.stream(arr).collect(Collectors.toList());

        //TODO, blog
        // project ideas

    }


    public static void main(String[] args) {
        //final class,
        //type safety
        streamRecap();
//        List<Integer> li = Arrays.asList(1, 2, 3, 4);
////        System.out.println(li);
//        //iteration -> external iteration
////        for (int i : li) {
////            System.out.println(i);
////        }
////        for (int i = 0; i < li.size(); i++) {
////            System.out.println(li.get(i));
////        }
//
////        li.forEach(System.out::println);
//        //print all even number
////        Consumer p = (Object i) -> { // implementing interface using lambda
////            System.out.println(i);
////        };
////        li.stream().filter(num->num%2==0).forEach(System.out::println);
//
//
//        //print first even number
//        Optional ans = li.stream().filter(num -> num % 14 == 0).findFirst();
//        if (ans.isPresent()) {
//            System.out.println(ans.get());
//        }
////        System.out.println(ans.isPresent());
//
//
////
////        int arr[][] = {{1, 2}, {3, 4}};
////        // (
////        Arrays.stream(arr).forEach(i-> System.out.println(i[0]));
////
////
////
//////
////        List<Integer> res = li.stream().filter(num->num%2==0).collect(Collectors.toList());
////        System.out.println(res);
////        //map filter forEach


    }
}

