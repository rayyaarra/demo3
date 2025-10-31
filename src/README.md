# 📏 Sistem Menghitung BMI (Body Mass Index)

## 🧩 Deskripsi
Program ini merupakan aplikasi sederhana berbasis **Java Console** untuk menghitung **BMI (Body Mass Index)** seseorang berdasarkan **berat badan (kg)** dan **tinggi badan (meter)**.  
Setelah pengguna memasukkan data, program akan menampilkan hasil perhitungan BMI beserta kategori berat badan (misalnya: kurus, normal, gemuk, atau obesitas).

---

## ⚙️ Struktur Program
Program terdiri dari beberapa kelas berikut:

1. **`MainApp.java`**
    - Kelas utama yang menjalankan program.
    - Mengambil input dari pengguna berupa berat dan tinggi.
    - Membuat objek dari kelas `BMI`.
    - Memanggil kelas `displayBMI` untuk menampilkan hasil.

2. **`BMI.java`**
    - Menyimpan atribut berat dan tinggi badan.
    - Menghitung nilai BMI dengan rumus:
      ```
      BMI = berat / (tinggi * tinggi)
      ```

3. **`displayBMI.java`**
    - Menampilkan hasil perhitungan BMI dan kategori berat badan.

---

## 💡 Fitur Utama
✅ Menghitung BMI berdasarkan input pengguna  
✅ Validasi input (tidak boleh 0 atau negatif)  
✅ Menampilkan hasil BMI dan kategori berat badan  
✅ Program berhenti otomatis jika input tidak valid

---

## 🧮 Rumus BMI
BMI= Berat Badan (kg) : (Tinggi badan (m)^2)

### Kategori Umum
| Kategori | Rentang BMI |
|-----------|--------------|
| Kurus | < 18.5 |
| Normal | 18.5 – 24.9 |
| Kelebihan berat badan | 25 – 29.9 |
| Obesitas | ≥ 30 |

---

## 🚀 Cara Menjalankan Program

1. **Buka terminal / CMD**
2. Arahkan ke folder proyek, misalnya:
   ```bash
   cd tugas3
