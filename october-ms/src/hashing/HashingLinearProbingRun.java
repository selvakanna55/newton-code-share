package hashing;

class HashingLinearProbing { //O(1) -> O(n)
    int hashtable[];
    int size;

    HashingLinearProbing(int size) {
        this.size = size;
        hashtable = new int[size];
    }

    int hashFunction(int num) {
        return num % size;
    }

    void add(int num) {
        int key = hashFunction(num);
        int i = 0;
        while (i < size && hashtable[(key + i) % size] != 0) {
            i++;
        }
        if (i < size) {
            hashtable[(key + i) % size] = num;
        } else {
            System.out.println("no space to insert");
        }
    }

    void search(int num) {
        int key = hashFunction(num);
        int i = 0;
        while (i < size && hashtable[(key + i) % size] != num) {
            if (hashtable[(key + i) % size] == 0) break;
            i++;
        }
        if (i >= size || hashtable[(key + i) % size] == 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
//        if (hashtable[(key + i) % size] == num) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
    }
}

public class HashingLinearProbingRun {
    public static void main(String[] args) {
        HashingLinearProbing hs = new HashingLinearProbing(7);
        hs.add(5);
        hs.add(26);
        hs.add(19);
        hs.add(40);
        hs.add(9);
        hs.add(16);
        hs.add(18);
        hs.add(74);
        hs.search(40);
        hs.search(24);
        String s = "fn";
    }
}
