package homeworkweek9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */

public class Programme5ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Melon");

        //Get an Iterator for the ArrayList
        Iterator<String> iterator = fruits.iterator();

        //Iterator through the ArrayList using the Iterator
        while(iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit);
        }



    }
}
