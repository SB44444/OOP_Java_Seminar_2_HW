package seminar2.parent;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    public final List<Animal> ANIMALS;  // ������ �������� �������.

    public VeterinaryClinic() {
        this.ANIMALS = new ArrayList<>();
    }  // �����������

    public VeterinaryClinic addAnimal(Animal animal) {    //  ����� ���������� � ������
        ANIMALS.add(animal);
        return this;
    }

    public List<Animal> getANIMALS() {
        return ANIMALS;
    }  //  ����� ��������� �������� �� ������

    public List<Speakable> getSpeakable() {              //  ����� ��������� ���������
        List<Speakable> result = new ArrayList<>();
        for (Animal animal : getANIMALS()) {
            if (animal instanceof Speakable) {
                result.add((Speakable) animal);
            }
        }
        return result;
    }

    @SuppressWarnings("unused")
    public List<Runnable> getRunnable() {           //  ����� ��������� ��������, ��������� �������
        List<Runnable> result = new ArrayList<>();
        for (Animal animal : getANIMALS()) {
            if (animal instanceof Runnable) {
                result.add((Runnable) animal);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable() {            //  ����� ��������� ��������, ��������� ������
        List<Flyable> result = new ArrayList<>();
        for (Animal animal : getANIMALS()) {
            if (animal instanceof Flyable) {
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    public List<Swimmable> getSwimmable() {         //  ����� ��������� ��������, ��������� �������
        List<Swimmable> result = new ArrayList<>();
        for (Animal animal : getANIMALS()) {
            if (animal instanceof Swimmable) {
                result.add((Swimmable) animal);
            }
        }
        return result;
    }
}

