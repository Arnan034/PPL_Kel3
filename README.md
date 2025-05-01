# 📘 Tugas Kelompok: Pengujian Perangkat Lunak

## 🧑‍🤝‍🧑 Anggota Kelompok
- 221524034 | Arnanda Prasatya
- 221524050 | Muhammad Hanif
- 221524060 | Zahran Anugerah Rizqullah

## 💻 Deskripsi Program

Proyek ini merupakan implementasi **program kalkulator dasar** sebagai bagian dari tugas mata kuliah *Pengujian Perangkat Lunak*. Aplikasi dikembangkan menggunakan bahasa **Java** dan sistem build **Maven**.

### ✨ Fitur Program:
- Operasi dasar: `+`, `-`, `*`, `/`
- Input format: `<angka1> <operator> <angka2>`
- Validasi format input
- Penanganan input `keluar` untuk mengakhiri program

## 🧪 Automation Unit Testing

Dalam proyek ini, kami juga menerapkan **unit testing otomatis** menggunakan framework **JUnit 5**, dengan cakupan pengujian sebagai berikut:

- **Validasi**:
  - Format input terdiri dari 3 bagian
    - Penanganan input kosong
    - Penanganan jumlah format tidak valid
    - Validasi angka pertama dan kedua

  - Range Number (-32768 ~ 32768)
  - Operasi Valid ( + , - , / , * )
  - Validasi Pembagian =! 0

- **Operasi**:
  - Penjumlahan, pengurangan, perkalian, pembagian
  - Kasus angka negatif, nol, dan batas integer

- **Input Scanner**:
  - Simulasi input menggunakan `System.in`
  - Penanganan input valid dan perintah `keluar`

### 📦 Tools & Dependencies:
- Java 21
- Maven
- JUnit 5

## ▶️ Cara Menjalankan Program

```bash
mvn clean compile exec:java -Dexec.mainClass="com.b3.kalkulator.KalkulatorApplication"
```

## ▶️ Cara Menjalankan Unit Testing
```bash
mvn test
```