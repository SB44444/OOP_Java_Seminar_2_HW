package seminar2;

import seminar2.child.*;
import seminar2.parent.Runnable;
import seminar2.parent.*;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        clinic
                .addAnimal(new Cat("������", "�����"))
                .addAnimal(new Dog("������", "�����"))
                .addAnimal(new Duck("�������", "�����", 2))
                .addAnimal(new Raven("�������", "������", 2))
                .addAnimal(new Penguin("�������", "����o-�����", 2))
                .addAnimal(new Horse("�����", "���������"));
        
        System.out.println("������ ���� ��������");
        for (Animal animal : clinic.getANIMALS()) { System.out.print(animal);
        }
        System.out.println("������ ��������, ��������� ����������� �����");
        System.out.println(clinic.getSpeakable());
        clinic.getSpeakable().forEach(Speakable::speak);
        System.out.println("������ ��������, ��������� �������");
        System.out.println(clinic.getRunnable());
        clinic.getRunnable().forEach(Runnable::getRunSpeed);
        System.out.println("������ ��������, ��������� ������");
        System.out.println(clinic.getFlyable());
        clinic.getFlyable().forEach(Flyable::getFlySpeed);
        System.out.println("������ ��������, ��������� �������");
        System.out.println(clinic.getSwimmable());
        clinic.getSwimmable().forEach(Swimmable::getSwimSpeed);
        System.out.println("������ ���������� ��������");
        for (Animal animal : clinic.getANIMALS()) { animal.getIll();
        }
    }
}
