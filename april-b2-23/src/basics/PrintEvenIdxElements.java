package basics;
import java.util.*;
public class PrintEvenIdxElements {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // is even index
                System.out.print(arr[i] + " ");
            }
        }
    }
}