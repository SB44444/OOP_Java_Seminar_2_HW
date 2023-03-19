package seminar2.child;

import seminar2.parent.Animal;
import seminar2.parent.Flyable;
import seminar2.parent.Speakable;

public class Raven extends Animal implements Speakable, Flyable {
    public Raven(String name, String color, int legsCount) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Кар!%n", getType());
    }
    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
        goToSleep();
    }

    public void fly() {
        System.out.printf("%s полетел!%n", getType());
    }
    @Override
    public int getFlySpeed() {
        return 40;
    }
}
