package homeworkweek9;

import java.util.ArrayList;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class Programme6ArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Pink");
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        //Ihe index of the element we want to retrieve
        int index = 3;

        // Retrieve the element at the specified index
        String color = colors.get(index);

        //Print the retrieved element
        System.out.println("The color at index " + index + " is " + color);


    }
}
