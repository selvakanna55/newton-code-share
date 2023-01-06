package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MohanAndHisHostelRooms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {
            int rollNo = sc.nextInt();
            int gender = sc.next().charAt(0);

            if (rollNo % 2 == 0) System.out.print("PAPUM");
            else System.out.print("LOHIT");

            if (gender == 'G') System.out.println(" U");
            else System.out.println(" L");
            T--;
        }
    }
}