package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class HashingLinearProbing { //O(1) -> O(n)
    String hashtable[];
    int size;

    HashingLinearProbing(int size) {
        this.size = size;
        hashtable = new String[size];
    }

    int hashFunction(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            sum += word.charAt(i) - 'a';
        }
        return sum % size;
    }

    void add(String word) {
        int key = hashFunction(word);

        int i = 0;
        while (i < size && hashtable[(key + i) % size] != null) {
            i++;
        }

        if (i < size) {
            hashtable[(key + i) % size] = word;
        } else {
            System.out.println("no space to insert");
        }
    }

    void search(String word) {
        int key = hashFunction(word);
        int i = 0;
        while (i < size && hashtable[(key + i) % size] != null && !hashtable[(key + i) % size].equals(word)) {
            if (hashtable[(key + i) % size] == null) break;
            i++;
        }
        if (i >= size || hashtable[(key + i) % size] == null) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}

public class SearchEmployee {

    public static void main(String[] args) {
        HashingLinearProbing hs = new HashingLinearProbing((int) 1e6);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            hs.add(word);
        }
        String word = sc.next();
        hs.search(word);
    }
}