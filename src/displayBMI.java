/**
 * Kelas BMI digunakan untuk menghitung dan menyimpan nilai
 * Body Mass Index (BMI) seseorang berdasarkan berat dan tinggi badan.
 * <p>
 * Rumus perhitungan:
 * <pre>
 *     BMI = berat / (tinggi * tinggi)
 * </pre>
 * </p>
 *
 * Kategori BMI:
 * <ul>
 * <li>Kurus: &lt; 18.5</li>
 * <li>Normal: 18.5 – 24.9</li>
 * <li>Kelebihan berat: 25 – 29.9</li>
 * <li>Obesitas: ≥ 30</li>
 * </ul>
 *
 * @author Nama
 * @version 1.0
 */
public class displayBMI {
    private double berat;
    private double tinggi;

    /**
     * Konstruktor untuk membuat objek BMI dengan berat dan tinggi badan.
     *
     * @param berat berat badan dalam kilogram
     * @param tinggi tinggi badan dalam meter
     */
    public displayBMI(double berat, double tinggi) {
        this.berat = berat;
        this.tinggi = tinggi;
    }

    /**
     * Menghitung nilai BMI berdasarkan berat dan tinggi badan.
     *
     * @return nilai BMI dalam bentuk double
     */
    public double hitungBMI() {
        return berat / (tinggi * tinggi);
    }

    /**
     * Menentukan kategori berat badan berdasarkan hasil BMI.
     *
     * @return kategori berat badan dalam bentuk teks
     */
    public String getKategori() {
        double nilaiBMI = hitungBMI();
        if (nilaiBMI < 18.5) {
            return "Kurus";
        } else if (nilaiBMI < 25) {
            return "Normal";
        } else if (nilaiBMI < 30) {
            return "Kelebihan Berat Badan";
        } else {
            return "Obesitas";
        }
    }

    /**
     * Mengambil nilai berat badan pengguna.
     *
     * @return berat badan (kg)
     */
    public double getBerat() {
        return berat;
    }

    /**
     * Mengambil nilai tinggi badan pengguna.
     *
     * @return tinggi badan (m)
     */
    public double getTinggi() {
        return tinggi;
    }
}
