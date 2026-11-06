public class Rekening {
    //Field PRIVATE: tidak bisa disentuh langsung dari luar class
    private String nomor;
    private String pemilik;
    protected int saldo;

    // Constructor
    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    // GETTER: Mengambil saldo
    public int getSaldo() {
        return saldo;
    }

    // Method Setor uang
    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }

        saldo += jumlah;
        return true;
    }

    // Method Tarik uang
    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            return false;
        }

        saldo -= jumlah;
        return true;
    }

    // Method Format Rupiah
    protected static String formatRupiah(int jumlah) {
        return String.format("Rp%,d", jumlah);
    }

    // Mencetak informasi rekening
    public void cetakInfo() {
        System.out.printf("%s | %-10s | ", nomor, pemilik);
        System.out.println(formatRupiah(saldo));
    }
}
