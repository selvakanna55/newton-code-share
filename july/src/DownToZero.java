import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class DownToZero {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int N = sc.nextInt();
            System.out.println(myFunction(N));
        }
    }

    static int myFunction(int num) {
        int j = 0;
        int numnow = 0;
        int count = 0;
        while (num != 0) {
            numnow = num;
            for (int i = (int) Math.sqrt(num); i >= 1; i--) {
                if (num % i != 0) continue;
                numnow = Math.min(numnow, Math.max(i, (num / i)));
            }
            num = numnow == num ? numnow - 1 : numnow;
            // System.out.println(num);
            count++;
        }
        return count;
    }
}

//101->100->10->5->4->2->1->0