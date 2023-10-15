package strings;


class CountFrequency {
    public static void main(String args[]) {
        int arr[] = new int[26]; //a to z
        String s = "ddb";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            arr[index] = arr[index] + 1;
        }
        // System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}

