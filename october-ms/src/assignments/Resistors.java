package assignments;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// don't change the name of this class
// you can add inner classes if needed
public class Resistors {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(sc.readLine());
        double total = 0f;
        float a;
        String nums[] = sc.readLine().split(" ");
        //"10 30 " -> ["10", "30"]
        for (int i = 0; i < N; i++) {
            a = Float.parseFloat(nums[i]);
            total = total + (1 / a);
        }
        total = 1 / total;
        int x = (int) total;
        System.out.println(x);
    }
}