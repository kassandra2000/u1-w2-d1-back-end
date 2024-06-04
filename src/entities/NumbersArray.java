package entities;

import java.util.Random;
import java.util.Scanner;

public class NumbersArray {
    public static void main(String[] args) {
        //Scanner sc = new Scanner();
        int[] numArray = new int[5];
        Random randomNum = new Random();


        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = randomNum.nextInt(1, 11);
        }
        printArray(numArray);


        Scanner sc = new Scanner(System.in);
        int num = 3, position;

        while (num != 0) {
            try {
                System.out.println("inserisci un numero");
                num = Integer.parseInt(sc.nextLine());
                System.out.println("In quale posizione?");
                position = Integer.parseInt(sc.nextLine());
                numArray[position] = num;
                System.out.println(numArray[position] + "  trova nella " + position + " posizione");
                printArray(numArray);
            } catch(Exception e) {
                throw new RuntimeException("Il numero non è valido");
            }
        }
        sc.close();


    }

    public static void printArray(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i] + "  trova nella " + i + " posizione");
        }
    }

}
