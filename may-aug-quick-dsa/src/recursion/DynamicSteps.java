package recursion;

// https://my.newtonschool.co/playground/code/evfba583dm9q

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class DynamicSteps {
    static void printPath(int curr, String path, int n) {
        if (curr > n) {
            return;
        }
        if (curr == n) {
            System.out.println(path);
        } else {
            printPath(curr + 1, path + "1 ", n);
            printPath(curr + 2, path + "2 ", n);
            printPath(curr + 3, path + "3 ", n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPath(0, "", n);
    }
}
