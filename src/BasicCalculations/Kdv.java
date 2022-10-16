package BasicCalculations;

import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18 ;
        Scanner input = new Scanner(System.in);
        System.out.print("miktarı giriniz: ");
        tutar = input.nextDouble();

        double kdvTutar = tutar *kdvOran;
        double toplamTutar = kdvTutar + tutar;
        System.out.println("KDV'li Tutar: " + toplamTutar);
    }

}

