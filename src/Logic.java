import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        // Logika IF-ELSE
        if (angka % 2 == 0) {
            System.out.println(angka + " adalah angka Genap.");
        } else {
            System.out.println(angka + " adalah angka Ganjil.");
        }
    }
}
