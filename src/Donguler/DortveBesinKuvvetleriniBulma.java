package Donguler;
import java.util.Scanner;

public class DortveBesinKuvvetleriniBulma {
    public static void main(String[] args) {

        //Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program.

        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Değer Giriniz: ");
        x = input.nextInt();


        System.out.print("4'ün kuvvetleri: ");
        for (int i= 1; i<=x; i*=4) {
            System.out.print(i + " ");
        }

        System.out.println( );

        System.out.print("5'in kuvvetleri: ");
        for (int i= 1; i<=x; i*=5) {
            System.out.print(i + " ");
        }

    }
}

