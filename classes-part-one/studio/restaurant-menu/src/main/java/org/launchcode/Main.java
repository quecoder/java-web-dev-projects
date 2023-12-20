package org.launchcode;

public class Main {

    public static void main(String[] args) {

        MenuItem item1 = new MenuItem ("Brown Sugar Salmon", "Who doesn't like a little sugar on their salmon?", 34.99, "main course" );
        MenuItem item2 = new MenuItem ("Cajun Lobster Mac n' Cheese", "Combining three of your favorites into one dish.", 22.99, "appetizers" );
        MenuItem item3 = new MenuItem ("Garlic Breadsticks", "Something light, something cheesy.", 18.99, "appetizers" );
        MenuItem item4 = new MenuItem ("8oz Sirloin", "For the men.. or women.", 34.99, "main course" );
        MenuItem item5 = new MenuItem ("Unlimited Ice Cream", "Choose 1 or choose all your favorite flavors.", 29.99, "dessert" );

        System.out.println(item1);

    }

}
