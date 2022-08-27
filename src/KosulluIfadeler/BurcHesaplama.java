package KosulluIfadeler;
import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args) {

        int gun, ay;

        Scanner input = new Scanner(System.in);

        System.out.print("lütfen bir ay seciniz: ");
        ay = input.nextInt();

        System.out.print("lütfen bir gün giriniz: ");
        gun = input.nextInt();

        switch (ay) {
            case 1:
                if (gun<22) {
                    System.out.print("Oğlak burcu");
                } else if (gun>22 && gun<30){
                    System.out.print("Kova burcu");
                }
                else {
                    System.out.print("hatalı gün girdiniz!");
                }
                break;
            case 2:
                if (gun<20) {
                    System.out.print("Kova burcu");
                }else if (gun>20 && gun<29){
                    System.out.print("Balık burcu");
                }
                else {
                    System.out.print("hatalı gün girdiniz!");
                }
                break;
            case 3:
                if (gun<21) {
                    System.out.print("Balık burcu");
                }else if (gun>21 && gun<31){
                    System.out.print("Koç burcu");
                }
                else {
                    System.out.print("hatalı gün girdiniz!");
                }
                break;
            case 4:
                if (gun<21) {
                    System.out.print("Koç burcu");
                }else if (gun>21 && gun<30){
                    System.out.print("Boğa burcu");
                }
                else {
                    System.out.print("hatalı gün girdiniz!");
                }
                break;
            case 5:
                if (gun<22) {
                    System.out.print("Boğa burcu");
                }else if (gun>22 && gun<31){
                    System.out.print("İkizler burcu");
                }
                else {
                    System.out.print("hatalı gün girdiniz!");
                }
                break;
            case 6:
                if (gun<23) {
                    System.out.print("İkizler burcu");
                }else if (gun>23 && gun<30){
                    System.out.print("Yengeç burcu");
                }
                else {
                    System.out.print("hatalı gün girdiniz!");
                }
                break;
            case 7:
                if (gun<23) {
                    System.out.print("Yengeç burcu");
                }else if (gun>23 && gun<31){
                    System.out.print("Aslan burcu");
                }
                else {
                    System.out.print("hatalı gün girdiniz!");
                }
                break;
            case 8:
                if (gun<23) {
                    System.out.print("Aslan burcu");
                }else if (gun>23 && gun<30){
                    System.out.print("Başak burcu");
                }
                else {
                    System.out.print("hatalı gün girdiniz!");
                }
                break;
            case 9:
                if (gun<23) {
                    System.out.print("Başak burcu");
                }else if (gun>23 && gun<31){
                    System.out.print("Terazi burcu");
                }
                else {
                    System.out.print("hatalı gün girdiniz!");
                }
                break;
            case 10:
                if (gun<23) {
                    System.out.print("Terazi burcu");
                }else if (gun>23 && gun<30){
                    System.out.print("Akrep burcu");
                }
                else {
                    System.out.print("hatalı gün girdiniz!");
                }
                break;
            case 11:
                if (gun<22) {
                    System.out.print("Akrep burcu");
                }else if (gun>22 && gun<31){
                    System.out.print("Yay burcu");
                }
                else {
                    System.out.print("hatalı gün girdiniz!");
                }
                break;
            case 12:
                if (gun<22) {
                    System.out.print("Yay burcu");
                }else if (gun>22 && gun<30){
                    System.out.print("Oğlak burcu");
                }
                else {
                    System.out.print("hatalı gün girdiniz!");
                }
                break;
            default:
                System.out.print("HATALI BİR AY GİRDİNİZ!");

        }

    }
}

