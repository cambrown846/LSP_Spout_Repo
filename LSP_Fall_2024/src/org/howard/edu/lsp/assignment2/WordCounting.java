//Camryn Brown
package org.howard.edu.lsp.assignment2;

import java.util.*;  

public class WordCounting {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        Map<String, Integer> wordCounts = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.trim().isEmpty()) break; 

            line = line.toLowerCase();
            String[] words = line.split("[^a-zA-Z]+");

            for (String word : words) {
                if (word.length() > 3) {
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
        }

        scanner.close();

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordCounts.entrySet());
        entries.sort(Map.Entry.comparingByKey());

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

//When the code is ran, it allows you to input a phrase and then it'll count the words after clicking enter twice
