public class Main {
    public static void main(String[] args) {

        ArrayTask sumNumbersFromTo = (int[] array, int from, int to) -> {
            int sum = 0;
            if (from > to || from < 0 || to > array.length) {
                System.out.println("Некорректные данные");

            } else {

                for (int i = from; i < to; i++) {
                    sum += array[i];
                }
            }
            return sum;
        };

    }
}