package Donguler;
import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {

        int n;
        double toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        n = input.nextInt();

        for (double i= 1; i<=n; i++) {
            toplam += 1/i;

        }

        System.out.print("Sonuç: " + toplam);
    }
}
