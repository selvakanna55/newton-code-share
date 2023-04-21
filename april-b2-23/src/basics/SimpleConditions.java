package basics;


class SimpleConditions {
    public static void main(String args[]) {
        //    const int a=10;
        System.out.println(true || false && true); // true
        System.out.println(true || false && false); // true
        System.out.println(false && false && true); // true
        System.out.println(10 | 5); // true
        System.out.println(10 == 5); //false
        System.out.println(!(10 == 5)); //true

    }
}