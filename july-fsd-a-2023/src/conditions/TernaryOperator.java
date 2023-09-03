package conditions;


class TernaryOperator {
    public static void main(String args[]) {
        int number1 = 22;
        int number2 = 10;
        if (number1 > number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
        // condition    ? true     : fasle
        int big = number1 > number2 ? number1 : number2;
        System.out.println(big);


        int a = 10;
        int b = 11;
        if (a == b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println(a == b ? "YES" : "NO");
        // ternary operator

    }
}


//    if(number==1){
//        System.out.println("ONE");
//    }else if(number==2){
//        System.out.println("TWO");
//    }else if(number==3){
//        System.out.println("THREE");
//    }else if(number==4){
//        System.out.println("FOUR");
//    }else{
//        System.out.println("number is not in the range of 1 to 4");
//    }