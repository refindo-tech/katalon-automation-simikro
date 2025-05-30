# QA Automation Project: Simikro

## ✨ Penjelasan Singkat AUT (Application Under Test)
Simikro adalah sistem digital inovatif yang dirancang untuk mempermudah evaluasi capaian microskill dalam program Merdeka Belajar Kampus Merdeka (MBKM). Dengan platform ini, mahasiswa dan dosen dapat mengakses, menilai, serta mengonversi capaian microskill ke dalam Sistem Kredit Semester (SKS) dengan lebih transparan dan efisien.
Mahasiswa dapat memantau hasil evaluasi secara real-time, memahami standar penilaian, serta mendapatkan umpan balik langsung dari dosen. Sementara itu, dosen dapat melakukan penilaian dengan lebih sistematis melalui format standar yang disediakan. Rekapitulasi hasil evaluasi juga dapat dikelola secara otomatis, meningkatkan transparansi, akurasi, dan efisiensi dalam proses evaluasi capaian pembelajaran mahasiswa.

## 🧪 Tujuan Repo
Melakukan automation testing terhadap sistem Simikro menggunakan Katalon di lingkungan lokal.

## 🛠 Tools
- Katalon Studio
- Groovy
- Git

## 📁 Struktur Proyek
- `Test Cases/`: Kumpulan skenario pengujian
- `Test Suites/`: Gabungan test case dalam batch
- `Object Repository/`: Elemen UI yang digunakan
- `Report Document/`: Dokumen laporan hasil pengujian

## 🔁 Siklus QA
1. **Perencanaan**: Identifikasi test case dari spesifikasi fitur
2. **Implementasi**: Penulisan test case dengan Katalon Studio (Groovy)
3. **Eksekusi**: Menjalankan test suite secara lokal
4. **Pelaporan**: Generate laporan dalam format HTML, CSV, dan PDF

## 📊 Laporan Hasil Pengujian
Laporan pengujian dibagi berdasarkan jenis pengujian:

### 🔹 Smoke Test
- **Chrome**:
[HTML Report](http://refindo.site/Report%20Document/Smoke/R_Smoke_LoginLogoutAllRole.html)

### 🔹 Regression Test
- **Collection**:
[HTML](http://refindo.site/Report%20Document/Regression/Collection/R_Regression_CheckSubmission.html)
- **Chrome**:
[HTML](http://refindo.site/Report%20Document/Regression/Chrome/R_Regression_CheckSubmission.html)
- **Firefox**:
[HTML](http://refindo.site/Report%20Document/Regression/Firefox/R_Regression_CheckSubmission.html)
- **Edge**:
[HTML](http://refindo.site/Report%20Document/Regression/Edge/R_Regression_CheckSubmission.html)

### 🔹 End-To-End Test
- **Collection**:
[HTML](http://refindo.site/Report%20Document/End-To-End/Collection/R_EndToEnd.html)
- **Chrome**:
[HTML](http://refindo.site/Report%20Document/End-To-End/Chrome/R_EndToEnd.html)
- **Firefox**:
[HTML](http://refindo.site/Report%20Document/End-To-End/Firefox/R_EndToEnd.html)
- **Edge**:
[HTML](http://refindo.site/Report%20Document/End-To-End/Edge/R_EndToEnd.html)

