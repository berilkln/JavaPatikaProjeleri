import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {

        int km;
        double ucret;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz: ");
        km = input.nextInt();

        ucret = (km * 2.20) + 10;

        ucret = (ucret<20) ? 20 : ucret;  // minimum tutarı 20tl yap.

        System.out.print("ödenecek tutar:" + ucret);


    }
}
