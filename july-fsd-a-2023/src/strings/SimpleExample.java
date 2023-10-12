package strings;

class SimpleExample {
    public static void main(String args[]) {
        String name = "Apple";

        System.out.println(name);

        int n = name.length(); // arr.length

        for (int i = 0; i < n; i++) {
            System.out.print(name.charAt(i) + " "); //arr[i]
        }
        // String -> Set of characters
    }
}