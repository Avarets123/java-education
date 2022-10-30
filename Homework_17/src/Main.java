import ru.inno.ArrayList;
import ru.inno.LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//
        ArrayList<String> array = new ArrayList<>();

        array.add("One");
        array.add("Two");
        array.add("Three");
        array.add("Four");

        array.size(); // 4
        array.removeAt(1);
        array.size(); // 3
        array.remove("Free");
        array.size(); // 2

        LinkedList<String> linked = new LinkedList<>();

        linked.add("One");
        linked.add("Two");
        linked.add("Three");
        linked.add("Four");


        System.out.println(linked.contains("One"));
        linked.removeAt(0);
        System.out.println(linked.contains("One"));




    }
}