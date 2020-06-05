package DynamicConnectivity;

public class QuickFind {
    int[] idNums;

    QuickFind(int n){
        idNums = new int[n];

        for (int i = 0; i < idNums.length; i++) {
            idNums[i] = i;
        }
    }

    void union(int n, int m){
        idNums[n] = idNums[m];
    }

    boolean areConnected(int n, int m){
        return idNums[n] == idNums[m];
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < idNums.length; i++) {
            s += (i + ": " + idNums[i] + ", ");
        }

        return s;
    }
}
