import java.util.*;
public class Student {

    int id;
    String name;
    static String collegeName;

    static {
        System.out.println("Staic 1 block executed");
        collegeName = "iit";
    }

    {
        System.out.println("Normal Block 1");
    }

    static {
        System.out.println("static 2 block executed");
    }

    {
        System.out.println("Normal Block 2");
    }

    static {
        System.out.println("static 3 block execueted");
    }

    public static void main(String[] args) {
        System.out.println("Normal Block1: ");
    }
}

