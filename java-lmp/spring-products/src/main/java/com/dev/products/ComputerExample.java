package com.dev.products;

import org.springframework.beans.factory.annotation.Autowired;

abstract class KeyBoard {
    int keys = 120;
    boolean keyBoardLight = true;
}

// Wireless Keyboard is a KeyBoard
// Wired Keyboard is a KeyBoard
class WiredKeyBoard extends KeyBoard {
    double length = 3.5; //m
}

class WirelessKeyBoard extends KeyBoard {
    boolean isRechargable = true;
    boolean bluetoothSupport = false;
}

class Computer {
    KeyBoard keyBoard;

    Computer(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    double ram = 1024;
    double hardDisk = 4096;
}


public class ComputerExample {
    public static void main(String[] args) {
        Computer desktop1 = new Computer(new WirelessKeyBoard()); //wired (300)
        Computer desktop2 = new Computer(new WiredKeyBoard()); //wired (300)
//        desktop1.keyBoard = new WirelessKeyBoard();
        System.out.println(desktop1.ram);
        System.out.println(desktop1.hardDisk);
        System.out.println(desktop1.keyBoard.keys);
        System.out.println(desktop1.keyBoard.keyBoardLight);
    }
}
