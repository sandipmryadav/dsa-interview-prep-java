public class Palindrome {
    public static void main(String[] args) {
        String word = "MADAM";
        String rev = "";

        for (int i=word.length()-1; i>=0; i--) {
            rev += word.charAt(i);
        }

        if(rev.equals(word)) {
            System.out.println("Yes, it is a Palindrome");
        } else {
            System.out.println("No, it is not a Palindrome");
        }
    }
}
