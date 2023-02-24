package contest2;

public class DownloadingTime {
    public static void main(String[] args) {
        int song = 60; // MB
        int internetSpeed = 40; //MbPS
        // 1 byte -> 8 bits
        System.out.println((song * 8) / internetSpeed);
    }
}
