import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        sc.close();

        char[] arr = str1.toCharArray();
        char[] arr1 = str2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);
        boolean anagram = Arrays.equals(arr, arr1);
        //System.out.print(anagram);
        if (anagram) System.out.print("YES");
        else System.out.print("NO");

    }
}