package dynamicProgramming;

public class UniquePathObstacleLC63 {

    public static void main(String[] args) {

        int row = 4;
        int column = 5;
        int obRow = 2;
        int obColumn = 3;

        UniquePathLC62 path = new UniquePathLC62();

        /**
         * logic should be a big rectangle - production of 2 small rectangle
         */
        int res = path.getUniquePath(row,column) - path.getUniquePath(obRow,obColumn)*path.getUniquePath(row - obRow,column - obColumn);
        System.out.println(res);
    }
}
