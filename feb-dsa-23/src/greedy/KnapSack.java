package greedy;


import java.util.*;

class Item {
    int kg;
    int value;

    Item(int kgVal, int val) {
        kg = kgVal;
        value = val;
    }
}

public class KnapSack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Item arr[] = new Item[n];
        for (int i = 0; i < n; i++) {
            int kg = sc.nextInt();
            int value = sc.nextInt();
            arr[i] = new Item(kg, value);
        }
        int bagCapacity = sc.nextInt();
        Arrays.sort(arr, (Item a, Item b) -> {
            int val1 = a.value / a.kg;
            int val2 = b.value / b.kg;
            if (val1 < val2) {
                return 1;
            } else {
                return -1;
            }
        });


        int value = 0;
        for (int i = 0; i < n; i++) {
            if (bagCapacity >= arr[i].kg) {
                value = value + arr[i].value;
                bagCapacity = bagCapacity - arr[i].kg;
            }
        }
        System.out.println(value);
    }
}