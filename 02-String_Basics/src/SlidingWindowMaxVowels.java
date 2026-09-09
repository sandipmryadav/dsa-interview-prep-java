public class SlidingWindowMaxVowels {

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static int maxVowels(String s , int k) {
        int count = 0;
        int maxCount;


        for(int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))) {
                count++;
            }
        }
        maxCount = count;


        for(int i = k; i < s.length(); i++) {
            char newChar = s.charAt(i);
            char oldChar = s.charAt(i - k);

            if(isVowel(newChar)) {
                count++;
            }

            if(isVowel(oldChar)) {
                count--;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
    }
}