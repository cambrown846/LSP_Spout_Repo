//Camryn Brown
package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
    private Map<String, Integer> candidates; 

    public VotingMachine() {
        candidates = new HashMap<>();
    }

    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0); 
        }
    }

    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1); 
        } else {
            System.out.println("Candidate not found: " + name);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return result.toString();
    }
}

