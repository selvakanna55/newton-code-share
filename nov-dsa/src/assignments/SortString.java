package assignments;

public class SortString {

    static class Node {
        char data;
        Node next;

        Node(char d) {
            data = d;
        }
    }

    static void string_sort(Node head) {
        int n = 26;
        int[] count = new int[n];
        Node curr = head;
        while (curr != null) {
            char ch = curr.data;
            count[ch - 'a']++;
            curr = curr.next;
        }
        // System.out.println(Arrays.toString(count));

        curr = head;
        for (int i = 0; i < n; i++) {
            while (count[i] > 0) {
                curr.data = (char) ('a' + i);
                curr = curr.next;
                count[i]--;
            }
        }
    }
}