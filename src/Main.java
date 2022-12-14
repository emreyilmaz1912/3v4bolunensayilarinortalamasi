import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz!");
        double sayi, ortalama, toplam=0, n=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz :");
        sayi=input.nextInt();
        for (int i =1; i <= sayi; i++){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.print(i);
                toplam = toplam + i;
                n++;

            }
        }
        ortalama = toplam/n;
        if (toplam != 0){
            System.out.println("3 ve 4'e bölünebilen sayıların ortalaması:"+ortalama);
        }else {
            System.out.println("3 ve 4'e bölünebilen sayı bulunmamaktadır");
        }
    }
}