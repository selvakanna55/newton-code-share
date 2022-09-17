package corejava;

//SOLID principle
// single responsibility
//open for extension, close for modif
//Liskov subs ->
//In
//Dependency inversion
//class shap
//class rec extends shap
//class cir
//shape s =  new circle()
//s = new rec(); // eror

class KeyBoard {

}

class WiredKeyBoard extends KeyBoard {

}

class WirelessKeyBoard extends KeyBoard {

}

class Mouse {

}

class Computer {
    KeyBoard key;
    Mouse mou;

    Computer(KeyBoard keyboard) {
        key = keyboard;
        mou = new Mouse();
    }
}

public class DependencyInjection {
    public static void main(String[] args) {
//        Computer c = new Computer();
        Computer c1 = new Computer(new WirelessKeyBoard()); // wireless keyboar
        Computer c2 = new Computer(new WiredKeyBoard()); // wired keyboar
    }
}
