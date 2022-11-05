import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// don't change the name of this class
// you can add inner classes if needed
class ABooleanMatrixProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] RC = br.readLine().split(" ");
            int row = Integer.parseInt(RC[0]);
            int col = Integer.parseInt(RC[1]);
            int A[][] = new int[row][col];
            String ones = "";
            String zeros = "";
            for (int i = 0; i < col; i++) {
                ones = ones + "1 ";
                zeros = zeros + "0 ";
            }
            for (int i = 0; i < row; i++) {
                String nums = br.readLine();
                if (nums.indexOf("1") == -1) {
                    System.out.println(zeros);
                } else {
                    System.out.println(ones);
                }
            }
        }
    }
}