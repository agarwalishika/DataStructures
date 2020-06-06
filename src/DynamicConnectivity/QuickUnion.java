package DynamicConnectivity;

public class QuickUnion {
    int[] ids;

    QuickUnion(int n){
        ids = new int[n + 1];

        for (int i = 0; i < ids.length; i++) {
            ids[i] = i;
        }
    }

    private int findRoot(int m){
        int root = ids[m];
        int i = m;
        while (i != root){
            i = root;
            root = ids[i];
        }

        return root;
    }

    void union(int n, int m){
        ids[n] = findRoot(m);
    }

    boolean areConnected(int n, int m){
        return findRoot(n) == findRoot(m);
    }
}
