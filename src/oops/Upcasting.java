package oops;
class Animal {
    boolean isExtinct;
    void eat() {
        System.out.println("this animal eats food");
    }
}
class Bird extends Animal {
    int wingSpan;

    void fly() {
        System.out.println("The bird is flying high");
    }

    public class Upcasting {
        public static void main(String[] args) {
            Bird b1 = new Bird();
            b1.eat();
            b1.fly();
            System.out.println(b1.wingSpan);
            System.out.println(b1.isExtinct);

            Animal a2 = b1; //while upcasting a2 will lose access to Bird specific properties and methods
            a2.eat();
            System.out.println(a2.isExtinct);

            Animal a3 = new Bird();
            //Downcasting is Explicit and is tricky
            //in downcasting performa a safety check using if then perform
            if (a3 instanceof Bird) {
                Bird myBird = (Bird) a3;
                myBird.fly();
                myBird.eat();
            } else {
                System.out.println("this animal cannot fly");
            }

        }
    }
}
