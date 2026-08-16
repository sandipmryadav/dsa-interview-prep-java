public class SelectionSort {
    public static void main (String[]args) {
        int []arr = {10,2,15,5,7};
        selectionSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void selectionSort(int[]arr) {
        for (int i=0; i<arr.length -1; i++) {
            int minIndex = i;
            for(int j=i+1; j<arr.length ; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
           arr[minIndex] = temp;
        }
    }
}
