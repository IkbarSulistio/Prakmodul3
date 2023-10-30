import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Selamat datang di Kalkulator Sederhana!");
            System.out.print("Masukkan angka pertama: ");
            double x = input.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double y = input.nextDouble();

            System.out.print("Masukkan operasi (+, -, *, /): ");
            char operator = input.next().charAt(0);

            double hasil= 0;

            switch (operator) {
                case '+':
                    hasil = x + y;
                    break;
                case '-':
                    hasil = x - y;
                    break;
                case '*':
                    hasil = x * y;
                    break;
                case '/':
                    if (y != 0) {
                        hasil = x / y;
                    } else {
                        System.out.println("Tidak bisa membagi dengan nol.");
                    }
                    break;
                default:
                    System.out.println("Operasi tidak valid.");
            }
        System.out.println("Hasil Operasi Hitung " + operator + " adalah " + hasil );
            input.close();
    }
}
