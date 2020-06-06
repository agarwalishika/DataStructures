package DynamicConnectivity;

public class QuickFind {
    private int[] ids;

    QuickFind(int n){
        ids = new int[n + 1];

        for (int i = 0; i < ids.length; i++) {
            ids[i] = i;
        }
    }

    void union(int n, int m){
        for (int i = 0; i < ids.length; i++){
            if (ids[i] == ids[n]){
                ids[i] = ids[m];
            }
        }
    }

    boolean areConnected(int n, int m){
        return ids[n] == ids[m];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < ids.length; i++) {
            s.append(i).append(": ").append(ids[i]).append(", ");
        }

        return s.toString();
    }
}
