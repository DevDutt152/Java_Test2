package test;

import java.util.Scanner;

public class SecondLargestArray {
    public static int findSecondLargest(int[] arr){
        int largest = -1;
        int secondlargest = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }
        }
        return secondlargest;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0 ; i< a ; i++){
            arr[i] = sc.nextInt();
        }
        int output = findSecondLargest(arr);
        System.out.println("2nd largest:  " + output );
    }
}
