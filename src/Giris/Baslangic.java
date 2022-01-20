package Giris;
import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fiz, kim, turk,tar,muz;
        double notOrt;
        System.out.println("Sınav Notlarınızı Girdikten Sonra Not Ortalamanız Ekranda Gözükecektir.!");
        System.out.print("Matematik: ");
        mat = input.nextInt();
        System.out.print("Fizik: ");
        fiz = input.nextInt();
        System.out.print("Kimya: ");
        kim = input.nextInt();
        System.out.print("Türkçe: ");
        turk = input.nextInt();
        System.out.print("Tarih: ");
        tar= input.nextInt();
        System.out.print("Müzik: ");
        muz = input.nextInt();
        notOrt=(mat*12+fiz*6+kim*6+turk*10+tar*4+muz*2)/40.0;
        System.out.println("Not Ortalamanız = " + notOrt);
        boolean durum = notOrt >=70;
        String gecmeDurumu = durum ? "Sınıfı Geçtiniz, Tebrikler ! " : " Bir Sene Daha Bizimle Olacağınız İçin Mutluyuz !!";
        System.out.println(gecmeDurumu);










    }

}