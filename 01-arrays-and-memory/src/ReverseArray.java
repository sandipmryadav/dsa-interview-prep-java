import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr = {50,40,30,20,10};
        reverseArray(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void reverseArray(int []arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left ++;
            right --;
        }
    }
}
