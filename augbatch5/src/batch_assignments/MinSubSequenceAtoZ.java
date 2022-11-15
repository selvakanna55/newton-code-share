package batch_assignments;


import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MinSubSequenceAtoZ {
    public static int minSubsequenceLength(String s) {
        int n = s.length();
        if (n < 26) {
            return -1;
        }
        int ans = Integer.MAX_VALUE;
        int k = 26;
        // Queue<Integer> q = new LinkedList<>();
        Deque<Integer> dq[] = new ArrayDeque[k];
        for (int i = 0; i < k; i++) {
            dq[i] = new ArrayDeque<>();
        }
        for (int i = 0; i < n; i++) {
            int ch = s.charAt(i) - 'a'; //a -> 97
            dq[ch].addLast(i);
        }
        // for(int i=0;i<k;i++)
        //     System.out.println((char)('a'+i )+ " " +dq[i]);

        while (!dq[0].isEmpty()) {
            int start = dq[0].getFirst();
            dq[0].removeFirst();

            boolean flag = true;
            int prevIdx = start;
            for (int i = 1; i < k; i++) {
                while (!dq[i].isEmpty() && dq[i].getFirst() < prevIdx) {
                    dq[i].removeFirst();
                }
                if (dq[i].isEmpty()) {
                    flag = false;
                    break;
                }
                prevIdx = dq[i].getFirst();
            }
            if (!flag) break;
            ans = Math.min(ans, prevIdx - start + 1);
            System.out.println(ans);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(minSubsequenceLength(str));
    }
}
