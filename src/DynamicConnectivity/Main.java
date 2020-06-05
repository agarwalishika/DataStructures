package DynamicConnectivity;

public class Main {

    public static void main(String[] args) {
        // zero-indexed
        QuickFind qf = new QuickFind(10);

        qf.union(4, 3);
        qf.union(3, 8);
        qf.union(6, 5);
        qf.union(9, 4);
        qf.union(2, 1);

        System.out.println(qf.areConnected(8, 9));
        System.out.println(qf.areConnected(5, 0));

        qf.union(5, 0);
        qf.union(7, 2);
        qf.union(6, 1);

        System.out.println(qf.toString());

    }
}
