import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String url = "http://leetcode.com/problems";
        int idx = url.indexOf('/', 7);
        String hostName = (idx != -1) ? url.substring(0, idx) : url;
        System.out.println(hostName);
        System.out.println(Arrays.toString("".split(":", -1)));



    }
}   