package not_ortalamasi_hesap;

import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik; //Değişkenler tanımlandı.
        Scanner input = new Scanner(System.in); //Scanner sınıfı tanımlandı.
        //Kullanıcıdan değerlerin istenmesi.
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        float ortalama = (mat + fizik + kimya + turkce + tarih + muzik)/6f; //Ortalama hesabı.

        System.out.println("Ortalamanız: "+ortalama);

        String sonuc;// String tipinde değişken tanımlandı.

        sonuc = ortalama >= 60 ? "Sınıfı Geçti.": "Sınıfta Kaldı."; //Geçme ve kalma durumu kontrolü.

        System.out.println(sonuc);

    }
}
