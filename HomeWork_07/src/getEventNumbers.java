public class getEventNumbers {
    public static void main(String[] args) {
        int[] arr = {12, 43, 11, 44, 66, 12, 34, 30};

        getEventNumbers(arr);
    }

    public static void getEventNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
