import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {897, -2, 8, 89, 9};
        int i= 0 , j = arr.length-1;

        while ( i <= j ) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;


        }
        for (int k = 0; k <arr.length ; k++) {
            System.out.println(arr[k]);
        }


    }
};



