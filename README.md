```markdown
# Program Pemesanan Produk

Program ini dibuat untuk memenuhi tugas praktikum PBO tentang penerapan kelas dan objek pada Java.  
Di dalam program ini terdapat proses pemesanan produk yang melibatkan data pelanggan, produk, dan perhitungan total harga termasuk pajak.

---

## Struktur Program
```

## package Tugas3 ada 3 Clas
 
#### Clas Main.java
#### Clas PemesananProduk.java
#### Clas Pesanan.java

````

---

## Penjelasan Kelas

### 1. Pesanan.java
Kelas ini menggunakan **record** untuk menyimpan data pesanan pelanggan.  
Berisi beberapa data seperti:
- Nama pelanggan  
- Alamat  
- Nama produk  
- Harga  
- Jumlah  
- Stok  

Contoh:
```java
Pesanan p = new Pesanan("Budi", "Jakarta", "Laptop", 7500000, 2, 5);
````

---

### 2. PemesananProduk.java

Kelas ini digunakan untuk mengelola pesanan yang dibuat dari kelas `Pesanan`.
Di sini ada proses menghitung total harga dengan pajak 10% dan juga pengurangan stok setelah pembelian.

Beberapa method penting:

* `tampilkanDetailPesanan()` → Menampilkan data pesanan dan total harga.
* `kurangiStok()` → Mengurangi stok produk setelah transaksi berhasil.

---

### 3. Main.java

Kelas utama yang berisi method `main()`.
Bagian ini menjalankan program dengan membuat objek `Pesanan`, memprosesnya lewat `PemesananProduk`, menampilkan hasil, lalu mengurangi stok.

Contoh:

```java
public static void main(String[] args) {
    Tugas3.PemesananProduk p = new Tugas3.PemesananProduk(
        new Pesanan("Budi", "Jakarta", "Laptop", 7500000, 2, 5)
    );
    p.tampilkanDetailPesanan();
    PemesananProduk.kurangiStok(p, p.getJumlah());
}
```

---

## Cara Menjalankan Program

1. Simpan semua file di dalam folder bernama `Tugas3`.
2. Buka terminal atau CMD.
3. Masuk ke folder tempat file disimpan.
4. Jalankan perintah berikut:

```bash
javac Tugas3/*.java
java Tugas3.Main
```

---

## Contoh Output

```
Nama Pelanggan : Budi
Alamat         : Jakarta
Produk         : Laptop
Jumlah Beli    : 2
Total Harga    : 16500000.0
Pembelian berhasil! Sisa stok: 3
```

