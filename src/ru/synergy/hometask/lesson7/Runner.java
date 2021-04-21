package ru.synergy.hometask.lesson7;

public class Runner {
    public static void main(String[] args) {

        Robot r = new Robot("R2D2");
        Cat c = new Cat("Barsik");
        Human h = new Human("Oleg");

        Games[] track = new Games[]{
                new Treadmill(Treadmill.maxDistance),
                new Wall(Wall.maxWall)
        };

        Object[] sportsmen = new Object[]{r, c, h};

        for (Object elem : sportsmen) {
            if (elem instanceof Human) {
                for (Object round : track) {
                    if (round instanceof Treadmill) {
                        if (h.run >= ((Games) round).length) {
                            System.out.println(h.runner() + "дистанцию " + ((Games) round).length);
                        } else {
                            System.out.println("Человек: " + h.name + " не смог пробежать дистанцию" + ((Games) round).length);
                            break;
                        }
                    } else {
                        if (h.jump >= ((Games) round).height) {
                            System.out.println(h.jumper() + " на высоту " + ((Games) round).height);
                        } else {
                            System.out.println(h.jumper() + " и не смог перепрыгнуть высоту " + ((Games) round).height);
                            break;
                        }
                    }
                }
            }

            if (elem instanceof Cat) {
                for (Object round : track) {
                    if (round instanceof Treadmill) {
                        if (h.run >= ((Games) round).length) {
                            System.out.println(c.runner() + "дистанцию " + ((Games) round).length);
                        } else {
                            System.out.println("Кот: " + c.name + " не смог пробежать дистанцию" + ((Games) round).length);
                            break;
                        }
                    } else {
                        if (c.jump >= ((Games) round).height) {
                            System.out.println(c.jumper() + " на высоту " + ((Games) round).height);
                        } else {
                            System.out.println(c.jumper() + " и не смог перепрыгнуть высоту " + ((Games) round).height);
                            break;
                        }
                    }
                }
            }

            if (elem instanceof Robot) {
                for (Object round : track) {
                    if (round instanceof Treadmill) {
                        if (h.run >= ((Games) round).length) {
                            System.out.println(r.runner() + "дистанцию " + ((Games) round).length);
                        } else {
                            System.out.println("Робот: " + r.name + " не смог пробежать дистанцию" + ((Games) round).length);
                            break;
                        }
                    } else {
                        if (r.jump >= ((Games) round).height) {
                            System.out.println(r.jumper() + " на высоту " + ((Games) round).height);
                        } else {
                            System.out.println(r.jumper() + " и не смог перепрыгнуть высоту " + ((Games) round).height);
                            break;
                        }
                    }
                }
            }
        }
    }
}
