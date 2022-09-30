package design_patterns;

interface BasePizza {
    int getCost();
}

class FarmHouse implements BasePizza {
    @Override
    public int getCost() {
        return 20;
    }
}

class Margaritta implements BasePizza {
    @Override
    public int getCost() {
        return 20;
    }
}

abstract class Toppings implements BasePizza {
    BasePizza basePizza;

}

class CheeseToppings extends Toppings {

    CheeseToppings(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int getCost() {
        return basePizza.getCost() + 10;
    }
}

class MushroomToppings extends Toppings {
    BasePizza basePizza;

    MushroomToppings(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int getCost() {
        return basePizza.getCost() + 15;
    }
}


public class DecoratorMain {
    public static void main(String[] args) {
        int a = 10, b = 3;
        StringBuffer x = new StringBuffer();
        x.append(a/b);
        x.append('.');

//        Margaritta m = new Margaritta();
//        System.out.println(new CheeseToppings(new MushroomToppings(new CheeseToppings(m))).getCost());
    }
}
