package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class WeekName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 5;
        switch (day) {
            case 1: //if(day==1)
                System.out.println("Monday");
                break;
            case 2: //}else if(day==2){
                System.out.println("Tuesday");
                break;
            case 3: //}else if(day==3){
                System.out.println("Wednesday");
                break;
            case 4: //}else if(dy==4){
                System.out.println("Thursday");
                break;
            case 5: //}else if(day==5){
                System.out.println("Friday");
                break;
            case 6: //}else if(day==6){
                System.out.println("Saturday");
                break;
            case 7: //}else if(day==7){
                System.out.println("Sunday");
                break;

        }
    }

}
