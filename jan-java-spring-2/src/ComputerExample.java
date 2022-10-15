import java.security.Key;

class KeyBoard {
    String getKeyBoardType() {
        return "Normal keyboard";
    }
}

class WiredKeyBoard extends KeyBoard {
    String getKeyBoardType() {
        return "Wired keyboard";
    }
}

class WirelessKeyBoard extends KeyBoard {
    String getKeyBoardType() {
        return "Wireless keyboard";
    }
}


class Computer {
    KeyBoard keyboard;
    Computer(KeyBoard wirelessKeyBoard) {
//        this.keyboard = new WirelessKeyBoard();
        this.keyboard = wirelessKeyBoard; // give this choice to the user
    }
}

public class ComputerExample {
    public static void main(String[] args) {
        KeyBoard wirelessKeyBoard = new WirelessKeyBoard();
        Computer c1 = new Computer(wirelessKeyBoard);
        System.out.println(c1.keyboard.getKeyBoardType());


        KeyBoard wiredKeyBoard = new WirelessKeyBoard();
        Computer c2 = new Computer(wiredKeyBoard);
        System.out.println(c2.keyboard.getKeyBoardType());

        // wired keyboard
        // wireless keyboard
    }
}
