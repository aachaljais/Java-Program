package array;

import java.util.Scanner;

public class PangramCheck {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence to check if it's a pangram: ");
        String sentence = scanner.nextLine();

        boolean isPangram = isPangram(sentence);

        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }

        scanner.close();
    }

    public static boolean isPangram(String sentence) {
        boolean[] alphabetPresent = new boolean[26];
        int totalAlphabets = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a'; 
                if (!alphabetPresent[index]) {
                    alphabetPresent[index] = true; 
                    totalAlphabets++; 

                    if (totalAlphabets == 26) {
                        return true;
                    }
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                int index = ch - 'A'; 
                if (!alphabetPresent[index]) {
                    alphabetPresent[index] = true; 
                    totalAlphabets++; 

                    if (totalAlphabets == 26) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
