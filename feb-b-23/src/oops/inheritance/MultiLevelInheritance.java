package oops.inheritance;

import java.lang.Object;


public class MultiLevelInheritance {
    public static void main(String args[]) {
        RedmiAndroidPhone redmiNote10 = new RedmiAndroidPhone();
        redmiNote10.call();
        redmiNote10.playCandyCrush();
        redmiNote10.miuiOS();
    }
}


class Phone1 {
    void call() {
        System.out.println("calling");
    }
}

class AndroidPhone1 extends Phone1 {
    void playCandyCrush() {
        System.out.println("playing candy crush");
    }
}

class RedmiAndroidPhone extends AndroidPhone1 {
    void miuiOS() {
        System.out.println("redmi phone os is running");
    }
}