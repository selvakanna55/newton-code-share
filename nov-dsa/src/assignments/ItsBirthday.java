package assignments;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class ItsBirthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String curr = sc.next();
        int k = sc.nextInt();
        Deque<Character> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char ch = curr.charAt(i);
            while (!q.isEmpty() && q.getLast() < ch && k > 0) {
                k--;
                q.removeLast();
            }
            q.addLast(ch);
        }
        while (!q.isEmpty() && k > 0) { //remove remaining element
            q.removeLast();
            k--;
        }
        n = q.size();
        char arr[] = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = q.removeFirst();
        }
        System.out.println(new String(arr));
    }
}
