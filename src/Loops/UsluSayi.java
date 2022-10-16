package Loops;
import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        // Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan program

        int x, y;  // x^y
        int toplam =1;
        Scanner input = new Scanner(System.in);

        System.out.print("üssü alınacak sayı: ");
        x = input.nextInt();

        System.out.print("üs olarak alınacak sayı: ");
        y = input.nextInt();

        for (int i= 1; i <= y; i++) {
            toplam *= x;
        }
        System.out.print(toplam);


    }
}
