package TemelHesaplamalar;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {

        double boy, VKI;  //vki = vücut kitle indeksi
        int kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("lütfen boyunuzu(m) giriniz: ");
        boy = input.nextDouble();

        System.out.print("lütfen kilonuzu(kg) giriniz: ");
        kilo = input.nextInt();

        VKI = kilo / (boy*boy);
        System.out.print("Vücut Kitle İndeksiniz:" + VKI);









    }
}
