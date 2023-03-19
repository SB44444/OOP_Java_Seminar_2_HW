package seminar2.parent;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    public final List<Animal> ANIMALS;  // Список животных клиники.

    public VeterinaryClinic() {
        this.ANIMALS = new ArrayList<>();
    }  // Конструктор

    public VeterinaryClinic addAnimal(Animal animal) {    //  Метод добавления в список
        ANIMALS.add(animal);
        return this;
    }

    public List<Animal> getANIMALS() {
        return ANIMALS;
    }  //  Метод получения животных из списка

    public List<Speakable> getSpeakable() {              //  Метод получения говорящих
        List<Speakable> result = new ArrayList<>();
        for (Animal animal : getANIMALS()) {
            if (animal instanceof Speakable) {
                result.add((Speakable) animal);
            }
        }
        return result;
    }

    @SuppressWarnings("unused")
    public List<Runnable> getRunnable() {           //  Метод получения животных, способных бегавть
        List<Runnable> result = new ArrayList<>();
        for (Animal animal : getANIMALS()) {
            if (animal instanceof Runnable) {
                result.add((Runnable) animal);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable() {            //  Метод получения животных, способных летать
        List<Flyable> result = new ArrayList<>();
        for (Animal animal : getANIMALS()) {
            if (animal instanceof Flyable) {
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    public List<Swimmable> getSwimmable() {         //  Метод получения животных, способных плавать
        List<Swimmable> result = new ArrayList<>();
        for (Animal animal : getANIMALS()) {
            if (animal instanceof Swimmable) {
                result.add((Swimmable) animal);
            }
        }
        return result;
    }
}

