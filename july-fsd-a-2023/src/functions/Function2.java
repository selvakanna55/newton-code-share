package functions;

public class Function2 {
    public static void main(String[] args) {

        String name = printFullName("Varun", "Kumar");
        System.out.println(name);

        String name1 = printFullName("Raj", "Charan");
        System.out.println(name1);


        System.out.println("end");
    }

    public static String printFullName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return fullName;
    }


    public static int addNumbers() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        return sum;
    }


    // public static returnType  function name
    public static void addTwoNumber() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
    }


}
