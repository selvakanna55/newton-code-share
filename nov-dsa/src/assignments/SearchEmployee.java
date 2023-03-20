import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Hashing {
    String hashtable[];
    int size = 100001;

    Hashing() {
        hashtable = new String[size];
    }

    int hashFunciton(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i) - 'a');
            sum = sum + (word.charAt(i) - 'a');
        }
        return sum % size;
    }

    void add(String word) {
        int key = hashFunciton(word);
        System.out.println(key);
        int i = 0;
        while (i < size && hashtable[(key + i) % size] != null) {
            i++; // increase by 1, find next available slot
        }
        hashtable[(key + i) % size] = word;
    }

    void find(String word) {
        int key = hashFunciton(word);
        int i = 0;
        boolean ans = false;
        while (i < size && hashtable[(key + i) % size] != null) {
            String value = hashtable[(key + i) % size];
            if (word.equals(value)) {
                ans = true;
                break;
            }
            i++;
        }
        if (ans) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


}

class SearchEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hashing hs = new Hashing();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            hs.add(word);
            break;
        }
        String word = sc.next();
        hs.find(word);
    }
}