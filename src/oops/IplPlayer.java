package oops;

public class IplPlayer {
String name;
int age;
int run;
int exp;
int jersyNum;
int matchPlayed;
boolean isAllrounder;

    public IplPlayer(String name, int age, int run, int exp, int jersyNum, int matchPlayed, boolean isAllrounder) {
        this.name = name;
        this.age = age;
        this.run = run;
        this.exp = exp;
        this.jersyNum = jersyNum;
        this.matchPlayed = matchPlayed;
        this.isAllrounder = isAllrounder;
    }


    void average(){
System.out.println("Average "+ (run/ matchPlayed));
};

    public String info() {
        return "IplPlayer{" +
                 "name='" + name + '\'' +
                ", age=" + age +
                ", run=" + run +
                ", exp=" + exp +
                ", jersyNum=" + jersyNum +
                ", matchPlayed=" + matchPlayed +
                ", isAllrounder=" + isAllrounder +
                '}';
    }
}
