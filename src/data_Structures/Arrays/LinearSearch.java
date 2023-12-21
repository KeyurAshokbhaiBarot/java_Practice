package data_Structures.Arrays;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = {1};
        int target = 6;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    //search for target element and return index of that element
    static int linearSearch(int[] arr, int target) {

        //check if arrray is an empty array
        if(arr.length == 0) {
            return -1;
        }
        //iterate the array to look for the target element
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        //if target element not found i the array
        return -2;
    }
}
