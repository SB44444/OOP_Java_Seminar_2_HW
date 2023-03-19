package seminar2.child;

import seminar2.parent.Animal;
import seminar2.parent.Speakable;
import seminar2.parent.Runnable;
public class Dog extends Animal implements Speakable, Runnable {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Гав!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        toPlay();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }
    @Override
    public int getRunSpeed() {
        return 15;
    }

}
