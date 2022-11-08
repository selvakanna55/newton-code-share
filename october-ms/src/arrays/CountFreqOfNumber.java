package arrays;

public class CountFreqOfNumber {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 4, 9, 4, 4};
        int n = arr.length;

        int num = 4;
        int count = 0;
        // i = i + 1;
        //i++ , ++i
        //i +=1;
        for (int i = 0; i < n; i++) {
            if (num == arr[i]) {
                count = count + 1;
            }
        }
        System.out.println(count);


    }
}
