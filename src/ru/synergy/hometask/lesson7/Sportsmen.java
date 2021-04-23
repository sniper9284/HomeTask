package ru.synergy.hometask.lesson7;

public class Sportsmen implements CreateSportsmen {
    int i;
    int jump;
    int run;
    String resJump;
    String resRun;
    Human h = new Human("Oleg");
    Cat c = new Cat("Barsik");
    Robot r = new Robot("R2D2");

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void sport() {
        if (i == 1) {
            jump = h.jump;
            run = h.run;
            resJump = h.jamper();
            resRun = h.runner();
        } else if (i == 2) {
            jump = r.jump;
            run = r.run;
            resJump = r.jamper();
            resRun = r.runner();
        } else if (i == 3) {
            jump = c.jump;
            run = c.run;
            resJump = c.jamper();
            resRun = c.runner();
        }
    }
}

