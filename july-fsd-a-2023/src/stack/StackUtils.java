package stack;

import java.util.Stack;

public class StackUtils {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.pop());

        System.out.println(st.isEmpty());
        System.out.println(st.size());
    }
}
