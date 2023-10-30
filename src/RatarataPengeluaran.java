import java.util.Scanner;

/**
 * Kelas yang merepresentasikan Kalkulator Rata-Rata Pengeluaran.
 */
public class RatarataPengeluaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /**
         * Meminta jumlah pengeluaran dari pengguna.
         * @param totalPengeluaran total dari pengeluaran
         * @param jumlahPengeluaran pengeluaran yang diinginkan
         */
        System.out.print("Berapa hari pengeluaran yang ingin Anda hitung? ");
        int jumlahPengeluaran = input.nextInt();
        double totalPengeluaran = 0;

        /**
         * Memeriksa apakah jumlah pengeluaran lebih dari 0.
         */
        if (jumlahPengeluaran <= 0) {
            System.out.println("Tidak ada pengeluaran untuk dihitung.");
            input.close();
            return;
        }

        /**
         * Meminta pengguna memasukkan pengeluaran harian
         * @param pengeluaran
         */
        for (int i = 1; i <= jumlahPengeluaran; i++) {
            System.out.print("Hari ke-" + i + ": ");
            double pengeluaran = input.nextDouble();
            totalPengeluaran += pengeluaran;
        }

        /**
         * Menghitung rata-rata pengeluaran dan menampilkannya.
         * @param rataRata hasil dari operasi hitung
         */
        double rataRata = totalPengeluaran / jumlahPengeluaran;
        System.out.println("Rata-rata pengeluaran Anda adalah: " + rataRata);

        /**
         * Menutup scanner
         */
        input.close();
    }
}
