package oops.inheritance;

import java.awt.*;

//https://media.geeksforgeeks.org/wp-content/cdn-uploads/Access-Modifiers-in-Java.png
class Mobile {
    String brandName;

    String model;
    String imei;

    Mobile() {
        System.out.println("mobile is created");
    }


    Mobile(String mobileBrandName, String mobileModel, String mobileIMEI) {
        brandName = mobileBrandName;
        imei = mobileIMEI;
        model = mobileModel;
    }

    int speaker = 2;

    void call() {
        System.out.println("calling someone");
    }

    void message() {
        System.out.println("messaging someone");
    }
}

class AndroidMobile extends Mobile { // android mobile IS A mobile
    boolean noiseCancellation = false;

    AndroidMobile() {
        super("redmi", "note", "12");
        System.out.println("android phone is created");
    }

    void takePhoto() {
        System.out.println(" clicking photo");
    }

    void videoCall() {
        System.out.println("doing video call");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        AndroidMobile ab = new AndroidMobile();
        ab.brandName = "MI";
        ab.model = "ok";
        ab.noiseCancellation = true;

//        ab.takePhoto();
//        ab.call();

    }
}
