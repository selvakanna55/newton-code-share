package string;

public class StringPoolHeap {
    void immutable() {
        int arr[] = {1, 2, 3};
        System.out.println(arr[0]);
        arr[0] = 1100;
        System.out.println(arr[0]);

        String name = "newton";
        String name2 = name.replace('n', 'N');

        System.out.println(name);
        System.out.println(name2);
    }

    public static void main(String[] args) {
        String name1 = "Cat";
        String name2 = "Cat";
        String name3 = new String("Cat");
        System.out.println(name1 == name2); // true
        System.out.println(name1 == name3); //false
        System.out.println(name1.equals(name3)); //false


    }
}
