package basics;


class BasicsProgram {
    public static void main(String args[]) {
//        datatype variablename = value;
        int rollNo = 10;
        String name = "Varun";
        char grade = 'C';
        float percentage = 77.5f;
        boolean isPlaced = true;

        long val1 = 10000000;
        byte num = 10;
        short val2 = 120;

        System.out.println("roll number: " + rollNo);
        System.out.println("name: " + name);
        System.out.println("grade " + grade);
        System.out.println("percentage: " + percentage);
        System.out.println("isPlaced :" + isPlaced);


        System.out.println(10 == 5); //false
        System.out.println((10 + 2) * 5); //
        System.out.println(10 == (20 / 2));
        System.out.println(2 < 8); //true
        System.out.println(2 > 8);//false


        System.out.println(10 / 3); //3
        System.out.println(10 % 3); //1

        System.out.println(10.0 / 3.0); //3.3333
        System.out.println(10.0 % 3.0); //1.0


        System.out.println(10 / 3.0); //3.3333
        System.out.println(10.0 / 3); //3.3333

        System.out.println("Hello world");
        System.out.println("newton school");
        System.out.println("Hi! How are You?");
        System.out.println(10 + 2);
        System.out.println(10 * 2);
        System.out.println(9 / 3);
        System.out.println(10 - 2);


    }
}


