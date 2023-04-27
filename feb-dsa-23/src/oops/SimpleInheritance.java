package oops;

class SimpleInheritance {
    public static void main(String args[]) {
        AndroidPhone redmi = new AndroidPhone();
        redmi.ram = 4;
        redmi.rom = 32;
        redmi.watchNetflix();
        redmi.callANumber(123456);

        KeypadPhone nokia1100 = new KeypadPhone();
        nokia1100.ram = 100;
        nokia1100.rom = 1;
        nokia1100.callANumber(123456);
        nokia1100.pressButton();
    }
}


class AndroidPhone extends Phone {
    void watchNetflix() {
        System.out.println("watching Netflix ");
    }
}


class KeypadPhone extends Phone {
    boolean keypad;

    void pressButton() {
        System.out.println("pressing keypad button");
    }
}

class Phone {
    int ram;
    int rom;

    void callANumber(long number) {
        System.out.println("calling " + number);
    }
}


