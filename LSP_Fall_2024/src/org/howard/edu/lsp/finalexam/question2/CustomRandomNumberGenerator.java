package org.howard.edu.lsp.finalexam.question2;

public class CustomRandomNumberGenerator implements RandomNumberGenerator {
 private long seed = 123456789L;

 @Override
 public int generateRandomNumber() {
     seed = (seed * 6364136223846793005L + 1) & 0xFFFFFFFFFFFFFFFFL;
     return (int)(seed >>> 32);  
 }
}

