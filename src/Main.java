import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo, endeks;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz :");
        boy = input.nextDouble();

        System.out.print("Lütfen Kilonuzu giriniz :");
        kilo = input.nextDouble();

        endeks = kilo / (boy * boy);

        System.out.print("Vücut Kitle Endeksiniz :" + endeks);
    }
}