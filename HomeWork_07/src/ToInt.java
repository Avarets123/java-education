public class ToInt {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 2, 3};

        int res = toInt(arr);
        System.out.println(res);

    }


    public static int toInt(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum *= 10;
            sum += arr[i];
        }

        return sum;
    }
}
