import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class CountUniqueElements {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(is);
        int n = Integer.parseInt(r.readLine());
        String nums[] = r.readLine().split(" ");
        HashSet<String> map = new HashSet<>();
        for (int i = 0; i < n; i++) {
            map.add(nums[i]);
        }
        System.out.print(map.size());
    }
}

