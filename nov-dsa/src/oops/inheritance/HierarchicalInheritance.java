package oops.inheritance;

class IphoneMobile extends Mobile {
    boolean findMyIphone() {
        System.out.println("iphone is found");
        return true;
    }

    void getEsimInfo() {
        System.out.println("esim is availale is slot2");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        IphoneMobile iphone = new IphoneMobile();
        iphone.call();
        iphone.message();
        iphone.getEsimInfo();
    }
}
