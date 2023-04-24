package input_output;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReadExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        double percentage = Double.parseDouble(br.readLine());
        int rollNo = Integer.parseInt(br.readLine());
        char gender = br.readLine().charAt(0);

        System.out.println("name: " + name);
        System.out.println("percentage: " + percentage);
        System.out.println("rollNo: " + rollNo);
        System.out.println("gender: " + gender);

    }
}