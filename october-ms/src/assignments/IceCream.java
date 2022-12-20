package assignments;

public class IceCream {
    static void Icecreams(int N, int D) { //D is days, // N is ice
//        int day = 1;
//        while (day <= D) {
//            int eat = N / 2;
//            int remain = N - eat;
//            N = remain * 3;
//            day++;
//        }
         for(int day=1;day<=D;day++){
             int eat = N/2;
             int remain = N-eat;
             N = remain*3;
         }
        System.out.println(N);
    }
}
