package Loops;
import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int toplam = 1;
        System.out.print("Faktöriyelini Bulmak İstediğiniz Sayıyı Giriniz: ");
        n = input.nextInt();

        for (int i=1; i<=n; i++) {
            toplam *= i;

        }
        System.out.print("Faktöriyel: " + toplam);



    }
}

