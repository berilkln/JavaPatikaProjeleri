package Loops;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = input.nextInt();

        int n1= 0, n2 = 1, n3;

        System.out.print(n1 + " " + n2);// 0 ve 1 degerini başa yazdırır


        for (int i= 2; i<n; i++) {
           n3 = n1 + n2;
           System.out.print(" " + n3);
           n1 = n2;
           n2 = n3;

       }



    }
}
