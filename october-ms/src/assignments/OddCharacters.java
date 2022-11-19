package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class OddCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int n = word.length();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) { // odd
                System.out.print(word.charAt(i - 1) + " ");
            }
        }
        // for(int i=0;i<n;i++){
        //     if(i%2==0){
        //         System.out.print(word.charAt(i)+" ");
        //     }
        // }
    }
}