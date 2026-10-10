public class VowelConsonantWordCounter {
    public static void countVowelsAndConsonants(String word) {
        if (word == null) {
            System.out.println("Vowels: 0\nConsonants: 0");
            return;
        }
        int vowels = 0, consonants = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    public static void main(String[] args) {
        countVowelsAndConsonants("Programming");
    }
}
