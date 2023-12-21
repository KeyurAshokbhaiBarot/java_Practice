package data_Structures.Arrays;

public class FindMinimumInArray {
    public static void main(String[] args) {
        int[] arr = {-9, 6, 3, 0, -7, 7};
        System.out.println(minimumInArray(arr));

    }
    //Assume the length of the array is not equal to 0
    static int minimumInArray(int[] arr) {
        int ans = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < ans) {
                ans = arr[index];
            }
        }
        return ans;
    }
}
