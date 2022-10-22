package conditions;


class ControlStatements {
    public static void main(String args[]) {
        // int n = 10;
        // for(int i=1;i<=n;i++){
        //     if(i%2==0){ // 4%2=0 (0==0)
        //         System.out.println("*");
        //     }
        //     System.out.println(i);
        // }
        // 1-> ONE
        // 2 -> TWO
        // 3 -> three
        // 4- >four
        // if else ladder
        //  if(num==1){
        //     System.out.println("ONE");
        // }else if(num==2){
        //     System.out.println("TWO");
        // }else if(num==3){
        //     System.out.println("THREE");
        // }else{
        //     System.out.println("No answer");
        // }
        int num = 2;


        // switch(num){
        //     case 1: //if(num==1)
        //         System.out.println("ONE");
        //         break;
        //     case 2: //if(num==2)
        //         System.out.println("TWO");
        //         break;
        //     case 3: //if(num==3)
        //         System.out.println("THREE");
        //         break;
        //     default:
        //         System.out.println("No answer");
        // }
        // for(int i=1;i<99;i++){
        //     if(i%11==0){
        //         break; // is stopping the for loop
        //     }
        //     System.out.println(i);
        // }


        // print yes
        // if num is multiple of 7 yes hello
        // if num is multiple of 20 yes hello
        // otherwose print no

        int nunumberrr = 21;
        if (nunumberrr % 7 == 0 || nunumberrr % 20 == 0) {
            System.out.println("YES");
            System.out.println("hello");
        } else {
            System.out.println("NO");
        }


        System.out.println("end");


        // print yes if number is divisible by 2 and 5
        // 10 -> yes 2*5, 5*2
        // 12 -> No
        // 11 -> no
        // 30 -> yes 15*2  6*5
        // int num = 30;
        // if(num%2==0 && num%5==0){
        //     System.out.println("yes");
        // }else{
        //     System.out.println("no");
        // }

        // && -> both
    }
}


// int n = 4;
//         for(int row=1;row<=n;row++){
//             for(int col=1;col<=row;col++){
//                 System.out.print(col+" ");
//             }
//             System.out.println();
//         }