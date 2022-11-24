package modulo;


class LinearProbingArray {
    int hashtable[];
    int size;

    LinearProbingArray(int n) {
        this.size = n;
        hashtable = new int[n];
    }

    int hashFunction(int num) {
        return num % size;
    }

    void insert(int num) {
        int idx = hashFunction(num);
        boolean inserted = false;
        for (int i = 0; i < size; i++) {
//            int index = (idx + i) % size;
            int index = (idx + (int) Math.pow(2, i)) % size;
            if (i == 0)
                index = idx;
            if (hashtable[index] == 0) {
                hashtable[index] = num;
                inserted = true;
                System.out.println(num + " is inserted at " + index);
                break;
            }
        }
        if (!inserted) {
            System.out.println("HashTable is full");
        }
    }

    void find(int num) {
        int idx = hashFunction(num);
        boolean found = false;
        for (int i = 0; i < size; i++) {
//            int index = (idx + i) % size;
            int index = (idx + (int) Math.pow(2, i)) % size;
            if (i == 0)
                index = idx;
            if (hashtable[index] == 0) break;
            if (hashtable[index] == num) {
                found = true;
                System.out.println(num + " is found at " + index);
                break;
            }
        }
        if (!found) {
            System.out.println(num + "is not present");
        }
    }
}

public class LinearProbing {
    public static void main(String[] args) {
        LinearProbingArray lp = new LinearProbingArray(7);
        lp.insert(60);
        lp.insert(40);
        lp.insert(47);
        lp.insert(54);
        lp.find(47);
        lp.find(61);
    }
}
