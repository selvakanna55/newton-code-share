package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class EVMMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> voteCount = new TreeMap<>();
        HashSet<String> votedList = new HashSet<>();
        int t = Integer.parseInt(sc.nextLine());
        int winnerCount = 0;
        while (t-- > 0) {
            String curr[] = sc.nextLine().split(" "); //
            if (!votedList.contains(curr[0])) {
                votedList.add(curr[0]);
                if (voteCount.containsKey(curr[1])) {
                    voteCount.put(curr[1], voteCount.get(curr[1]) + 1);
                } else {
                    voteCount.put(curr[1], 1);
                }
                winnerCount = Math.max(winnerCount, voteCount.get(curr[1]));
            }
        }
        for (String party : voteCount.keySet()) {
            if (voteCount.get(party) == winnerCount) {
                System.out.println(party + " " + voteCount.get(party));
            }
        }
    }
}