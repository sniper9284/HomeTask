package ru.synergy.hometask.lesson7;

public class Track implements CreateBlock {
    int dis;
    int h;
    String blockT;
    String failT;
    String blockW;
    String failW;

    Treadmill t = new Treadmill();
    Wall w = new Wall();

    @Override
    public void createBlock() {
        dis = t.distance;
        h = w.height;
        blockT = t.block();
        blockW = w.block();
        failT = t.fail();
        failW = w.fail();
    }
}
