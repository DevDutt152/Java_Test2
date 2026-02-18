package Test3;
import java.util.Scanner;

public class MinMaxArrays {

    public static void findMinMax(int[] numbers){
        if(numbers==null || numbers.length == 0 ){
            System.out.println("error");
        }

        int Min = numbers[0];
        int Max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < Min) {
                    Min = numbers[i];
                }
                if (numbers[i] > Max) {
                    Max = numbers[i];
                }
            }
            System.out.println("min: " + Min + " Max: "+ Max);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<= 0){
            System.out.println("array does not exist");
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findMinMax(arr);
    }
}





