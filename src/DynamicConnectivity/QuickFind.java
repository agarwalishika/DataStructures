package DynamicConnectivity;

public class QuickFind {
    int[] ids;

    QuickFind(int n){
        ids = new int[n];

        for (int i = 0; i < ids.length; i++) {
            ids[i] = i;
        }
    }

    void union(int n, int m){
        ids[n] = ids[m];
    }

    boolean areConnected(int n, int m){
        return ids[n] == ids[m];
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < ids.length; i++) {
            s += (i + ": " + ids[i] + ", ");
        }

        return s;
    }
}
