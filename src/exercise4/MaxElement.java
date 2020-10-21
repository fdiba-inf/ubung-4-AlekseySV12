package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m=input.nextInt();
        
        double[] numbers = new double[m];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
            }
        double max=0;   
        for (int i = 0; i < numbers.length; i++) {
            if(max<numbers[i]){
              max=numbers[i];
            }
            else max=max;
            }

       System.out.println("Max number: "+max);
       
    }

}