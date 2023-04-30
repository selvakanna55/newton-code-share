package oops.static_example;


class StaticInSameClass {
    // public static void printHello(){
    public void printHello() {
        System.out.println("hello ");
    }

    public static void printOk() {
        System.out.println("Ok ");
    }

    public static void main(String args[]) {
        // Student s1 = new Student();
        StaticInSameClass obj = new StaticInSameClass();
        obj.printHello();
        printOk();
    }
}

