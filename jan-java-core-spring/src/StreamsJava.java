import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsJava {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 9, 3, 420);
//
//        // external for loops
//
//        // for loop
//        for (int i = 0; i < li.size(); i++) {
//            System.out.println(li.get(i));
//        }
//
//        // enhanced for loop
//        for (Integer num : li) {
//            System.out.println(num);
//        }
//        li.forEach(System.out::println);
//        li.stream().filter(num->num%2==1).forEach(System.out::println);
//        List<Integer> even = li.stream().filter(num->num%2==0).collect(Collectors.toList());
//        System.out.println(even);
        Optional<Integer> op = li.stream().filter(num->num%2==0).findFirst();
//        Integer res = op.orElse(-1);
//       System.out.println(res);
//        System.out.println(li.stream().filter(num->num%2==0).findFirst());



    }
}
