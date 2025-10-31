package Tugas3;

/**
 * Menyimpan data pesanan seperti nama pelanggan, alamat,
 * nama produk, harga, jumlah, dan stok.
 *
 * @param n  nama pelanggan
 * @param a  alamat pelanggan
 * @param np nama produk yang dipesan
 * @param h  harga satuan produk
 * @param j  jumlah produk yang dibeli
 * @param s  stok produk yang tersedia
 */
public record Pesanan(String n, String a, String np, double h, int j, int s) {
}
