package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("START");

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr={23,43,5,6,0};

        try {
            System.out.println(10/arr[num]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Occurred");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Exception Occurred");
            e.printStackTrace();
        }catch(InputMismatchException e){
            System.out.println("xception Occurred");
            e.printStackTrace();
        }catch(Exception e){  //Always put the default Exception block at the end
            System.out.println("xception Occurred");
            e.printStackTrace();
        }
        System.out.println("END");
    }
}

// Throwable has 2 child i.e Error and Exception  //whatever bad things happen its because of throwable