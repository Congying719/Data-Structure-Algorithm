package dynamicProgramming;

public class UniquePathLC62 {

    public static void main(String[] args) {
        System.out.println(getUniquePath(3,7)); // 28
        System.out.println(getUniquePath(2,3)); // 3
    }

    public static int getUniquePath( int row, int column) {
        int[][] paths = new int[row][column];
        for (int i = 1;i < row ;i++) {
            paths[i][0] = 1;
        }
        for (int j = 1;j < column ;j++) {
            paths[0][j] = 1;
        }

        for (int i = 1;i < row;i++) {
            for (int j = 1;j < column;j++) {
                paths[i][j] = paths[i-1][j] + paths[i][j-1];
            }
        }
        return paths[row-1][column-1];
    }
}
