package oops.encapsulation;


class BankAccount1 {
    private String name;

    String getName() { // gives the value
        return name;
    }

    void setName(String acHolderName) { //assigns the value
        name = acHolderName;
    }


}

public class GetterSetter {
    public static void main(String[] args) {
        BankAccount1 b1 = new BankAccount1();
//        b1.name = "ok";
//        System.out.println(b1.name);
        b1.setName("Tarun"); //b1.name = "Tarun";
        System.out.println(b1.getName());
    }
}
