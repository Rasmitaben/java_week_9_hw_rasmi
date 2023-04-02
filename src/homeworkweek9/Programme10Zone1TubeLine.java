package homeworkweek9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

public class Programme10Zone1TubeLine {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> tubeLine = new HashMap<>();
        tubeLine.put("BakerStreet", new ArrayList<>());
        tubeLine.get("BakerStreet").add("Circle line");
        tubeLine.get("BakerStreet").add("Baker loo line");
        tubeLine.get("BakerStreet").add("Jubilee line");
        tubeLine.get("BakerStreet").add("Metropolitan line");
        tubeLine.get("BakerStreet").add("Hammersmith and line");
       // System.out.println(tube.Line.get("BakerStreet"));

        tubeLine.put("Euston", new ArrayList<>());
        tubeLine.get("Euston").add("Northern line");
        tubeLine.get("Euston").add("Victoria line");
        //System.out.println(tube.Line.get("Euston"));

        tubeLine.put("GreenPark", new ArrayList<>());
        tubeLine.get("GreenPark").add("Jubilee line");
        tubeLine.get("GreenPark").add("Piccadilly line");
        tubeLine.get("GreenPark").add("Victoria line");
        //System.out.println(tube.Line.get("GreenPark"));

//        HashMap<String,String> tubeZone = new HashMap<>();
//        tubeZone.put("BakerStreet", "Zone 1");
//        tubeZone.put("Euston", "Zone 1");
//        tubeZone.put("GreenPark", "Zone 1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the station name : ");
        String nameOfStation = scanner.next();
        System.out.println(nameOfStation + " is in the Zone 1" );
        System.out.println("TubeLines passing through " + nameOfStation + " is: " + tubeLine.get(nameOfStation));
        //System.out.println(nameOfStation + " is in the " + tubeZone.get(nameOfStation));
        scanner.close();
    }
}
