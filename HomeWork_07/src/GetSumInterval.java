public class GetSumInterval {
    public static void main(String[] args) {

        int[] newArr = {21, 45, 65, 76, 11, 23, 5, 6, 8};

        int sum = getSumInterval(newArr, 3, 7);
        System.out.println(sum);

    }


    public static int getSumInterval(int[] arr, int from, int to) {
        int sum = 0;

        if (from > to || to > arr.length) {
            return -1;
        }

        for (int i = from; i <= to; i++) {
            sum += arr[i];
        }
        return sum;
    }
}