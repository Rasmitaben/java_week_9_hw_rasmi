package homeworkweek9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class Programme3ReverseAnArray {
    public static void main(String[] args) {
        int[]array = {10,20,30,40,50};
        System.out.println("Original Array: " + Arrays.toString(array));

        ArrayList<Integer> arrayList= new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++){
            arrayList.add(array[i]);
        }
        Collections.reverse(arrayList);
        for (int i = 0; i< arrayList.size(); i++){
            array[i] = arrayList.get(i);
        }
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

}
