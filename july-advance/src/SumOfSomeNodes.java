
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SumOfSomeNodes {
    static void dfs(int source, ArrayList<Integer>[] adj, int ans[], int parent, int k, int pRes) {
        int childCount = adj[source].size();
        if (source != 1) childCount--;
        if (childCount >= k)
            pRes += source; //source
        for (int node : adj[source]) {
            if (node == parent) continue;
            dfs(node, adj, ans, source, k, pRes);
        }
        ans[source] = pRes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans[] = new int[n + 1];
        ArrayList<Integer>[] adj = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            try {
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj[u].add(v);
                adj[v].add(u);
            } catch (NoSuchElementException e) {
            }
        }
        // ans[1] =1;
        dfs(1, adj, ans, 0, k, 0);
        for (int i = 1; i <= n; i++) {
            System.out.println(ans[i]);
        }
    }
}