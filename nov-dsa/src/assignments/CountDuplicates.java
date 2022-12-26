package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CountDuplicates {
    public static void main(String[] args) throws IOException {
        //Scanner sca=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();
        String nums[] = line.trim().split("\\s+");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }
        int count = 1, val = 0;
        Arrays.sort(arr);
        int i = 0;
        while (i < n) { // unque elements
            int curr = arr[i];
            count = 0;
            while (i < n && curr == arr[i]) { //all the occurance
                count++;
                i++;
            }
            if (count > 1) {
                System.out.println(curr + " " + count);
            }
        }
    }
}