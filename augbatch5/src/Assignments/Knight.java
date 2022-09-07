package Assignments;

public class Knight {
    public static boolean isValid(int X, int Y){
        System.out.println(X+" "+Y);
        if(X>=1 && X<=8 && Y>=1 && Y<=8){
            return true;
        }else{
            return false;
        }
    }
    static int Knight(int X, int Y){
        int count = 0;
        if(isValid(X-1, Y-2)) count++;
        if(isValid(X-2, Y-1)) count++;

        if(isValid(X-2, Y+1)) count++;
        if(isValid(X-1, Y+2)) count++;


        if(isValid(X+1, Y+2)) count++;
        if(isValid(X+2, Y+1)) count++;

        if(isValid(X+2, Y-1)) count++;
        if(isValid(X+1, Y-2)) count++;

        return count;


    }
}
