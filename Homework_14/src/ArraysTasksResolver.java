import java.util.Arrays;

public class ArraysTasksResolver {
    public static void resolveTask(int[] array, ArrayTask task, int from, int to) {

        System.out.println(Arrays.toString(array));
        ArraysTasksResolver.printFromTo(array, from, to);
        int res = task.resolve(array, from, to);
        System.out.println(res);


    }

    private static void printFromTo(int[] arr, int from, int to) {

        if (from > to || from < 0 || to > arr.length) {
            System.out.println("Некорректные данные");

        } else {

            int[] newArr = new int[to - from];
            int index = 0;

            for (int i = from ; i < to; i++) {
                newArr[index++] = arr[i];
            }
            System.out.println(Arrays.toString(newArr));
        }
    }


}
