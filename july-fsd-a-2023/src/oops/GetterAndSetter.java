package oops;


public class GetterAndSetter {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void main(String[] args) {
        Studentt s1 = new Studentt();
        // s1.rollNo = 10;
        s1.setRollNo(99);
        System.out.println(s1.getRollNo());
    }
}

class Studentt {
    private int rollNo;

    public int getRollNo() { // getter function
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


}

// whatsapp status -> anyone can see, but cannot post on your name


// deposit money -> anyonce can add money, but cannot see your balance