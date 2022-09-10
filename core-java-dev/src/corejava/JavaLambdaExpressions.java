package corejava;

import java.util.*;

public class JavaLambdaExpressions {
    public static void main(String[] args) {
//        String arr[] = {"111", "22", "3111"};
        Integer arr[] = {5, 4, 3, 2, 1};

        Arrays.sort(arr, (a, b) -> b.compareTo(a));


        for (int i : arr) {
            System.out.println(i);
        }

    }
}
