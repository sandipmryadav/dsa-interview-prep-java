public class MaxSumSubarray {
    public static int maxSum(int[] arr, int k) {
        int currentSum = 0;
        int maxSum = 0;

        for(int i=0; i<k; i++) {
            currentSum += arr[i];
        }
        maxSum = currentSum;

        for(int i=k; i<arr.length; i++) {
            currentSum = currentSum + arr[i];
            currentSum = currentSum - arr[i -k];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int [] arr = {2,1,5,1,3,2};
        int k =3;

        int result = maxSum(arr, k);
        System.out.println("Maximum Sum is: " + result);
    }
}
