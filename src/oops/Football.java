package oops;

public class Football {
    String name;
    int age;
    int goal;
    int jersyNo;
    int exp;
    int matchPlayed;
    int isCaptain;

    public Football(int isCaptain, int matchPlayed, int exp, int jersyNo, int goal, int age, String name) {
        this.isCaptain = isCaptain;
        this.matchPlayed = matchPlayed;
        this.exp = exp;
        this.jersyNo = jersyNo;
        this.goal = goal;
        this.age = age;
        this.name = name;
    }
    void average(){
        System.out.println("Average " + (goal/exp));
    }


    public String info() {
        return "Football{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", goal=" + goal +
                ", jersyNo=" + jersyNo +
                ", exp=" + exp +
                ", matchPlayed=" + matchPlayed +
                ", isCaptain=" + isCaptain +
                '}';
    }
}
