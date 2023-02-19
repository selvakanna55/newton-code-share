package input_output;

import java.util.Scanner;

class ScannerExample {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int rollNo = input.nextInt();
        long age = input.nextLong();
        float percentage = input.nextFloat();
        double average = input.nextDouble();
        boolean hadDinner = input.nextBoolean();
        char gender = input.next().charAt(0);
        byte data = input.nextByte();
        String studentName = input.next();

        System.out.println(rollNo);
        System.out.println(age);
        System.out.println(percentage);
        System.out.println(average);
        System.out.println(hadDinner);
        System.out.println(gender);
        System.out.println(data);
        System.out.println(studentName);
    }
}