package org.howard.edu.lsp.finalexam.question2;


public class RandomNumberClient {
 public static void main(String[] args) {
     
     RandomNumberService service = RandomNumberService.getInstance();

     
     service.setRandomNumberGenerator(new JavaRandomNumberGenerator());
     System.out.println("Java Random Number: " + service.generateRandomNumber());

     
     service.setRandomNumberGenerator(new CustomRandomNumberGenerator());
     System.out.println("Custom Random Number: " + service.generateRandomNumber());
 }
}
