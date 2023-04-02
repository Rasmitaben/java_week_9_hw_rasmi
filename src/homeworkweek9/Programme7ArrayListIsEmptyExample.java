package homeworkweek9;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */

public class Programme7ArrayListIsEmptyExample {
    public static void main(String[] args) {

        //create an empty array list
        ArrayList<String> arrayList = new ArrayList<>();
        if (arrayList.isEmpty()) {
            System.out.println("arrayList is empty");
        }else{
            System.out.println("arrayList is not empty");
        }
        //Printing all the elements available in arrayList
        System.out.println("ArrayList = " + arrayList);

        //Use add() method to add the elements available in the arrayList
        arrayList.add("Red");
        arrayList.add("Orange");
        arrayList.add("Pink");
        arrayList.add("Purple");
        arrayList.add("Blue");
        arrayList.add("Black");
        if (arrayList.isEmpty()){
            System.out.println("arrayList is empty");
        }else{
            System.out.println("arrayList is not empty");
        }
        //Printing all the  elements available in arrayList
        System.out.println("ArrayList = " + arrayList);



    }


}
