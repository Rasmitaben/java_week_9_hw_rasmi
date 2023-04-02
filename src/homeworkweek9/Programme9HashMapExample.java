package homeworkweek9;

import java.util.HashMap;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

public class Programme9HashMapExample {
    public static void main(String[] args) {


        HashMap<String, Integer> people = new HashMap<>();

        //Add some key value to the map
        people.put("John", 25);
        people.put("Prince", 30);
        people.put("Michael", 35);
        people.put("Bob", 40);

        //Iterate over the values in the map using a for -each loop
        for (int age : people.values()){
            System.out.println("Age: " + age);
        }


    }

}
