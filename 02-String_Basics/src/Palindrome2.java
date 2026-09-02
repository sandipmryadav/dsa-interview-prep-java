public class Palindrome2 {
    public static void main(String[]args) {
        String word = "MADAM";
        Boolean isPalindrome = true;
        int left = 0;
        int right = word.length()-1;

        while(left <= right) {
            if(word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left ++;
            right --;
        }
    System.out.println("Is Palindrome? " + isPalindrome);
    }
}
