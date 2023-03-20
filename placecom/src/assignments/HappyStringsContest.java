package assignments;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HappyStringsContest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        int start = 0;
        int end = n;
        int happy = 0;
        for (int i = 0; i < n; i++) {
            String input1 = br.readLine();
            if (check(input1)) {

                happy++;
                arr[start] = input1;
                start++;
            } else {
                end--;
                arr[end] = input1;
            }
        }
        long unhappy = n - end;
        long count = (happy * (happy + unhappy) + (unhappy * happy));

        int startletter[] = new int[26];
        int endletter[] = new int[26];
        for (int i = end; i < n; i++) {
            char startChar = arr[i].charAt(0);
            char lastChar = arr[i].charAt(arr[i].length() - 1);
            startletter[startChar - 'a']++;
            endletter[lastChar - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            int occur = 0;
            for (int j = 0; j < i; j++) {
                occur += endletter[j];
            }
            count += startletter[i] * occur;
        }

        System.out.println(count);
    }

    static boolean check(String str) {
        int least = (str.charAt(0) - 'a');
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch - 'a') < least) {
                least = (ch - 'a');
            } else if ((ch - 'a') > least) return true;
        }
        return false;
    }
}