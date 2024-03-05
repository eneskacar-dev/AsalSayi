import java.util.Scanner;

public class Main {

    static boolean isPrime(int number, int divisor) {
        if (number <= 2)
            return (number == 2) ? true : false;
        if (number % divisor == 0)
            return false;
        if (divisor * divisor > number)
            return true;
        return isPrime(number, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Sayı Giriniz: ");
            int num = scanner.nextInt();

            if (num < 2) {
                System.out.println(num + " sayısı ASAL değildir !");
                continue;
            }

            if (isPrime(num, 2)) {
                System.out.println(num + " sayısı ASALDIR !");
            } else {
                System.out.println(num + " sayısı ASAL değildir !");
            }
        }
    }
}
