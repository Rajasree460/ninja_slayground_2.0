import java.util.*;

public class Solution {
    public static int[] spiralMatrix(int[][] MATRIX) {
        if (MATRIX == null || MATRIX.length == 0 || MATRIX[0].length == 0) {
            return new int[0]; 
        }

        int rows = MATRIX.length;
        int cols = MATRIX[0].length;
        int[] result = new int[rows * cols];
        int index = 0;

        
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
           
            for (int i = left; i <= right; i++) {
                result[index++] = MATRIX[top][i];
            }
            top++; 

          
            for (int i = top; i <= bottom; i++) {
                result[index++] = MATRIX[i][right];
            }
            right--;

         
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[index++] = MATRIX[bottom][i];
                }
                bottom--; 
            }

         
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[index++] = MATRIX[i][left];
                }
                left++; 
            }
        }

        return result;
    }

}
