package Loops;
import java.util.Scanner;

public class MaxMinDeger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("sayı adedini giriniz: ");
        int sayi = input.nextInt();


        int max =1;
        int min =1;

        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + ".sayıyı giriniz: ");
             int number = input.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            }

            if (number> max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }



        }
        System.out.println("max: " + max);
        System.out.print("min: " + min);

    }
}
