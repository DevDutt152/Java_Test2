import java.util.*;
//XOR logic
public class MissingNaturalNumber {

    public static void main(String[] args){
 int[] arr = {1 ,3 , 2 , 4};
 int n = 5 ;
 int ans = 0;
 for (int i = 1 ; i<=5 ; i++){
     ans ^= i ;

 }
 for (int i = 0; i < arr.length ; i++) {
     ans ^= arr[i];
 }
 System.out.println(ans);

    }
}
