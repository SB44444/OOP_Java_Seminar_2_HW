package seminar2.child;

import seminar2.parent.Animal;
import seminar2.parent.Speakable;
import seminar2.parent.Runnable;

public class Cat extends Animal implements Speakable, Runnable {
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s ������: Meow!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        toPlay();
        eat();
        toPlay();
        goToSleep();
    }

    @Override
    public int getRunSpeed() {
        return 30;
    }
}
