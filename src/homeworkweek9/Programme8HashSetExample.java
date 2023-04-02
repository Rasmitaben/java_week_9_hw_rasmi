package homeworkweek9;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class Programme8HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(4);
        set.add(7);
        set.add(8);

        for (int i = 1; i <= 10; i++){
            if(set.contains(i)){
                System.out.println(i + " is in the set ");
            }else{
                System.out.println(i + " is not in the set ");
            }
        }
    }

}
