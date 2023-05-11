package Collection;

import java.util.ArrayList;
import java.util.List;

public class collectionArchitecture {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Ali");
        names.add("Hasan");
        names.add("Serap");
        try {
            System.out.println(names.get(2));
            System.out.println(names.get(1));
            System.out.println(names.size());
            names.add(1, "kadir");
            System.out.println(names.get(0));
            System.out.println(names.get(1));
            System.out.println(names.get(2));
            System.out.println(names.get(3));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("The index is out of bounds" + e);
        }
    }
}
