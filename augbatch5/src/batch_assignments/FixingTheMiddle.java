package batch_assignments;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FixingTheMiddle {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            long n = Long.parseLong(read.readLine().trim());

            int numberOfBits = 1 + (int) Math.floor(Math.log(n) / Math.log(2)); //finding number of bits

            if (numberOfBits % 2 != 0) //if bits are odd
            {
                n = n ^ (1 << (numberOfBits / 2));
            } else //else if bits are even
            {
                n = n ^ (1 << (numberOfBits / 2));
                n = n ^ (1 << ((numberOfBits / 2) - 1));
            }
            System.out.println(n);
        }
    }
}