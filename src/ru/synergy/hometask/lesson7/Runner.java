package ru.synergy.hometask.lesson7;

public class Runner {
    public static void main(String[] args) {
        Sportsmen sportsmen = new Sportsmen();
        Track track = new Track();

        for (sportsmen.i = 1; sportsmen.i <= 3; sportsmen.i++) {
            sportsmen.setI(sportsmen.i);
            sportsmen.sport();
            track.createBlock();
            if (sportsmen.jump >= track.h) {
                System.out.println(sportsmen.resJump);
                System.out.println(track.blockW);
            } else {
                System.out.println(sportsmen.resJump);
                System.out.println(track.failW);
            }
            if (sportsmen.run >= track.dis) {
                System.out.println(sportsmen.resRun);
                System.out.println(track.blockT);
            } else {
                System.out.println(sportsmen.resRun);
                System.out.println(track.failT);
            }
            sportsmen.setI(sportsmen.i++);
        }
    }
}
