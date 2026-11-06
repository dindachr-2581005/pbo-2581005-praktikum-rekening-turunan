public class Tabungan extends Rekening {
    private double bungaPersen;

    //Constructor
    public Tabungan(String nomor, String pemilik,
                    int saldo, double bungaPersen) {

        super(nomor, pemilik, saldo);
        this.bungaPersen = bungaPersen;
    }
        //Menambahkan bunga tabungan
        public int tambahBunga () {
            int bunga = (int) (getSaldo() * bungaPersen / 100);
            setor(bunga);
            return bunga;
        }
    // Override cetakInfo
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tabungan, bunga " + bungaPersen + "% per bulan");
    }
}

