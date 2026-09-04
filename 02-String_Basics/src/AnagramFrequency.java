import java.util.*;
public class AnagramFrequency {
    public static boolean anagramFrequency (String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        int [] count = new int[26];

        for(int i=0; i<s1.length(); i++) {
            count[s1.charAt(i) - 'A'] ++;
            count[s2.charAt(i)- 'A'] --;
        }
        for(int i=0; i<26; i++) {
            if(count[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("LISTEN & SILENT: " + anagramFrequency("LISTEN", "SILENT"));
        System.out.println("CAT & ACT: " + anagramFrequency("CAT", "ACT"));
        System.out.println("JAVA & PYTHON: " + anagramFrequency("JAVA", "PYTHON"));
    }

    }

