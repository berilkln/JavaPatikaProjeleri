package Donguler;
import java.util.Scanner;


public class TamBolenSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;  //kullanıcının girdiği deger
        int toplam = 0, sayiadedi = 0, ortalama;


        System.out.print("Bir Sayı Giriniz: ");
        x = input.nextInt();


        for (int i=1; i<x; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)){
                toplam += i;
                sayiadedi++;
            }
        }
        if (sayiadedi > 0) {
            ortalama = toplam / sayiadedi;
            System.out.print(ortalama);
        }else {
            System.out.print("3'e ve 4'e tam bölünen bir sayı yok");
        }


    }
}
