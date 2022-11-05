
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class GroupOfNumbers {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                int freq = hm.get(arr[i]);
                hm.put(arr[i], freq + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : hm.keySet()) {
            list.add(num);
        }

        Collections.sort(list, (a, b) -> {
            if (hm.get(a) == hm.get(b)) return b - a;
            else return hm.get(b) - hm.get(a);
        });

        for (int num : list) {
            System.out.print(num + " ");
        }


    }
}