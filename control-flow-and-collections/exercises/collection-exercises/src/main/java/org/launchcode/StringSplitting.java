package org.launchcode;
import java.util.Arrays;

public class StringSplitting {
    public static void main(String[] args) {
        String poem = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        // Split the string into words
        String[] words = poem.split(" ");
        System.out.println("Words array: ");
        System.out.println(Arrays.toString(words));

        // Split the string into sentences
        String[] sentences = poem.split("\\.");
        System.out.println("\nSentences array: "); // (\n) For separation purposes from the output of Words Array to Sentences Array
        System.out.println(Arrays.toString(sentences));
    }

}