package TemelHesaplamalar;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, toplam;
        int kilo;

        Scanner input = new Scanner(System.in);

        System.out.print( " armut kaç kilo?");
        kilo = input.nextInt();
        armut = kilo * 2.14;

        System.out.print( " elma kaç kilo?");
        kilo = input.nextInt();
        elma = kilo * 3.67;

        System.out.print( " domates kaç kilo?");
        kilo = input.nextInt();
        domates = kilo * 1.11;

        System.out.print( " muz kaç kilo?");
        kilo = input.nextInt();
        muz = kilo * 0.95;

        System.out.print( " patlican kaç kilo?");
        kilo = input.nextInt();
        patlican = kilo * 5.00;

        toplam = armut + elma + domates + muz + patlican;
        System.out.print("toplam tutar:" + toplam +"TL");





    }
}
