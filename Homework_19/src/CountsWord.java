import java.util.HashMap;

public  class CountsWord {

    public static HashMap<String, Integer> getCountsWord(String words) {

        HashMap<String, Integer> map = new HashMap<>();
        String[] arrayWords = words.split(" ");


        for (String word: arrayWords ) {

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);

            } else {
                map.put(word, 1);
            }

        }

        return map;

    }
}
