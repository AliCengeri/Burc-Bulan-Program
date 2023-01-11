import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d, m;
        System.out.print("Kaçıncı ayda doğduğunuzu giriniz: ");
        m = input.nextInt();
        System.out.print("Hangi gün doğduğunuzu giriniz: ");
        d = input.nextInt();
        if ((m == 3 && d >= 21) || (m == 4 && d <= 20)) {
            System.out.println("Koç burcusunuz.");
        }
        if ((m == 4 && d >= 21) || (m == 5 && d <= 21)) {
            System.out.println("Boğa burcusunuz.");
        }
        if ((m == 5 && d >= 22) || (m == 6 && d <= 22)) {
            System.out.println("İkizler burcusunuz.");
        }
        if ((m == 6 && d >= 23) || (m == 7 && d <= 22)) {
            System.out.println("Yengeç burcusunuz.");
        }
        if ((m == 7 && d >= 23) || (m == 8 && d <= 22)) {
            System.out.println("Aslan burcusunuz.");
        }
        if ((m == 8 && d >= 23) || (m == 9 && d <= 22)) {
            System.out.println("Başak burcusunuz.");
        }
        if ((m == 9 && d >= 22) || (m == 10 && d <= 22)) {
            System.out.println("Terazi burcusunuz.");
        }
        if ((m == 10 && d >= 23) || (m == 11 && d <= 21)) {
            System.out.println("Akrep burcusunuz.");
        }
        if ((m == 11 && d >= 22) || (m == 12 && d <= 21)) {
            System.out.println("Yay burcusunuz.");
        }
        if ((m == 12 && d >= 22) || (m == 1 && d <= 21)) {
            System.out.println("Oğlak burcusunuz.");
        }
        if ((m == 1 && d >= 22) || (m == 2 && d <= 19)) {
            System.out.println("Kova burcusunuz.");
        }
        if ((m == 2 && d >= 20) || (m == 3 && d <= 20)) {
            System.out.println("Balık burcusunuz.");
        }

    }
}