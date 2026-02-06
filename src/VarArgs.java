import java.util.*;

public class VarArgs {
    public static void main(String[] args){

        new VarArgs().callMe( 3,7);
    }

    private void callMe(int ... x){

        System.out.println(x.length);
    }
}
