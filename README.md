# Penjelasan Program UTS Pemrograman Berorientasi Objek

## Deskripsi
File ini berisi penjelasan dua program sederhana yang digunakan untuk menyelesaikan tugas UTS matakuliah **Pemrograman Berorientasi Objek**. Program ditulis dengan gaya penulisan kode yang mudah dipahami oleh pemula, menggunakan array dan struktur kontrol dasar.

---

## nomor1.java
### Tujuan
Program ini digunakan untuk mencatat data beberapa siswa, menampilkan data, dan menghitung rata-rata nilai siswa.

### Penjelasan Kode
- User diminta memasukkan berapa banyak siswa yang akan diinput.
- Nama dan nilai siswa disimpan dalam array bertipe `String[]` dan `int[]`.
- Menggunakan loop `for` untuk menginput nama dan nilai setiap siswa.
- Nilai semua siswa dijumlahkan, lalu dibagi jumlah siswa untuk mendapatkan rata-rata.
- Data setiap siswa dan rata-rata nilai ditampilkan ke layar.
- Program dapat diulang sesuai keinginan user dengan memasukkan angka 1 (ya) atau 0 (tidak).
- Penamaan variabel sederhana, komentar berlebihan, dan penggunaan `nextLine()` ekstra.

### Contoh Output
```
Masukkan jumlah siswa: 2
Masukkan nama siswa 1:
Budi
Masukkan nilai siswa 1:
80
Masukkan nama siswa 2:
Dina
Masukkan nilai siswa 2:
90

DATA SISWA:
===========
Nama: Budi
Nilai: 80
-----------
Nama: Dina
Nilai: 90
-----------
Rata-rata: 85.0
Mau ulang? (1=ya, 0=tidak)
```

---

## nomor2.java
### Tujuan
Program ini digunakan untuk mencatat data produk pada sebuah toko, mencari produk berdasarkan ID, dan menampilkan seluruh data produk yang sudah diinput.

### Penjelasan Kode
- User dapat menginput nama produk, ID produk, harga satuan, dan stok produk.
- Semua data produk disimpan dalam array bertipe `String[]`, `double[]`, dan `int[]`.
- User dapat menambah lebih dari satu produk dengan menjawab `y` pada prompt pengulangan.
- Setelah input selesai, user dapat mencari produk berdasarkan ID. Jika ditemukan, data produk ditampilkan; jika tidak, muncul pesan "Data tidak ditemukan!".
- Setelah proses pencarian, seluruh data produk yang sudah diinput akan ditampilkan dengan format rapi.
- Penamaan variabel sederhana, tidak ada validasi error, dan penggunaan array statis.

### Contoh Output
```
--- Input Produk Baru ---
Masukkan Nama Produk: Laptop
Masukkan ID Produk: A001
Masukkan Harga Satuan: 1000000
Masukkan Stok: 10

=== DATA PRODUK DITAMBAHKAN ===
Nama Produk : Laptop
ID Produk   : A001
Harga Satuan: Rp1000000.0
Stok        : 10

Apakah ingin menginput data produk lain? (y/n): n

Apakah anda ingin mencari produk? (y/n): y
Masukkan ID: A001

Data Ditemukan!
Nama Produk : Laptop
ID Produk   : A001
Harga Satuan: Rp1000000.0
Stok        : 10

=== SELURUH DATA PRODUK ===
Nama Produk : Laptop
ID Produk   : A001
Harga Satuan: Rp1000000.0
Stok        : 10

Terima kasih telah menggunakan program penjualan!
```

---

## Catatan
- Tidak menggunakan konsep OOP secara penuh, namun tetap relevan untuk latihan dasar array dan kontrol alur program.
- Dapat dikembangkan lebih lanjut dengan menambah validasi, error handling, atau menggunakan class dan objek.
