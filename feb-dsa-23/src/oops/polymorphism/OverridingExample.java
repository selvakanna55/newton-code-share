package oops.polymorphism;

class Pizza {
    void order() {
        System.out.println("plain pizza");
    }
}

class MixVegPizza extends Pizza {
    void order() {
        super.order();
        System.out.println("adding mix veg toppings");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        //scanner sc = new Scanner(System.in)
        MixVegPizza pizza = new MixVegPizza();
        pizza.order();
    }
}