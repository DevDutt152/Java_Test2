package ExceptionHandling;

import java.util.Scanner;

public class TryCatchCode {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {


            try {
                Thread.sleep(500);

            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }finally{
                System.out.println("finally block executed");
                sc.close();
            }
        }


    }
}

