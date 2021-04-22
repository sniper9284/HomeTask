package ru.synergy.hometask.lesson7;

public class Runner {
    public static void main(String[] args) {

        Robot r = new Robot("R2D2");
        Cat c = new Cat("Barsik");
        Human h = new Human("Oleg");
        Treadmill t = new Treadmill();
        Wall w = new Wall();

        Object[] track = new Object[]{t, w};

        Object[] sportsmen = new Object[]{r, c, h};

        for (Object elem : sportsmen) {
            if (elem instanceof Human) {
                for (Object block : track) {
                    if (block instanceof Treadmill) {
                        if (h.run >= t.distance) {
                            h.runner();
                            t.block();
                        } else {
                            h.runner();
                            t.fail();
                            break;
                        }
                    } else {
                        if (h.jump >= w.height) {
                            h.jamper();
                            w.block();
                        } else {
                            h.jamper();
                            w.fail();
                            break;
                        }
                    }
                }
            }


            if (elem instanceof Cat) {
                for (Object block : track) {
                    if (block instanceof Treadmill) {
                        if (c.run >= t.distance) {
                            c.runner();
                            t.block();
                        } else {
                            c.runner();
                            t.fail();
                            break;
                        }
                    } else {
                        if (c.jump >= w.height) {
                            c.jamper();
                            w.block();
                        } else {
                            c.jamper();
                            w.fail();
                            break;
                        }
                    }
                }
            }

            if (elem instanceof Robot) {
                for (Object block : track) {
                    if (block instanceof Treadmill) {
                        if (r.run >= t.distance) {
                            r.runner();
                            t.block();
                        } else {
                            r.runner();
                            t.fail();
                            break;
                        }
                    } else {
                        if (r.jump >= w.height) {
                            r.jamper();
                            w.block();
                        } else {
                            r.jamper();
                            w.fail();
                            break;
                        }
                    }
                }
            }
        }
    }
}
