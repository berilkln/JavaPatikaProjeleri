package BasicCalculations;

import java.util.Scanner;
public class HipotenusHesaplama {
    public static void main(String[] args) {
        int a, b;// üçgenin kenarları a-b-c
        double c;

        Scanner input = new Scanner(System.in);
        System.out.print("üçgenin ilk kenarını giriniz: ");
        a = input.nextInt();

        System.out.print("üçgenin diger kenarını giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.print("hipotenüs = " + c);








    }
}

