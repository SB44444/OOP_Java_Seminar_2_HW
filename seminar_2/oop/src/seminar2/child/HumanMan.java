package seminar2.child;

import seminar2.parent.Animal;
import seminar2.parent.Speakable;

/**
 * �������� �����, � ������� ����� "�������"  ��������� �� ��������� ��� ��������� � ���������.
 * ����� ������ � ������� ����� � �� ���� � ���� ������� ������� � ����������� :) */
public class HumanMan extends Animal implements Speakable {
    private final String name;
    private final int legsCount;

    public HumanMan(String name, int legsCount) {
        super("", legsCount);
        this.name = name;
        this.legsCount = legsCount;
    }

    @Override
    public void speak() {
        System.out.printf("%s %s ����� ������ ��������.%n", getType(), getName());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLegsCount() {
        return legsCount;
    }
}
