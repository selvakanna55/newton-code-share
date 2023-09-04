package conditions;

public class IfElseAndSwitch {

    public static void main(String args[]) {
        int number = 2;

        if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else {
            System.out.println("number must be 1 ot 2");
        }

        switch (number) {
            case 1: // if(number==1){
                System.out.println("ONE");
                break; //}
            case 2: //  else if(number==2){
                System.out.println("TWO");
                break;
            default:
                System.out.println("number must be 1 ot 2");
                break;
        }
    }
}


