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
[HTML](https://refindo-tech.github.io/katalon-automation-simikro/Smoke/R_Smoke_LoginLogoutAllRole.html)

### 🔹 Regression Test
- **Collection**:
[HTML](https://refindo-tech.github.io/katalon-automation-simikro/Regression/Collection/R_Regression_CheckSubmission.html)
- **Chrome**:
[HTML](https://refindo-tech.github.io/katalon-automation-simikro/Regression/Chrome/R_Regression_CheckSubmission.html)
- **Firefox**:
[HTML](https://refindo-tech.github.io/katalon-automation-simikro/Regression/Firefox/R_Regression_CheckSubmission.html)
- **Edge**:
[HTML](https://refindo-tech.github.io/katalon-automation-simikro/Regression/Edge/R_Regression_CheckSubmission.html)

### 🔹 End-To-End Test
- **Collection**:
[HTML](https://refindo-tech.github.io/katalon-automation-simikro/End-To-End/Collection/R_EndToEnd.html)
- **Chrome**:
[HTML](https://refindo-tech.github.io/katalon-automation-simikro/End-To-End/Chrome/R_EndToEnd_Chrome.html)
- **Firefox**:
[HTML](https://refindo-tech.github.io/katalon-automation-simikro/End-To-End/Firefox/R_EndToEnd_Firefox.html)
- **Edge**:
[HTML](https://refindo-tech.github.io/katalon-automation-simikro/End-To-End/Edge/R_EndToEnd_Edge.html)

