//Camryn Brown
package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilitiesDriver {
    public static void main(String[] args) {
        HashMap<String, String> hashmap1 = new HashMap<>();
        hashmap1.put("Alice", "Healthy");
        hashmap1.put("Mary", "Ecstatic");
        hashmap1.put("Bob", "Happy");
        hashmap1.put("Chuck", "Fine");
        hashmap1.put("Felix", "Sick");

        HashMap<String, String> hashmap2 = new HashMap<>();
        hashmap2.put("Mary", "Ecstatic");
        hashmap2.put("Felix", "Healthy");
        hashmap2.put("Ricardo", "Superb");
        hashmap2.put("Tam", "Fine");
        hashmap2.put("Bob", "Happy");

        System.out.println("Number of common key/value pairs is: " + 
                           MapUtilities.commonKeyValuePairs(hashmap1, hashmap2));
    }
}
