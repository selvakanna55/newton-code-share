package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(8, 2, 3, 4, 5, 6);
//        li.stream().forEach(System.out::println);
        li.stream().filter(i -> i % 3 == 0).limit(2).forEach(System.out::println);
        System.out.println(li.stream().filter(i -> i % 3 == 0).findFirst());
//        System.out.println(li.stream().filter(i->i%3==0).collect(Collectors.toList()));
//        System.out.println(isAllEven);
    }
}
