package seminar2.child;

import seminar2.parent.Animal;
import seminar2.parent.Flyable;
import seminar2.parent.Speakable;
import seminar2.parent.Swimmable;

public class Duck extends Animal implements Speakable, Flyable, Swimmable {
    private int legsCount;

    public Duck(String name, String color, int legsCount) {
        super(name, color);
        this.legsCount = legsCount;
    }

    public Duck(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Кря!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
        goToSleep();
    }

    @Override
    public int getFlySpeed() {
        return 40;
    }

    @Override
    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public int getSwimSpeed() {
        return 5;

    }
}
