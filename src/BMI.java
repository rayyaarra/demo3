/**
 * Kelas DisplayBMI bertugas untuk menampilkan hasil perhitungan
 * BMI ke layar (console). Kelas ini memisahkan logika tampilan
 * dari logika perhitungan BMI.
 *
 * @author Nama
 * @version 1.0
 */
public class BMI {

    /**
     * Menampilkan hasil perhitungan BMI dan kategori berat badan ke console.
     *
     * @param bmi objek dari kelas BMI yang berisi data berat, tinggi, dan hasil perhitungan
     */
    public static void tampilkanHasil(displayBMI bmi) {
        double nilaiBMI = bmi.hitungBMI();
        String kategori = bmi.getKategori();

        System.out.println("BMI Anda: " + String.format("%.2f", nilaiBMI));
        System.out.println("Kategori: " + kategori);

    }
}
