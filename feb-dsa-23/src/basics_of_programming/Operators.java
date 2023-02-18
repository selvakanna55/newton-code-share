package basics_of_programming;

class Operators {
    public static void main(String args[]) {
        // print and println
        int a = 10;
        int b = 11;
        System.out.println(a + " ");
        System.out.println(b + " ");
        System.out.println(a + " " + b + " values are ");
        System.out.println("Value of a is " + a + " how are you? " + b);


        // equality compare
        System.out.println(10 == 10);//true
        System.out.println(20 == 10);// false
        System.out.println(20 != 10);// true
        System.out.println(20 != 20);// false

        //less than, greater than
        System.out.println(10 < 14);
        System.out.println(10 > 88);


        int num1 = 20;
        // add 20
        num1 = num1 + 20;
        num1 += 20;
        System.out.println(num1);

        System.out.println(20 / 3); // -> 3
        System.out.println(20 % 3); // 1


        int sub1 = 80;
        int sub2 = 90;
        int sub3 = 80;
        int sub4 = 99;
        int sub5 = 77;
        // average?
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double fractionTotal = (double) total;
        double average = fractionTotal / 5.0;
        System.out.println(average);

        // arithmetic
        a = 20;
        System.out.println(a);
        a = a + 20;
        System.out.println(a);
        a = a * 2;
        System.out.println(a);
        a = a / 2;
        System.out.println(a);
        a = a - 1;
        System.out.println(a);


        int x = 10;
        int y = ++x;
        int z = x++;
        System.out.println(x + " " + y + " " + z);
    }
}

