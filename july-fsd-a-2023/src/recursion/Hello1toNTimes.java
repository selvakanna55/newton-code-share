package recursion;


// don't change the name of this class
// you can add inner classes if needed
class Hello1toNTimes {
    public static void hello(int i) {
        if (i < 3) {
            System.out.println("Hello");
            hello(i + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Start");
        hello(0);
        System.out.println("End");
    }
}


// while(i<3){
//     System.out.println("Hello");
//     i++;
// }