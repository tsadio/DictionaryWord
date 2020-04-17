/**
 * This program is provided to put an array of Strings in
 * ascending and descending order using bubble sort
 * The user will enter 10 words in the array
 * The 10 words will be first display as entered by the user
 * The next step will be to sort the 10 words in alphabetical
 * order using bubble sort and display the result
 * Now the words will be also sort in a descending order
 * using bubble sort and display
 * Finally, the 10 words will be checked to find words starting
 * with vowel and display
 */

import java.util.Scanner;
import java.util.Arrays;

public class DictionaryWord {
    public static void main (String [] args)  {

        //declaring variables
        Scanner in = new Scanner(System.in);
        String [] words = new String [10];
        String myWords;

        //Prompt the user to enter the 10 words
        //and save the 10 words in the array using
        //for loop
        System.out.println("Enter a word 10 words. ");
        for (int i = 0; i < words.length; i++) {
            System.out.print("Word " + (i + 1) + ": ");
            String userWord = in.nextLine();
            words[i] = userWord;
        }
        System.out.println(" ");

        //display the words in the original order
        //using for loop
        System.out.print("Original order: ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println(" ");

        //Sort the array using bubble sort
        //in ascending order
        //and display the result
        System.out.println(" ");
        System.out.print("Alphabetical order: ");
        for (int i = 0; i < words.length; i++){
            for (int j = i + 1; j < words.length; j++){
                if (words[j].compareTo(words[i]) < 0) {
                    myWords = words[i];
                    words[i] = words[j];
                    words[j] = myWords;

                }
            }
            System.out.print(words[i] + " ");
        }
        System.out.println(" ");

        //Sort the array using bubble sort
        //in descending order
        //and display the result
        System.out.println(" ");
        System.out.print("Reverse Alphabetical order: ");
        for (int i = 0; i < words.length; i++){
            for (int j = i + 1; j < words.length; j++){
                if (words[j].compareTo(words[i]) > 0) {
                    myWords = words[i];
                    words[i] = words[j];
                    words[j] = myWords;

                }
            }
            System.out.print(words[i] + " ");
        }
        System.out.println(" ");

        //cross the array to check each word
        //If the word start with a vowel, display
        //If not, go to the next word
        System.out.println(" ");
        System.out.print("Words starting with vowel: ");
        for (int i = 0; i < words.length; i++) {
            String anotherWord = words[i];
            if (anotherWord.charAt(0) == 'a' || anotherWord.charAt(0) == 'e' ||
                    anotherWord.charAt(0) == 'i' ||anotherWord.charAt(0) == 'o' ||
                    anotherWord.charAt(0) == 'u') {
                System.out.print(anotherWord + " ");
            }
        }

    }
}