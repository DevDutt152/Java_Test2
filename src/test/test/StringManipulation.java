package test;
import java.util.*;

public class StringManipulation {
    public static void manipulateString(int n, String str) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        str = sc.nextLine();
        String output = "";
        for (int i = 0; i < n; i++) {
            output += str;
        }
        output = output.toUpperCase();
        System.out.println(output);
        System.out.println("Legth:" + output.length());
    }
    public static void main(String[] args) {
        manipulateString(0, "");
    }
}
