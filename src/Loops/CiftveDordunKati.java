package Loops;
import java.util.Scanner;
public class CiftveDordunKati {
    public static void main(String[] args) {

        //Tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        // girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program
        int n;
        int toplam = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("bir sayı giriniz: ");
            n = input.nextInt();
            if (n%4 == 0){
                toplam += n;
            }

        }while (n%2 == 0);  // tek sayı giriline kadar döngü devam eder.

        System.out.print("toplam:" + toplam);

    }
}
