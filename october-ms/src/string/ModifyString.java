package string;

// StringBuffer -> modify
// StringBuilder -> modify
// String -> cannot modified
public class ModifyString {
    public static void main(String[] args) {
        String name = "abcd";
        StringBuffer sb = new StringBuffer(name);
        System.out.println(sb);
        sb.append(" mnop"); // add at the end
        sb.setCharAt(1, '$'); // arr[1] = 'X'
        System.out.println(sb);
        sb.insert(2, "HAI ");
        System.out.println(sb);
        System.out.println(sb.indexOf("HAI"));
        sb.reverse();
        System.out.println(sb);
    }
}
