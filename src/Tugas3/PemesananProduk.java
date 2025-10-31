package Tugas3;

/**
 * Kelas ini digunakan untuk mengelola data pemesanan produk.
 * Menyimpan informasi pelanggan, produk, serta proses pengurangan stok.
 */
public class PemesananProduk {

    private static final double PAJAK = 0.1;
    private String namaPelanggan;
    private String alamat;
    private String namaProduk;
    private double harga;
    private int jumlah;
    private int stok;

    /**
     * Membuat pemesanan baru dengan data yang diambil dari objek Pesanan.
     *
     * @param pesanan data pesanan yang berisi informasi pelanggan dan produk
     */
    public PemesananProduk(Pesanan pesanan) {
        setNamaPelanggan(pesanan.n());
        setAlamat(pesanan.a());
        setNamaProduk(pesanan.np());
        setHarga(pesanan.h());
        setJumlah(pesanan.j());
        setStok(pesanan.s());
    }

    /**
     * Mengembalikan nilai pajak yang berlaku pada transaksi.
     *
     * @return nilai pajak
     */
    public static double getPAJAK() {
        return PAJAK;
    }

    /**
     * Menampilkan detail pesanan ke layar.
     */
    public void tampilkanDetailPesanan() {
        System.out.println("Nama Pelanggan : " + getNamaPelanggan());
        System.out.println("Alamat         : " + getAlamat());
        System.out.println("Produk         : " + getNamaProduk());
        System.out.println("Jumlah Beli    : " + getJumlah());
        System.out.println("Total Harga    : " + hitungTotalHarga());
    }

    /**
     * Menghitung total harga pembelian termasuk pajak.
     *
     * @return total harga setelah ditambah pajak
     */
    private double hitungTotalHarga() {
        return getHarga() * getJumlah() + (getHarga() * getJumlah() * getPAJAK());
    }

    /**
     * Mengurangi stok produk sesuai jumlah pembelian.
     *
     * @param pemesananProduk objek pemesanan yang stoknya akan dikurangi
     * @param jumlah jumlah barang yang dibeli
     */
    public static void kurangiStok(PemesananProduk pemesananProduk, int jumlah) {
        pemesananProduk.setStok(pemesananProduk.getStok() - jumlah);
        System.out.println("Pembelian berhasil! Sisa stok: " + pemesananProduk.getStok());
    }

    /**
     * Mengambil nama produk.
     *
     * @return nama produk
     */
    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}
