package conditions;

public class SwitchOneTwoThree {

    public static void main(String args[]) {
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            default: //else
                System.out.println("not a valid number");
                break;
        }
    }
}