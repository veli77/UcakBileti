import java.util.Scanner;
//import java.util.
public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int mesafe, yas, tip;
        double tutar,yasindirim=1.0;
        System.out.println("Mesafeyi km Cinsinden Giriniz :");
        mesafe = giris.nextInt();
        if(mesafe<0){
            System.out.println("Hatalı Veri Girdiniz!");
            System.exit(0);
        }
        tutar = mesafe * 0.1;

        System.out.println("Yaşınızı Giriniz :");
        yas = giris.nextInt();
        if(yas<0){
            System.out.println("Hatalı Veri Girdiniz!");
            System.exit(0);
        }
        if(yas < 12){
            yasindirim = 0.5;
        } else if (yas <= 24) {
            yasindirim = 0.9;
        } else if (yas > 65) {
            yasindirim = 0.7;
        }
        tutar = tutar  * yasindirim;

        System.out.println("Yolculuk Tipini Giriniz (1=>TekYön, 2=>GidişDönüş :");
        tip = giris.nextInt();
        if(tip < 1 | tip > 2){
            System.out.println("Hatalı Veri Girdiniz!");
            System.exit(0);
        }
        tutar = (tip == 1) ? tutar : tutar-((tutar/100)*20);
        tutar = tutar * tip;
        System.out.println("Toplam Tutar"+tutar);

























    }




}
