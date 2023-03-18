package string;

class StringBufferBuilderExample {
    public static void main(String args[]) {
        StringBuffer word = new StringBuffer(); // synchronized
        word.append("abcd"); //add at the end
        word.insert(2, "ok"); // insert in between
        word.append("r"); //add at the end
        String res = word.toString(); // convert StringBuilder to string
        System.out.println(word);
        word.setCharAt(5, 'z'); // arr[5] = 'z'
        System.out.println(word);
        word.reverse();
        System.out.println(word);
    }
}
