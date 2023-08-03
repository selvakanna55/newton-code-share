package stack;


import java.util.Stack;

public class StackCollections {
    public static void main(String[] args) {
        // ArrayList<Ineteger> li = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(null);
        System.out.println(st.size());
        System.out.println(st.peek()); // peek -> without deleting want to see the delete -> arr[top]
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.size());
        st.clear();

    }
}

// abc -> ascii(s.charAt(i))
// bca -> 10