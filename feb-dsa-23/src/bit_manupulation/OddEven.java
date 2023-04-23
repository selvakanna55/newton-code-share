package bit_manupulation;


class OddEven {
    public static void main(String args[]) {
        int num = 16;
        // if(num%2==0){
        if ((num & 1) == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}