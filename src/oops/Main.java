package oops;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        shapePolymorphism shape =  new shapePolymorphism();
        System.out.println(shape.area( 7));
        System.out.println(shape.area(4,6));
        System.out.println(shape.area(10,5.5f));
        System.out.println(shape.area(10,6));


    }
}