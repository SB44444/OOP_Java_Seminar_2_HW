package seminar2.child;

import seminar2.parent.Animal;
import seminar2.parent.Speakable;
import seminar2.parent.Runnable;

public class Horse extends Animal implements Speakable, Runnable {

    public Horse(String name, String color) {
        super(name, color);
    }

    public Horse(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Го..%n", getType());
    }
    @Override
    public int getRunSpeed() {
        return 45;
    }

    @Override
    public void hunt() {
        wakeUp();
        eat();
        goToSleep();
    }
}
