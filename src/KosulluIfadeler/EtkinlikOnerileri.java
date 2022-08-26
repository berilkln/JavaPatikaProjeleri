package KosulluIfadeler;
import java.util.Scanner;

public class EtkinlikOnerileri {
    public static void main(String[] args) {
        int derece;
        Scanner input = new Scanner(System.in);

        System.out.print("Hava Sıcaklığı Giriniz: ");
        derece = input.nextInt();

        if (derece <= 5) {
            System.out.print("Kayak Yapabilirsiniz!");
        } else if (derece<=25) {
            if (derece <=15 ){
                System.out.print("Sinemaya Gidebilirsiniz!");
            }
            if (derece >=10 ){
                System.out.print("Piknik Yapabilirsiniz!");
            }
        } else {
            System.out.print("Yüzmeye Gidebilirsiniz!");
        }
    }
}
