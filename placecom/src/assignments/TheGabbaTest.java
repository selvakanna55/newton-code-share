package assignments;

import java.util.Scanner;

//https://my.newtonschool.co/playground/code/gnrls3dl93ma/
class TheGabbaTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long players = input.nextInt();
        long amount = input.nextInt();
        long fixCotsPerPlayer = input.nextInt(); // fix cost per layer
        long sellPrice = input.nextInt(); // selling price of player

        long ans = 0;
        //    for(long i=1;i<=players;i++){
        //        long rem = players-i;
        //        if((i*fixCotsPerPlayer)<=amount+(sellPrice*rem)){
        //            ans = i;
        //        }else{
        //            break;
        //        }
        //    }

        long left = 0, right = players + 1;
        while (left <= right) {
            long mid = (left + right) / 2;
            long rem = players - mid;
            if ((mid * fixCotsPerPlayer) <= amount + (sellPrice * rem)) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(ans);
    }
}