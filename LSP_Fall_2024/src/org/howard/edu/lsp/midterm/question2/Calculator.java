//Camryn Brown
package org.howard.edu.lsp.midterm.question2;

public class Calculator {

  
    public static int sum(int a, int b) {
        return a + b;
    }

  
    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
