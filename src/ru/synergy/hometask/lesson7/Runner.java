package ru.synergy.hometask.lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        Treadmill t = new Treadmill();
        Wall w = new Wall();
        Robot r = new Robot("R2D2");
        Cat c = new Cat("Barsik");
        Human h = new Human("Oleg");

        Object[] sportsmen = new Object[3];
        sportsmen[0] = r;
        sportsmen[1] = c;
        sportsmen[2] = h;

        int[] obstacle = new int[2];
        obstacle[0] = t.getD();
        obstacle[1] = w.getH();

        for (int i=0; i < obstacle.length; i++) {
            if (sportsmen[i].equals() < w.getH()) {
                System.out.println(sportsmen[i] + " не перепрыгнул стену");
            } else {
                System.out.println(r.jumper() + " перепрыгнул стену");
                if (r.getRun() < distance) {
                    System.out.println(r.runner() + " не добежал до финиша");
                } else {
                    System.out.println(r.runner() + " добежал до финиша");
                }
            }
        }

        System.out.println();
    }
}
