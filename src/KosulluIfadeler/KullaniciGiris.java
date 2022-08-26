package KosulluIfadeler;
import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String Sifre, KullaniciAdi;

        Scanner input = new Scanner(System.in);
        System.out.print("kullanıcı adı giriniz: ");
        KullaniciAdi = input.nextLine();

        System.out.print("sifre giriniz: ");
        Sifre = input.nextLine();

        if (KullaniciAdi.equals("patika") && Sifre.equals("patika123")) {
            System.out.print("giriş başarılı!");
        }
        else {
            System.out.print("hatalı giriş");
        }
    }
}
