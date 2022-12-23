import java.util.ArrayList;

public class SumOfnNatural {

    public static void main(String[] args) {
//        int n = 3;
//        int arr[] = new int[n];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//
//        int arr2[] = new int[n + 1];
//        for (int i = 0; i < n; i++) {
//            arr2[i] = arr[i];
//        }
//        arr2[3] = 40;
//
//        arr = arr2;


//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            sum = sum + i;
//        }
//
//        System.out.println(sum);
        //O(1)

        // 1 -> n
        // time -> 10
        //space -> 10MB, 11MB

        // reduce time, space increase

        // space,
        //o(n)
//        int arr[] = new int[n]; //O(n)
//        int grid[][] = new int[n][n];  // n2
        ArrayList<Integer> li = new ArrayList<>();
        li.add(10); // insert at the end
        li.add(20);// insert at the end
        li.add(30); // insert at the end
        System.out.println(li);
        System.out.println(li.size());
        li.add(0, 99); // arr[0] = 99;
        System.out.println(li);
        System.out.println(li.get(0)); //arr[0]
        li.remove(0);
        System.out.println(li);
        li.remove(new Integer(10));
        System.out.println(li);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(101);
        l2.add(102);
        li.addAll(l2); // copy values of l2 into li
        System.out.println(li);

//                // int -> Integer

        // int, double, float, long, char ,short, byte, boolean;
        // wrapper class
        // Integer, Double, Float, Long, Char, Short, Byte, Boolean
//        int num = 10;
//        Integer num1 = 10;
//
//        double num2 = 10.9;
//        Double num3 = new Double(10.9);
//
//        double num4 = num3;

    }
}
