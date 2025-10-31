package Tugas3;

/**
 * Program utama untuk menjalankan pemesanan produk.
 * Membuat objek PemesananProduk lalu menampilkan detail pesanan
 * dan mengurangi stok sesuai jumlah yang dipesan.
 */
public class Main {

    /** aku
     * Method utama dari program.
     *
     * @param args argumen saat menjalankan program
     */
    public static void main(String[] args) {
        Tugas3.PemesananProduk p = new Tugas3.PemesananProduk(
                new Pesanan("Budi", "Jakarta", "Laptop", 7500000, 2, 5)
        );
        p.tampilkanDetailPesanan();
        PemesananProduk.kurangiStok(p, p.getJumlah());
    }
}
