package Conditionals;
import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("matematik notu giriniz: ");
        matematik = input.nextInt();

        System.out.print("fizik notu giriniz: ");
        fizik = input.nextInt();

        System.out.print("turkce notu giriniz: ");
        turkce = input.nextInt();

        System.out.print("kimya notu giriniz: ");
        kimya = input.nextInt();

        System.out.print("muzik notu giriniz: ");
        muzik = input.nextInt();

        ortalama = (matematik + fizik + turkce + kimya + muzik) / 5.0;

        if (ortalama <=55) {
            System.out.print("sınıfta kaldınız!");
        }
        else {
            System.out.print("sınıfı gectiniz!");
        }




    }
}
