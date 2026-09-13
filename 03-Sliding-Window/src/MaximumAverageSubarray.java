public class MaximumAverageSubarray {
    public static double findMaxArray(int []arr, int k) {
        double currentSum = 0.00;
        double maxSum ;

        for(int i=0; i<k; i++) {
            currentSum = currentSum + arr[i];
        }
        maxSum = currentSum;

        for(int i=k; i<arr.length; i++) {
            currentSum = currentSum + arr[i];
            currentSum = currentSum - arr[i - k];
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum / k;
    }

    public static void main(String[]args) {
        int [] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        System.out.println(("Maximum Average is: ") + findMaxArray(arr, k));
    }
}
