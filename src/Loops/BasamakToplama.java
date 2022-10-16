package Loops;
import java.util.Scanner;

public class BasamakToplama {
    public static void main(String[] args) {

        int toplam = 0;
        int sayi;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        sayi = input.nextInt();


        while (sayi != 0) {
            toplam += (sayi % 10) ;
            sayi /= 10;
        }

        System.out.print(toplam);





    }
}
