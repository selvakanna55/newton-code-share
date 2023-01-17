package hashing;

class HashingQuadraticProbing { //O(1) -> O(n)
    int hashtable[];
    int size;

    HashingQuadraticProbing(int size) {
        this.size = size;
        hashtable = new int[size];
    }

    int hashFunction(int num) {
        return num % size;
    }

    void add(int num) {
        int key = hashFunction(num);
        int i = 0;
        while (i < size && hashtable[(key + (int) Math.pow(2, i)) % size] != 0) {
            i++;
        }
        if (i < size) {
            hashtable[(key + (int) Math.pow(2, i)) % size] = num;
        } else {
            System.out.println("no space to insert");
        }
    }

    void search(int num) {
        int key = hashFunction(num);
        int i = 0;
        while (i < size && hashtable[(key + (int) Math.pow(2, i)) % size] != num) {
            if (hashtable[(key + (int) Math.pow(2, i)) % size] == 0) break;
            i++;
        }
        if (i >= size || hashtable[(key + i) % size] == 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}

public class HashingQuadraticProbingRun {
    public static void main(String[] args) {
        HashingQuadraticProbing hs = new HashingQuadraticProbing(7);
        hs.add(5);
        hs.add(26);
        hs.add(19);
        hs.search(26);
        hs.search(24);
    }
}
