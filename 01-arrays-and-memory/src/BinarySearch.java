public class BinarySearch {
    public static void main (String[]args) {
        int [] arr = {2,5,7,10,15};
        int target = 10;
        int isTarget =  binarySearch(arr,target);
        System.out.print("Target " + target + " is at index " +  isTarget );

    }

    public static int binarySearch (int []arr , int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(target == arr[mid]) return mid;
            else if (target < arr[mid])  {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;

    }
}
