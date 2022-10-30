public class Main {
    public static void main(String[] args) {

        ArrayTask sumFromTo = (arr, from, to) -> {
            int sum = 0;

            if (from < 0 || from > arr.length || from > to || to > arr.length) {
                System.out.println("Incorrect data");
            } else {

                for (int i = from - 1; i < to - 1; i++) {
                    sum += arr[i];
                }
            }

            return sum;
        };

        ArrayTask sumBigCounts = (arr, from, to) -> {
            int sum = 0;

            if (from < 0 || from > arr.length || from > to || to > arr.length) {
                System.out.println("Incorrect data");
            } else {

                for (int i = from; i < to; i++) {
                    if (arr[i] > sum) {
                        sum = arr[i];
                    }
                }

                int sumNumbers = 0;
                for (int i = sum; i > 0; i /= 10) {
                    sumNumbers += i % 10;
                }
                sum = sumNumbers;
            }

            return sum ;

        };

        int[] arr = {12, 23, 32, 2, 7, 6, 4, 32};

        ArraysTasksResolver.resolveTask(arr, sumFromTo, 2, 5);
        ArraysTasksResolver.resolveTask(arr, sumBigCounts, 4, 8);
    }
}