package assignments;

// implement classes here

class Animal {
    int legs;
    int brainSize;

    Animal(int legs, int brainSize) {
        this.legs = legs;
        this.brainSize = brainSize;
    }

    void sound() {
        System.out.println("which animal sound do you want?");
    }
}

class Lion extends Animal {
    Lion(int legs, int brainSize) {
        super(legs, brainSize);
    }

    void sound() {
        System.out.println("Lion roar!! roar! roar!!");
    }
}

class Goat extends Animal {
    Goat(int legs, int brainSize) {
        super(legs, brainSize);
    }

    void sound() {
        System.out.println("Goat baa! baa! baa!");
    }
}

class Cow extends Animal {
    Cow(int legs, int brainSize) {
        super(legs, brainSize);
    }

    void sound() {
        System.out.println("Cow moo moo");
    }
}

class Elephant extends Animal {
    Elephant(int legs, int brainSize) {
        super(legs, brainSize);
    }

    void sound() {
        System.out.println(super.legs);
        System.out.println("Elephant Pawoo! Pawoo!");
    }
}

