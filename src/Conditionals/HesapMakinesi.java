package Conditionals;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int deger1,  islem;
        double sonuc, deger2;

        Scanner input = new Scanner(System.in);
        System.out.print("bir rakam giriniz:");
        deger1 = input.nextInt();

        System.out.print("bir rakam giriniz:");
        deger2 = input.nextDouble();

        System.out.print("yapmak istediğiniz işlemi seciniz: 1:toplama 2:cıkarma 3:carpma 4:bölme" );
        islem = input.nextInt();

        switch (islem) {
            case 1 -> {
                sonuc = deger1 + deger2;
                System.out.print("sonuç:" + sonuc);
            }
            case 2 -> {
                sonuc = deger1 - deger2;
                System.out.print("sonuç:" + sonuc);
            }
            case 3 -> {
                sonuc = deger1 * deger2;
                System.out.print("sonuç:" + sonuc);
            }
            case 4 -> {
                sonuc = deger1 / deger2;
                System.out.print("sonuç:" + sonuc);
            }
        }




    }
}
