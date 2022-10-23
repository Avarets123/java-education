import ru.inno.ArrayList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();

        array.add("One");
        array.add("Two");
        array.add("Free");
        array.add("Four");

        array.size(); // 4
        array.removeAt(1);
        array.size(); // 3
        array.remove("Free");
        array.size(); // 2


    }
}