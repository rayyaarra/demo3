import java.util.Scanner;

/**
 * Kelas utama untuk menjalankan program Sistem Menghitung BMI.
 * <p>
 * Program ini meminta input berat dan tinggi badan dari pengguna,
 * kemudian menghitung dan menampilkan hasil BMI beserta kategorinya.
 * </p>
 *
 * @author Rayya
 * @version 1.0
 */
public class MainApp {

    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Sistem Menghitung BMI ===");

        double berat = mintaInput(sc, "Masukkan berat badan (kg): ");
        double tinggi = mintaInput(sc, "Masukkan tinggi badan (m): ");

        displayBMI bmi = new displayBMI(berat, tinggi);

        BMI.tampilkanHasil(bmi);

        sc.close();
    }

    /**
     * Meminta input angka dari pengguna dan melakukan validasi.
     * Jika nilai kurang dari atau sama dengan nol, program akan berhenti.
     *
     * @param input objek Scanner untuk membaca input pengguna
     * @param pesan pesan yang akan ditampilkan di console
     * @return nilai input yang valid (lebih besar dari 0)
     */
    private static double mintaInput(Scanner input, String pesan) {
        System.out.print(pesan);
        double nilai = input.nextDouble();
        if (nilai <= 0) {
            System.out.println("Input tidak valid, nilai harus lebih besar dari 0!");
            System.exit(0);
        }
        return nilai;
    }
}
