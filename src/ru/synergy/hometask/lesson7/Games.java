package ru.synergy.hometask.lesson7;

public abstract class Games {
    static int min = 0;
    static int maxL = 100;
    static int maxH = 10;
    public final static int maxDistance = min + (int) (Math.random() * maxL);
    public final static int maxWall = min + (int) (Math.random() * maxH);
    int length = maxDistance;
    int height = maxWall;
}
