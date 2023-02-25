package conditions;

public class SwitchCase {
    public static void main(String args[]) {
        System.out.println("begin");
        int n = 2; // 1 2 3 4 ->
        switch (n) {
            case 1:  //if(n==1)
                System.out.println("ONE");
                break;
            case 2: //else if(n==2)
                System.out.println("TWO");
                break;
            case 3: // else if(n==3){
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            default: // else{
                System.out.println("invalid, enter n between 1 to 4");
                break;
        }
        System.out.println("end");
    }
}
