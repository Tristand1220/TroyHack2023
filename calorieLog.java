import java.io.*;
import java.util.*;

public class calorieLog {
    public static void main(String args[])
        {
            // No need to mention the
            // Generic type twice
            Hashtable<String, Integer> calLog = new Hashtable<>();


            // Inserting the Elements
            calLog.put("oct2", 1000);
            calLog.put("nov1", 1570);
            calLog.put("nov3", 2050);



            // Print mappings to the console
            System.out.println("Mappings of ht1 : " + calLog );

        }
    }


