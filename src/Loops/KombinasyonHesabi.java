package Loops;
import java.util.Scanner;

public class KombinasyonHesabi {
    public static void main(String[] args) {

        // N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        //Kombinasyon formülü
        //C(n,r) = n! / (r! * (n-r)!)

        int n, r, fakt_n = 1, fakt_r = 1, fakt_nr = 1;
        int kombinasyon;

        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        n = input.nextInt();
        System.out.print("r değerini giriniz: ");
        r = input.nextInt();


            if (r>n) {
                System.out.println("n değerini r değerinden büyük olmalı!");

            }
            for (int i=1; i<=n; i++) {
                fakt_n *= i;
            }

            for (int j=1; j<=r; j++) {
                fakt_r *= j;
            }

            for (int k=1; k<(n-r); k++) {
                fakt_nr *= k;
            }

            kombinasyon = fakt_n / (fakt_r * fakt_nr);
            System.out.print(kombinasyon);






    }
}
