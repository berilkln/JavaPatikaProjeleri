package Loops;
import java.util.Scanner;

public class ATMprojesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String sifre, kullaniciadi;
        int secim;
        int bakiye = 1000;
        System.out.print("Kullanıcı adi giriniz: ");
        kullaniciadi = input.nextLine();

        System.out.print("Şifre giriniz: ");
        sifre = input.nextLine();

        if (kullaniciadi.equals("patika") && sifre.equals("dev123")) {
            System.out.print("Banka Hesabınıza Hoşgeldiniz\n");
            System.out.print(
                    """
                            1: Para Yatırma
                            2: Para Çekme
                            3: Bakiye Sorgulama
                            4: Çıkış
                            """);
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");

        } else {
            System.out.print("Hatalı giriş lütfen tekrar deneyiniz!");
        }
        secim = input.nextInt();


        switch (secim) {
            case 1:
                System.out.print("Para miktarı : ");
                int tutar = input.nextInt();
                bakiye += tutar;
                System.out.print("Yeni Bakiye: " + bakiye);
                break;

            case 2:
                System.out.print("Para miktarı: ");
                tutar = input.nextInt();
                if (tutar> bakiye) {
                    System.out.print("Yetersiz Bakiye!");
                } else {
                    bakiye -= tutar;
                    System.out.print("Yeni Bakiye:" + bakiye);
                }
                break;

            case 3:
                System.out.print("Bakiye: " + bakiye);
                break;

            case 4:
                System.out.print("Tekrar Görüşmek Üzere");
                break;

            default: System.out.print("Hatalı Seçim Lütfen Tekrar Deneyiniz!");


        }


}
}

