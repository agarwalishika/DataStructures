package DynamicConnectivity;

public class Main {

    public static void main(String[] args) {
        quickFindTest();
        //quickUnionTest();

    }

    public static void quickFindTest(){
        // zero-indexed
        QuickFind qf = new QuickFind(10);

        qf.union(4, 3);
        qf.union(8, 3);
        qf.union(6, 5);
        qf.union(9, 4);
        qf.union(2, 1);

        System.out.println(qf.areConnected(9, 8));
        System.out.println(qf.areConnected(5, 0));

        qf.union(5, 0);
        qf.union(7, 2);
        qf.union(6, 1);

        System.out.println(qf.toString());
    }

    public static void quickUnionTest(){
        QuickUnion qu = new QuickUnion(9);

        qu.union(3, 4);
        qu.union(3, 8);
        qu.union(6, 5);
        qu.union(9, 4);
        qu.union(2, 1);

        System.out.println(qu.areConnected(9, 8));
    }
}
