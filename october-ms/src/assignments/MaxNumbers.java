package assignments;

import java.io.*;


// don't change the name of this class
// you can add inner classes if needed
public class MaxNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine()); // convert string to integer
        for (double testcase = 1; testcase <= t; testcase++) {
            int n = Integer.parseInt(reader.readLine()); //"5" -> 5
            String nums[] = reader.readLine().split(" "); // {"1", "4", "2", "4", "5"}
            // {1, 4, 2, 4, 5}
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(nums[i]);
            }
            int firstMaxiIdx = -1, firstMaxi = -1;
            for (int i = 0; i < n; i++) {
                if (firstMaxi < arr[i]) {
                    firstMaxi = arr[i];
                    firstMaxiIdx = i;
                }
            }
            arr[firstMaxiIdx] = -1;

            int secondMaxiIdx = -1, secondMaxi = -1;
            for (int i = 0; i < n; i++) {
                if (secondMaxi < arr[i]) {
                    secondMaxi = arr[i];
                    secondMaxiIdx = i;
                }
            }

            arr[secondMaxiIdx] = -1;


            int thirdMaxiIdx = -1, thirdMaxi = -1;
            for (int i = 0; i < n; i++) {
                if (thirdMaxi < arr[i]) {
                    thirdMaxi = arr[i];
                    thirdMaxiIdx = i;
                }
            }

            System.out.println(firstMaxi + " " + secondMaxi + " " + thirdMaxi);
        }
    }
}