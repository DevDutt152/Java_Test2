import java.util.*;


public class Searching {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 8, 10};
        int target = 2;
        int start = 0;
        int end = arr.length - 1;
        int index = -1;


        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                 index = mid;
                break;
            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;

            }

        }
        System.out.println(index);
    }
};
