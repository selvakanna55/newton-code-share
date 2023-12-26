package hashing;


public class SimpleHashing {

    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 3, 100, 11, 111};

        int tableSize = 10000;
        int hashTable[] = new int[tableSize];

        for (int num : nums) {
            // arr[index] = value;
            hashTable[num] = num;
        }

        // search is O(1)
        System.out.println(hashTable[7] == 7 ? "YES" : "NO"); // check if 7 is there or not?
        System.out.println(hashTable[4] == 4 ? "YES" : "NO"); // check if 4 is there or not?
        System.out.println(hashTable[2] == 2 ? "YES" : "NO"); // check if 2 is there or not?

    }
}