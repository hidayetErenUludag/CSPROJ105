import java.util.Scanner;

public class example  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String a = sc.nextLine();

        char[] arr = {'a', 'e', 'i', 'o', 'u'};

        String b = a.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < b.length(); i++){
            char d = b.charAt(i);
            if (Character.isLetter(d)) {
                boolean isVowel = false;
                for (char vowel : arr ){
                    if (d == vowel){
                        vowelCount ++;
                        isVowel = true;
                        break;
                    }
                }
                if (!isVowel) {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowel count is " + vowelCount + " Consonant count is " + consonantCount);
    }
}
