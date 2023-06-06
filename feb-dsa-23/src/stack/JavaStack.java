package stack;


import java.util.Stack;

public class JavaStack {
    public static void main(String args[]) {
        // ArrayList<Integer> listaa = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println("size " + st.size());
    }
}