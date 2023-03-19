package seminar2;

import seminar2.child.*;
import seminar2.parent.Runnable;
import seminar2.parent.*;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        clinic
                .addAnimal(new Cat("Барсик", "серый"))
                .addAnimal(new Dog("Барбос", "рыжий"))
                .addAnimal(new Duck("Дональд", "белый", 2))
                .addAnimal(new Raven("Соколов", "черный", 2))
                .addAnimal(new Penguin("Айсберг", "чернo-белый", 2))
                .addAnimal(new Horse("Сивка", "пятнистый"));
        
        System.out.println("Список всех животных");
        for (Animal animal : clinic.getANIMALS()) { System.out.print(animal);
        }
        System.out.println("Список животных, способных произносить звуки");
        System.out.println(clinic.getSpeakable());
        clinic.getSpeakable().forEach(Speakable::speak);
        System.out.println("Список животных, способных бегавть");
        System.out.println(clinic.getRunnable());
        clinic.getRunnable().forEach(Runnable::getRunSpeed);
        System.out.println("Список животных, способных летать");
        System.out.println(clinic.getFlyable());
        clinic.getFlyable().forEach(Flyable::getFlySpeed);
        System.out.println("Список животных, способных плавать");
        System.out.println(clinic.getSwimmable());
        clinic.getSwimmable().forEach(Swimmable::getSwimSpeed);
        System.out.println("Список заболевших животных");
        for (Animal animal : clinic.getANIMALS()) { animal.getIll();
        }
    }
}
