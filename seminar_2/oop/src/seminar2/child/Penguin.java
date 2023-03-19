package seminar2.child;

import seminar2.parent.Animal;
import seminar2.parent.Speakable;
import seminar2.parent.Swimmable;
import seminar2.parent.Runnable;
public class Penguin extends Animal implements Speakable, Runnable, Swimmable {
    private int legsCount;

    public Penguin(String name, String color, int legsCount) {
        super(name, color);
        this.legsCount = legsCount;
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал:  вить!%n", getType());
    }

    @Override
    public int getRunSpeed() {
        return 15;
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
        goToSleep();
    }
    @Override
    public int getSwimSpeed() {
        return 15;
    }
}