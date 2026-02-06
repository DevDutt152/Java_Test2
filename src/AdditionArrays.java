import java.util.*;


public class AdditionArrays {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] M1 = new int [rows][cols];
        int[][] M2 = new int [rows][cols];
        int[][] sum = new int [rows][cols];

        for(int i=0 ; i<=rows ; i++) {
            for (int j = 0; j <= cols; j++) {
                M1[i][j] = sc.nextInt();

            }
        }
        for(int i=0 ; i<=rows ; i++){
            for (int j=0 ; j<=cols ; j++){
                M2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum: ");
        for (int i = 0 ; i<=rows ; i++){
            for (int j=0 ; j<=cols ; j++){
                sum[i][j] = M1[i][j] + M2[i][j];
            }
        }



    }
}
