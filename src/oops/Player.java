package oops;

public class Player {
    String name;
    int age;
    int exp;
    int matchPlayed;


    public String imfo() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", exp=" + exp +
                ", matchPlayed=" + matchPlayed +
                '}';
    }

    public Player(String name, int age, int exp, int matchPlayed) {
        this.name = name;
        this.age = age;
        this.exp = exp;
        this.matchPlayed = matchPlayed;
    }
}
