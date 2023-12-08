package org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;

public class StringToArrayList {
    public static void main(String[] args) {
        String poem = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        // Splitting the poem into words
        String[] wordsArray = poem.split(" ");

        // Converting array to ArrayList
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));

        // Printing the ArrayList of words
        System.out.println("Words in ArrayList: ");
        System.out.println(wordsList);
    }
}
