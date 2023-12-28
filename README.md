**README: Program Java BangunDatarRuang**

Deskripsi
Program Java ini, bernama BangunDatarRuang, merupakan aplikasi berbasis konsol yang dirancang untuk melakukan perhitungan terkait bangun datar (dua dimensi) dan bangun ruang (tiga dimensi). Pengguna berinteraksi dengan program ini dengan memilih berbagai opsi dari menu untuk menghitung luas, keliling, volume, atau luas permukaan dari bentuk geometri tertentu.

**Fitur**

1. Bangun Datar (Bentuk Dua Dimensi)

Persegi:

Menghitung luas.
Menghitung keliling.
Persegi Panjang:

Menghitung luas.
Menghitung keliling.
Lingkaran:

Menghitung luas.
Menghitung keliling.

2. Bangun Ruang (Bentuk Tiga Dimensi)

Kubus:

Menghitung volume.
Menghitung Keliling.

Balok:

Menghitung volume.
Menghitung Keliling.

Bola:

Menghitung volume.
Menghitung Keliling.

Penggunaan

Program menyediakan menu utama dengan opsi untuk memilih antara bentuk dua dimensi, bentuk tiga dimensi, atau keluar dari program.

Dalam setiap kategori, pengguna dapat memilih bentuk tertentu dan melakukan perhitungan terkait bentuk tersebut.

Semua masukan pengguna dan hasil perhitungan dicatat ke dalam file history.txt untuk referensi.

Program menangani validasi input untuk nilai non-positif dan jenis input yang salah.

Pencatatan pada File

Program menggunakan BufferedWriter untuk menambahkan hasil ke file history.txt. Setiap entri dalam file mencakup informasi tentang kategori (Bangun Datar atau Bangun Ruang), bentuk spesifik, jenis perhitungan (Luas atau Keliling), dan hasil perhitungan.

Larangan Input

Program ini menerapkan beberapa aturan terkait dengan input pengguna untuk memastikan perhitungan yang benar dan mencegah kesalahan. Berikut adalah larangan-larangan yang harus dihindari:

Sisi, Panjang, Lebar, Tinggi, dan Jari-Jari:

Harus lebih dari 0 dan maksimal 9999. Input dengan nilai 0 ,kuran dari 0 dan lebih dari 9999 tidak diperbolehkan.
Menu Pilihan:

Hanya menerima input berupa angka sesuai dengan pilihan yang tersedia pada menu.
Input Jenis Data:

Hanya menerima input berupa angka untuk data numerik. Input huruf atau karakter khusus dapat menyebabkan InputMismatchException.
File "history.txt":

Program dapat mengalami kesalahan saat membuka atau menulis ke file "history.txt". Pastikan file tersebut dapat diakses dan ditulis oleh program.
