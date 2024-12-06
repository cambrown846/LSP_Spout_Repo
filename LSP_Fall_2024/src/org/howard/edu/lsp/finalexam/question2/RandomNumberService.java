//Camryn Brown

package org.howard.edu.lsp.finalexam.question2;

public class RandomNumberService {
 private static RandomNumberService instance;
 private RandomNumberGenerator randomNumberGenerator;

 
 private RandomNumberService() { }


 public static RandomNumberService getInstance() {
     if (instance == null) {
         instance = new RandomNumberService();
     }
     return instance;
 }


 public void setRandomNumberGenerator(RandomNumberGenerator strategy) {
     this.randomNumberGenerator = strategy;
 }


 public int generateRandomNumber() {
     if (randomNumberGenerator == null) {
         throw new IllegalStateException("RandomNumberGenerator is not set.");
     }
     return randomNumberGenerator.generateRandomNumber();
 }
}
