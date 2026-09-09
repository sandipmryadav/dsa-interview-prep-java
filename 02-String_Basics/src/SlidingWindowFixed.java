public class SlidingWindowFixed {
    public static void printWindows(String s, int k) {
        int left = 0;
        int right = k - 1;

        while (right < s.length()) {
            String currentWindow = s.substring(left, right + 1);
            System.out.println("Window: " + currentWindow + " (left: " + left + ", right: " + right + ")");

            left++;
            right++;
        }
    }
    public static void main(String[] args) {
        printWindows("JAVABOOK", 4);
    }
}
