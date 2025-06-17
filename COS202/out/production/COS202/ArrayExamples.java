package Basics;

import java.util.Scanner;

public class ArrayExamples {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = {1,3,5,7,9};
        int[] anotherArray = new int[10];
        String[] gender = {"Female", "Male"};

        for (int i = 0; i < anotherArray.length; i++) {
            System.out.println(myArray[i]);
            anotherArray[i] = input.nextInt();
        }
        myArray[1]  = 13;
        myArray[2]  = 13;
        anotherArray[5] = 17;

        for (int i = 0; i < anotherArray.length; i++) {
            System.out.println("Item at: "+i+ "is" + anotherArray[i]);
        }
    }
}