package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ArrayFrequencyParadigmContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>(); //O(n)
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (hm.containsKey(arr[i])) {
                int freq = hm.get(arr[i]);
                hm.put(arr[i], freq + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        System.out.println(hm);

        for (int i = 0; i < n; i++) {
            int ans = -1;
            for (int j = i + 1; j < n; j++) {
                if (hm.get(arr[i]) <= hm.get(arr[j])) {
                    ans = j + 1;
                    break;
                }
            }
            System.out.print(ans + " ");
        }
    }
}

// for every i
//j = i+1 index
//  frq[arr[i]]<=frq[arr[j]]
//  print(j)
