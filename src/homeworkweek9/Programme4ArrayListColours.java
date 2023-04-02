package homeworkweek9;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */


public class Programme4ArrayListColours {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Pink");

        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("The size of colors list: " + colors.size());
        colors.remove(3);
        System.out.println("New colors list after removing element : " + colors);
    }
}

