import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a ,b ,sonuc;

        System.out.print("Birinci değeri giriniz :");a=input.nextInt();
        System.out.print("İkinci değeri giriniz :");b=input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma\nLütfen İşlem Seçiniz :");sonuc=input.nextInt();

        if (sonuc==1){
            System.out.println(a+b);
        } else if (sonuc ==2) {
            System.out.println(a-b);
        } else if (sonuc==3){
            System.out.println(a*b);
        } else if (sonuc==4){
            System.out.println(a/b);
        } else {
            System.out.println("HATALI TUŞLAMA YAPTINIZ...");
        }

    }
}