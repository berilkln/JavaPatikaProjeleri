package Conditionals;

import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {


        int yas, mesafe, tip;
        double ucret;


        Scanner input = new Scanner(System.in);

        System.out.print("lütfen Yaşınızı Giriniz: ");
        yas = input.nextInt();

        System.out.print("Lütfen Gideceğiniz Mesafeyi Giriniz (km cinsinden): ");
        mesafe = input.nextInt();

        System.out.print("lütfen Yolculuk Tipi Seçiniz(1:tek yon, 2:gidiş-dönüş : ");
        tip = input.nextInt();

        if (!(tip == 1 || tip == 2) || (yas <= 0) || (mesafe <= 0)){
            System.out.println("Hatalı Veri Girdiniz!");
        }

        switch (tip) {
            case 1 -> {
                ucret = mesafe * 0.10;
                if (yas < 12) {
                    System.out.println("İndirimsiz toplam tutar : " + ucret + "TL");
                    ucret -= ucret * (0.50);
                    System.out.println("indirimli toplam tutar (%50): " + ucret + "TL");
                } else if (yas > 12 && yas < 24) {
                    System.out.println("İndirimsiz toplam tutar : " + ucret + "TL");
                    ucret -= ucret * (0.10);
                    System.out.println("indirimli toplam tutar (%10): " + ucret + "TL");
                } else if (yas > 65) {
                    System.out.println("İndirimsiz toplam tutar : " + ucret + "TL");
                    ucret -= ucret * (0.30);
                    System.out.println("indirimli tutar (%30): " + ucret + "TL");
                } else {
                    System.out.println("İndirimsiz toplam tutar : " + ucret + "TL");
                }
            }
            case 2 -> {
                ucret = mesafe * 2 * 0.10;
                if (yas < 12) {
                    System.out.println("İndirimsiz toplam tutar : " + ucret + "TL");
                    ucret -= ucret * (0.50);
                    System.out.println("indirimli toplam tutar (%50): " + ucret + "TL");
                } else if (yas > 12 && yas < 24) {
                    System.out.println("İndirimsiz toplam tutar : " + ucret + "TL");
                    ucret -= ucret * (0.10);
                    System.out.println("indirimli toplam tutar (%10): " + ucret + "TL");
                } else if (yas > 65) {
                    System.out.println("İndirimsiz toplam tutar : " + ucret + "TL");
                    ucret -= ucret * (0.30);
                    System.out.println("indirimli tutar (%30): " + ucret + "TL");
                } else {
                    ucret -= ucret * (0.20);
                    System.out.println("İndirimsiz toplam tutar : "+  ucret + "TL");
                }
            }
        }

    }
}
