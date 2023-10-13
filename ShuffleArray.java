package shuffleArray;
import java.util.Arrays;
public class ShuffleArray {

    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shuffleArray(Integer[] arr) {
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
