package assignments;

public class Multiplication {
    static int Multiply_by_recursion(int M, int N) {
        if (N == 0) {
            return 0;
        }
        int sum = M + Multiply_by_recursion(M, N - 1);
        return sum;
    }
//  int sum = 0;
//   for(int i=1;i<=N;i++){
//     sum = sum+M;
//   }
//   return sum;
}
