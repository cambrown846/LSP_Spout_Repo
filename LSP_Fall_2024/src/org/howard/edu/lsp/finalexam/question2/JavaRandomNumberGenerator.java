//Camryn Brown

package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

public class JavaRandomNumberGenerator implements RandomNumberGenerator {
    private Random random = new Random();

    @Override
    public int generateRandomNumber() {
        return random.nextInt(Integer.MAX_VALUE); 
    }
}
