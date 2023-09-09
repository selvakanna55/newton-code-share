package loop;


class NestedLoop {
    public static void main(String args[]) {
        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

//   int n = 10;
//         for(int i=1;i<=n;i++){
//             System.out.println("* * * * *");
//         }

//    for(int i=1;i<=5;i=i+1){
//        System.out.print(i+" ");
//    }
//    System.out.println();
