package oops;

abstract class Bank { // Bank class is blueprint for all bank
    abstract int getInterest(); //enforce all children must have this function

}

class StateBank extends Bank {
    int getInterest() {
        return 10;
    }
}


class AbstractClasses {
    public static void main(String args[]) {
        StateBank sb = new StateBank();
        System.out.println(sb.getInterest());
    }
}
