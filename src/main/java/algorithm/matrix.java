package algorithm;

import java.util.Arrays;

//旋转矩阵
public class matrix {

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - i - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = { {0, 0, 0},
                        {0, 1, 0},
                        {1, 1, 1}};
        rotate(mat);
        System.out.println(Arrays.deepToString(mat));
    }
}
