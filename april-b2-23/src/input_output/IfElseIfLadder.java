package input_output;


class IfElseIfLadder {
    public static void main(String args[]) {
        System.out.println("Begin");
        int num = 2;
        switch (num) {
            case 1: // num==1
                System.out.println("ONE");
                break;
            case 2:  // num==2
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            default: //else
                System.out.println("invalid input");
        }
//        switch (num) {
//            case 1: // if(num==1)
//                System.out.println("ONE");
//                break;
//            case 2: //if(num==2)
//                System.out.println("TWO");
//            case 3: //if(num==3)
//                System.out.println("THREE");
//                break;
//            case 4: //if(num==4)
//                System.out.println("FOUR");
//                break;
//            default: //else
//                System.out.println("invalid input");
//        }
        System.out.println("End");
    }
}


// if (num == 1) {
//         System.out.println("ONE");
//         } else if (num == 2) {
//         System.out.println("TWO");
//         } else if (num == 3) {
//         System.out.println("THREE");
//         } else if (num == 4) {
//         System.out.println("FOUR");
//         }else{
//            System.out.println("invalid input");
//
//                                }
//                                }

////logic operators ??
//&& -> all true
//// System.out.println(true && true && true); //true
//// System.out.println(true && false && true); //false
//// System.out.println(true && true && false); //false
//
//        || -> any one true
//        System.out.println( (2>1) || (3%2==1) || (4%2==1));  //true
//        System.out.println(false || true || false);  //true
//        System.out.println(false || false || false);  //false
//
//
//        System.out.println(!true); //false
//        System.out.println(!false); //true
//
//
//        !
//        true -> false
//        false -> true