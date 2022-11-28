public class Main {
    public static void main(String[] args) {

        int[] numbers = { 12, 6, 8, 11, 22, 5, 8, 15, 22, 0};
        int localMin = 0;



        for (int i = 0; i < numbers.length; i++) {
            int left, right;
            left = i - 1;
            right = i + 1;

            if (left < 0) {
                left = numbers.length - 1;
            }
            if (right > numbers.length - 1) {
                right = 0;
            }

            if (numbers[i] < numbers[left] && numbers[i] < numbers[right]) {
//                System.out.println(numbers[i]);
                localMin++;
            }

        }

        System.out.println("Размер массива: " + numbers.length);
        System.out.println("Количество локальных минимумов: " + localMin);

    }
}