package input_output;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object creation

        String name = sc.next();
        int rollNo = sc.nextInt();
        long registerNo = sc.nextLong();
        double percentage = sc.nextDouble();
        float average = sc.nextFloat();
        boolean status = sc.nextBoolean();
        char gender = sc.next().charAt(0);
        byte data = sc.nextByte();
        short smallNum = sc.nextShort();

        System.out.println("name " + name);
        System.out.println("rollNo " + rollNo);
        System.out.println("registerNo " + registerNo);
        System.out.println("percentage " + percentage);
        System.out.println("average " + average);
        System.out.println("status " + status);
        System.out.println("gender " + gender);
        System.out.println("number " + data);


    }
}
