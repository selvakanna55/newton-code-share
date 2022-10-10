package batch_assignments;


import java.util.*;


// don't change the name of this class
// you can add inner classes if needed
class GroupOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        ArrayList<Integer> li = new ArrayList<>(map.keySet());
        Collections.sort(li, (num1, num2) -> {
            if (map.get(num1) == map.get(num2)) return num2 - num1;
            else return (map.get(num2) - map.get(num1));
        });

        for (int i : li) {
            System.out.print(i + " ");
        }

    }
}