package oops;

public class Incapsulation {

    int roll;
    String name;

    public Incapsulation(int roll,String name){

        this.roll = roll;
        this.name = name;

    }

    String info(){
        return "Student(" +
                "roll="+roll +
                ",name='" + name + '\'' +
                '}';
    }
}
