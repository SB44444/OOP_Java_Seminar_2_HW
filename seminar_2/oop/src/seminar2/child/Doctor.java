package seminar2.child;

import seminar2.parent.Human;

public class Doctor extends Human {  //  Класс доктор, унаследован от Human
    public Doctor(String name, String dateWasBorn, String profession, String firstName) {
        super(name, dateWasBorn, profession, firstName);
    }

    @Override
    public void toWork() {
        System.out.println("I can to heal animals");
    }

    public void profession(){
        System.out.println("I am veterinar");
    }
}
