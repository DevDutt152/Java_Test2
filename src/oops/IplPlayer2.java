package oops;

public class  IplPlayer2 extends Player {

    int runs;
    int exp;
    int gender;

    public IplPlayer2(String name, int age, int exp, int matchPlayed,
                      int gender, int exp1, int runs) {
        super(name, age, exp, matchPlayed);
        this.gender = gender;
        this.exp = exp1;
        this.runs = runs;
    }

    void average(){
        System.out.println("Average: " +(runs/matchPlayed));
    }
}
