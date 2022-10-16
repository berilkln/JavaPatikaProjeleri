package Loops;
import java.util.Scanner;

public class EbobEkokHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n1 değerini giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 değerini giriniz: ");
        int n2 = input.nextInt();
        int ebob = 1;



        // EBOB HESAPLAMA //
        int i = 0;
        while (i <= n1) {
            i++;

            if (n1 % i == 0 && n2 % i == 0) {
               //System.out.println(i);
                ebob = i;
            }

        }
        System.out.println("ebob: " + ebob);
        //------------------------------//


        // EKOK HESAPLAMA //

        int j =1;

        while (j <= (n1 * n2)) {
            j++;

            if (j % n1 == 0 && j % n2 == 0) {
                System.out.print("ekok: " + j);
                break;
            }
        }



    }
}
