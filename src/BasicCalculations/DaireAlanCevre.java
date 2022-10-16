package BasicCalculations;

import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        int r;
        double alan, cevre;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("dairenin yarıçapını giriniz: ");

        r = input.nextInt();

        cevre = 2 * pi * r;
        alan = pi * r * r;

        System.out.println("cevre:" + cevre);
        System.out.print("alan:" + alan);


    }
}
