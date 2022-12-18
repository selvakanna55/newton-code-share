package design_patterns;

import java.util.*;

interface ObservableInterface {
    void addObserver(ObserverInterface observer);

    void updateQty(int newQty);
}

interface ObserverInterface {
    void update(ObservableInterface oi, String message);

    void update(String message);
}

class User implements ObserverInterface {
    User(String name) {
        this.name = name;
    }

    String name;

    @Override
    public void update(ObservableInterface oi, String message) {
        System.out.println(name + " " + message);
    }

    @Override
    public void update(String message) {
        System.out.println(name + " " + message);
    }
}


class Product implements ObservableInterface {

    List<ObserverInterface> users = new ArrayList<>();
    int qty = 0;

    @Override
    public void addObserver(ObserverInterface observer) {
        users.add(observer);
    }

    @Override
    public void updateQty(int newQty) {
        if (qty == 0 && newQty > 0) {
            for (ObserverInterface user : users) {
                user.update("qty is available");
            }
        }
        qty += newQty;
    }
}

public class ObserverDesignPattern {
    public static void main(String[] args) {
        Product apple = new Product();
        apple.users.add(new User("a"));
        apple.users.add(new User("b"));
        apple.updateQty(20);
    }
}
