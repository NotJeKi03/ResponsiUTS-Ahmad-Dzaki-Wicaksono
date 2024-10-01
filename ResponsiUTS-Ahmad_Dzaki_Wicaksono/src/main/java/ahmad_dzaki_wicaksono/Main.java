/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ahmad_dzaki_wicaksono;

/**
 *
 * @author notjeki03
 */
public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Elektronik("HP Samsung", 5000000, 2);
        Produk produk2 = new Makanan("Sari Roti", 20000, "01-10-2025");

        Pegawai pegawai1 = new PegawaiTetap("Dzaki", 5000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak("Jeki", 3000000, 12);

        produk1.tampilkanInfo();
        System.out.println();
        
        pegawai1.tampilkanInfo();
        System.out.println();
        
        produk2.tampilkanInfo();
        System.out.println();
        
        pegawai2.tampilkanInfo();
        
        
    }
}
