package TemelHesaplamalar;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {


        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner not = new Scanner(System.in);

        System.out.print("matematik notu giriniz:");
        matematik = not.nextInt();

        System.out.print("fizik notu giriniz:");
        fizik = not.nextInt();

        System.out.print("kimya notu giriniz:");
        kimya = not.nextInt();

        System.out.print("türkçe notu giriniz:");
        turkce = not.nextInt();

        System.out.print("tarih notu giriniz:");
        tarih = not.nextInt();

        System.out.print("müzik notu giriniz:");
        muzik = not.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;

        System.out.println("Ortalamanız:" + sonuc);


    }
}
