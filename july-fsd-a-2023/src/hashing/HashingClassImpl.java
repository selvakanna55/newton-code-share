package hashing;


class Hashing {
    int hashTable[];
    int size;

    Hashing(int size) {
        this.size = size;
        hashTable = new int[size];
    }


    int hashFunction(int num) {
        // return num;
        return num % size;
    }

    void add(int num) {
        int index = hashFunction(num);
        hashTable[index] = num;
    }

    void check(int num) {
        int index = hashFunction(num);
        if (hashTable[index] == num) {
            System.out.println(num + " is present");
        } else {
            System.out.println(num + " is not present");
        }
    }
}

public class HashingClassImpl {
    public static void main(String[] args) {
        Hashing h = new Hashing(9);

        int nums[] = {8, 2, 6, 9, 10};
        for (int num : nums) {
            h.add(num);
        }
        h.check(7);
        h.check(10);
    }
}