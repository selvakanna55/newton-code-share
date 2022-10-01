import jdk.nashorn.internal.parser.JSONParser;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CompNumber implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}


interface Printer {
    public void print(String s);
}

class CanonPrinter implements Printer {
    @Override
    public void print(String s) {
        System.out.println("canon"+s);
    }
}

public class LambdaJava {
    public static void main(String[] args) {
        CanonPrinter cp = new CanonPrinter();
        cp.print("sfr");

        Printer hp = (String s) -> System.out.println("hp "+s);
        hp.print("sfr");

//        List<Integer> li = Arrays.asList(3, 1, 2);
//        System.out.println(li);
////        Collections.sort(li, new Comparator<Integer>(){
////            public int compare(Integer o1, Integer o2) {
////                return  o2-  o1;
////            }});
//        Collections.sort(li, (o1, o2) -> o2 - o1);
//        System.out.println(li);
    }
}

