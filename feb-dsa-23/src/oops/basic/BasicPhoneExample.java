package oops.basic;


class Phone {
    int ram;
    int rom;
    double displaySize;

    Phone(int ramSize, int romSize, double phoneDisplay) {
        ram = ramSize;
        rom = romSize;
        displaySize = phoneDisplay;
    }

    void printPhoneInfo() {
        System.out.println(ram);
        System.out.println(rom);
        System.out.println(displaySize);
    }

}


class BasicPhoneExample {
    public static void main(String args[]) {
        Phone redmiNote4 = new Phone(4, 64, 4.5);
        redmiNote4.printPhoneInfo();

        Phone iphone10 = new Phone(4, 32, 7.5);
        iphone10.printPhoneInfo();

    }
}