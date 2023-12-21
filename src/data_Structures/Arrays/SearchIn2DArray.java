package data_Structures.Arrays;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 55, 6, 7},
                {8, 9, 10, 11, 12},
        };
        int target = 20;
//        int[] ans = searchIn2DArray(arr, target);
//        System.out.println(Arrays.toString(ans));
        System.out.println(searchMaxIn2DArray(arr));
    }

    static int[] searchIn2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    //Find maximum value in a 2D array
    static int searchMaxIn2DArray(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
