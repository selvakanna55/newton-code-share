package stack;

import java.util.*;

public class StackJava {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>(); // no need mention size
        Stack<Integer> st = new Stack<>(); // no need mention size
        st.push(10);
        st.push(20);
        st.push(30);
        st.pop();
        System.out.println(st.pop()); // remove top
        System.out.println(st.peek()); // without removal who is top?
    }
}
