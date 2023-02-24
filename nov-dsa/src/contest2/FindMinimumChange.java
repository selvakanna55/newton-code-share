package contest2;

public class FindMinimumChange {
    public static void main(String[] args) {
        int amount = 991;
        int arr[] = {40, 200, 500};
        System.out.println(arr.length);
        for (int i = arr.length - 1; i >= 0; i--) {
            int currNotes = amount / arr[i];
            amount = amount - (currNotes * arr[i]);
//            System.out.println(currNotes + " " + arr[i]);
        }
        System.out.println(arr[0] - amount);
    }
}
