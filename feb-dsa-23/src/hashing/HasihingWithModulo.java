package hashing;


class HasihingWithModulo {
    public static int hashFunction(int num) { // romm assigning software
        int tableLength = 8;
        return num % tableLength;
    }

    public static void main(String args[]) {
        int arr[] = {16, 24}; // students
        int n = arr.length;
        int tableLength = 8;
        int table[] = new int[tableLength]; //rooms

        for (int i = 0; i < n; i++) { // assign values
            table[hashFunction(arr[i])] = arr[i];
        }

        //searching
        System.out.println(table[hashFunction(16)] == 16); // wrong answer
        System.out.println(table[hashFunction(24)] == 24);


    }
}
// beyond size of the table, then array index out of bound exception