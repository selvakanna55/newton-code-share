package oops.encapsulation.accessmodifer;

class SimpleA {
    public int m;
    private int n;
    protected int o;
    int p; //default

    void printAll() {
        System.out.println(m + " " + n + " " + o + " " + p);
    }

    int getN() { //getter
        return n;
    }

    void setN(int n) { //setter
        this.n = n;
    }
}

public class SameClassExample {
    public static void main(String[] args) {
        SimpleA obj = new SimpleA();
        obj.printAll();
        System.out.println(obj.m);
//        System.out.println(obj.n); //private
        System.out.println(obj.o);
        System.out.println(obj.p);
        obj.setN(10);
        System.out.println(obj.getN());
    }
}
