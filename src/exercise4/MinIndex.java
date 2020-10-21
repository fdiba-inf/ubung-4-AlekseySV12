package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m=input.nextInt();
        int p=0;
        double[] numbers = new double[m];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
            }
        double min=0;   
        for (int i = 0; i < numbers.length; i++) {
            if(min>numbers[i]){
              min=numbers[i];
            }
            else min=min;
            }
        for (int i = 0; i < numbers.length; i++) {
            if(min==numbers[i]){
              p=i;
              
              break;
            }
            }

        System.out.println("Min index: "+ p);
       
    }

}