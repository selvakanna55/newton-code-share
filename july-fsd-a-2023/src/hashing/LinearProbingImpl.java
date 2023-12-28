package hashing;

class LinearProbing {
    int hashTable[];
    int size;

    LinearProbing(int size) {
        this.size = size;
        hashTable = new int[size];
    }

    int hashFunction(int num) {
        // return num;
        return num % size;
    }

    void add(int num) {
        int index = hashFunction(num);
        boolean isInserted = false;
        for (int i = 0; i < size; i++) {
            int newIndex = (i + index) % size;
            if (hashTable[newIndex] == 0) {
                hashTable[newIndex] = num;
                isInserted = true;
                break;
            }
        }
        if (isInserted) {
            System.out.println(num + " is inserted successfully");
        } else {
            System.out.println(num + " is not inserted, Hashtable is full");
        }
    }

    void check(int num) {
        int index = hashFunction(num);
        boolean isPresent = false;
        for (int i = 0; i < size; i++) {
            int newIndex = (i + index) % size;
            if (hashTable[newIndex] == 0) {// empty stop -> not present
                break;
            } else if (hashTable[newIndex] == num) { // targte stop -> present
                isPresent = true;
                break;
            }
            // some other number, target may be present in future, continue...
        }
        if (isPresent) {
            System.out.println(num + " is present");
        } else {
            System.out.println(num + " is not present");
        }
    }
}

public class LinearProbingImpl {
    public static void main(String[] args) {
        LinearProbing h = new LinearProbing(10);
        // int nums[] = {88,91,20,98,30,99};
        int nums[] = {67, 77, 87, 22};
        for (int num : nums) {
            h.add(num);
        }
        // h.check(91);
        h.check(87);
        h.check(22);
        h.check(32);
    }
}