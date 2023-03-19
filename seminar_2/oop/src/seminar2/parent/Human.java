package seminar2.parent;

import seminar2.parent.Diseaseable;

public abstract class Human implements Diseaseable {
    private final String name;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, String dateWasBorn, String profession, String firstName) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getIll() {
        System.out.printf("%s %s Я всех вылечу", getType(), getName());
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public abstract void toWork();
}
