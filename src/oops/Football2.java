package oops;

public class Football2 extends Player{


    //chlid of player class//

    int jersyNum;
    boolean isAllrounderl;
    boolean isCaptain;

    public Football2(String name, int age, int exp, int matchPlayed,
                     int jersyNum, boolean isAllrounderl, boolean isCaptain)
    {
        super(name, age, exp, matchPlayed);
        this.jersyNum = jersyNum;
        this.isAllrounderl = isAllrounderl;
        this.isCaptain = isCaptain;
    }
}
