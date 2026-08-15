public class Palindrome {
    public static void main (String[]args) {
        String word = "racecar";
        boolean isPalindrome =  palindromeWord(word);
        System.out.print(isPalindrome);
    }

    public static boolean palindromeWord(String word) {
        int left = 0;
        int right = word.length() -1;

        while(left < right) {
            if(word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left ++;
            right --;
        }
        return true;
    }
}
