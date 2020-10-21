package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m=input.nextInt();
        String k=" ";
        int[] numbers = new int[m];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
            }
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
            System.out.print(k);
            k=k+" ";
            
            }

       
    }

}