package seminar2.child;

import seminar2.parent.Human;

public class Mowgli extends Human {  //  Класс доктор, унаследован от Human
    public Mowgli(String name, String dateWasBorn, String profession, String firstName) {
        super(name, dateWasBorn, profession, firstName);
    }

    @Override
    public void toWork() {
        System.out.println("I am able to live in the jungle");
    }

    public void profession(){
        System.out.println("I am a wild man,");
    }
}
