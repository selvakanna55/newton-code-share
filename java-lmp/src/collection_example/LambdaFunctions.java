package collection_example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Comp implements Comparator {
    public int compare(Object a, Object b) {
        return (Integer) b - (Integer) a;
    }
}


interface Printer {
    public void print(Object a);
}

class HPPrinter implements Printer {
    @Override
    public void print(Object a) {
        System.out.println(a);
    }
}

public class LambdaFunctions {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(3, 4, 1, 2);
        System.out.println(li);
        Collections.sort(li, (Integer a, Integer b) -> b - a);
        //b-a > 0 swap
        // b-a <0 dont swap
        // 0 -> selva 2->selva

        // [9,1a, 1b, ]
        // [1a, 1b, 9]
//        Collections.sort(li, new Comp());
//        Collections.sort(li, new Comparator<Integer>() {
//            public int compare(Integer a, Integer b) {
//                return (Integer) b - (Integer) a;
//            }
//        });
        System.out.println(li);

        Printer p = (Object i) -> { // implementing interface using lambda
            System.out.println(i);
        };

        p.print(1);
        p.print("1aaaadf");
        // usuallly ->(a>b)
        //lambda -> (l(a, b)>0)


    }
}
