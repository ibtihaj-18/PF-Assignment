public class Lab06 {

    public int[][] add(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] C = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public int[][] subtract(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] C = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }

    public int[][] transpose(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] T = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                T[j][i] = A[i][j];
            }
        }
        return T;
    }

    public boolean isSymmetric(int[][] A) {
        if (A.length != A[0].length) return false;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] != A[j][i]) return false;
            }
        }
        return true;
    }

    public int diagonalSum(int[][] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i][i];
        }
        return sum;
    }
}