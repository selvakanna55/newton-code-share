package assignments;

public class SarasPhone {
    static int Phone(int N, int K, int M) {
        int totalMemory = N * K;
        if (M > totalMemory) {
            return -1; // not possible
        }
        int div = M / K; //3
        if (M % K != 0) {
            div++;
        }
        return div;
    }
}
// 4 -> 12MB - 1
// 3 -> 9MB - 10MB

//10 3 10
//        10apps 3MB per app size of the new APP
//
//
//// 1 app need 3MB
//// 10 APP needs 10*3 = 30MB
//
//
//        1->3
//        2->6
//        3->9(1)
//        4->12