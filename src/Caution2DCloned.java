import java.util.*;

public class Caution2DCloned {
    public  static void main(String[] args){

        int[][] mat = new int [3][2];
        mat[0][0] = 20;

        int[][] cloned = new int [mat.length][];
        for (int i=0; i< cloned.length;i++){
            cloned[i]  = mat[i].clone();
        }
    }
}
