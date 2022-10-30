import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> words = CountsWord.getCountsWord("hello hello hello have nice");

        System.out.println(words.keySet());
        System.out.println(words.values());
    }
}