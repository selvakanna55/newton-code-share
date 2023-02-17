package assignments;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

// don't change the name of this class
// you can add inner classes if needed
class RectangularArea {
    public static void main(String[] args) {
        long mod = (long) 1e9 + 7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        TreeSet<Integer> x = new TreeSet<>();
        TreeSet<Integer> y = new TreeSet<>();
        for (int co[] : arr) {
            x.add(co[0]);
            x.add(co[2]);
            y.add(co[1]);
            y.add(co[3]);
        }

        HashMap<Integer, Integer> cordX = new HashMap<>();
        HashMap<Integer, Integer> cordY = new HashMap<>();
        ArrayList<Integer> xVal = new ArrayList<>();
        ArrayList<Integer> yVal = new ArrayList<>();
        xVal.addAll(x);
        yVal.addAll(y);
        for (int i = 0; i < xVal.size(); i++) {
            cordX.put(xVal.get(i), i);
        }
        for (int i = 0; i < yVal.size(); i++) {
            cordY.put(yVal.get(i), i);
        }
        boolean visisted[][] = new boolean[xVal.size()][yVal.size()];
        System.out.println(xVal);
        System.out.println(yVal);
        System.out.println(cordX);
        System.out.println(cordY);
        long ans = 0;
        for (int p = 0; p < n; p++) {
            long pre = ans;
            for (int j = cordX.get(arr[p][0]); j < cordX.get(arr[p][2]); j++) {
                for (int k = cordY.get(arr[p][1]); k < cordY.get(arr[p][3]); k++) {
                    if (visisted[j][k] == false) {
                        int width = xVal.get(j + 1) - xVal.get(j);
                        int height = yVal.get(k + 1) - yVal.get(k);
                        long curr = (width * height) % mod;
                        ans = (ans + curr) % mod;
                        visisted[j][k] = true;
                    }
                }
            }
            System.out.println(ans - pre);

        }
        System.out.println(ans);
    }
}
