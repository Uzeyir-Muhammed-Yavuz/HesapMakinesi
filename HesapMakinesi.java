import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double n1, n2;
        int slc;

        System.out.print("İşlem yapmak istediğiniz 1. sayıyı giriniz :");
        n1 = inp.nextDouble();
        System.out.print("İşlem yapmak istediğiniz 2. sayıyı giriniz :");
        n2 = inp.nextDouble();
        System.out.println("1-Toplama :\n2-Çıkarma :\n3-Çarpma :\n4-Bölme :");
        System.out.print("Yapmak istediğiniz işlemi seçiniz :");
        slc = inp.nextInt();
        switch (slc) {
            case 1:
                System.out.print("Toplama işleminizin sonucu :" + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma işleminizin sonucu :" + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma işleminizin sonucu :" + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme işleminizin sonucu :" + (n1 / n2));
                break;
                }else{
                    System.out.println("Bir sayı 0' a bölünemez!");
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız tekrar deneyiniz!");
        }


    }
}
