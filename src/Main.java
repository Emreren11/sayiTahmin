import java.util.Random;
import java.util.Scanner;

public class Main {
    static void arr(int[] ar) {
        for (int i : ar) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner inp = new Scanner(System.in);
        int number = rnd.nextInt(100);
        int right = 0;
        int selected;
        boolean control = false;
        int[] wrong = new int[5];
        System.out.println(number);
        while (right < 5) {
            System.out.print("Bir tahminde bulununuz: ");
            selected = inp.nextInt();
            if (selected < 0 || selected > 100) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz..!!");
                wrong[right++] = selected;
                System.out.println("Kalan tahmin hakkınız: " + (5 - right));
                continue;
            } else {
                if (selected == number) {
                    System.out.println("Tebrikler doğru tahmin ettiniz !");
                    System.out.print("Girdiğiniz sayılar: ");
                    arr(wrong);
                    control = true;
                    break;
                } else {
                    System.out.println("Yanlış tahmin !");
                    if (selected < number) {
                        System.out.println("Daha büyük bir sayı tahmin ediniz !");
                    } else {
                        System.out.println("Daha küçük bir sayı tahmin ediniz !");
                    }
                    wrong[right++] = selected;
                    System.out.println("Kalan tahmin hakkınız: " + (5 - right));
                }
            }
            System.out.println("============================");
        }
        if (control == false) {
            System.out.println("Kaybettiniz !");
            System.out.print("Girdiğiniz sayılar: ");
            arr(wrong);
        }
    }
}