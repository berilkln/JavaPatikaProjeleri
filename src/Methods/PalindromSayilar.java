package Methods;
import java.util.Scanner;

public class PalindromSayilar {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        //reverseNumber: girilen sayının tersini atadığımız sayı
        //last number: sayının son basamağını tutan değişken

        while (temp != 0) {
            lastNumber = temp % 10;   //sayının son basamağını alıyoruz
            reverseNumber = (reverseNumber *10) + lastNumber;
            temp /= 10;  //gecici sayımızı bir basamak azaltıp başa dönüyoruz
        }

        if (number == reverseNumber) {
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int number = input.nextInt();

        System.out.println(isPalindrom(number));

    }
}
