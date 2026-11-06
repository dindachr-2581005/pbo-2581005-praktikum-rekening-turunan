public class BankTurunan {
    public static void main(String[] args) {

        // Membuat object Tabungan
        Tabungan tabungan = new Tabungan(
                "101", "Ani", 1000000, 2.5
        );
        // Membuat object Giro
        Giro giro = new Giro(
                "201", "Budi", 200000, 500000
        );
        // Menampilkan rekening awal
        System.out.println("REKENING AWAL");
        tabungan.cetakInfo();
        giro.cetakInfo();

        // Menjalankan transaksi
        System.out.println("\n============ TRANSAKSI ============");

        System.out.printf("%-27s: %s%n",
                "Tabungan tarik 1.500.000",
                tabungan.tarik(1500000) ? "Berhasil" : "Ditolak");

        System.out.printf("%-27s: %s%n",
                "Giro tarik 500.000",
                giro.tarik(500000) ? "Berhasil" : "Ditolak");

        System.out.printf("%-27s: %s%n",
                "Giro tarik 300.000",
                giro.tarik(300000) ? "Berhasil" : "Ditolak");

        System.out.printf("%-27s: %s%n",
                "Giro setor 100.000",
                giro.setor(100000) ? "Berhasil" : "Ditolak");

        // Menambahkan bunga tabungan
        int bunga = tabungan.tambahBunga();

        System.out.println("Bunga tabungan             : "
                + Rekening.formatRupiah(bunga));

        // Menampilkan rekening akhir
        System.out.println("\n========== REKENING AKHIR =========");

        tabungan.cetakInfo();
        giro.cetakInfo();
    }
}
