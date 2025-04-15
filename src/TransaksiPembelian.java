public class TransaksiPembelian {
    String kodeTransaksi, namaPembeli, tanggalPembelian;
    int qty;
    Barang brg;

    TransaksiPembelian(String kodeTransaksi, String namaPembeli, String tanggalPembelian, int qty, Barang brg){
        this.kodeTransaksi = kodeTransaksi;
        this.namaPembeli = namaPembeli;
        this.tanggalPembelian = tanggalPembelian;
        this.qty = qty;
        this.qty = qty;
    }

    void tampilDataTransaksi(TransaksiPembelian[] transaksi) {
        System.out.printf("%-15s %-15s %-15s %-15s %-7s %-15s", "Kode Transaksi", "Nama Pembeli", "Tanggal Pembelian", "Nama Barang", "Kuantitas", "Harga");
        for (TransaksiPembelian trs : transaksi) {
            System.out.printf("\n%-15s %-15s %-15s %-15s %-7d %-15d", trs.kodeTransaksi, trs.namaPembeli, trs.tanggalPembelian, trs.brg.nama, trs.qty, trs.brg.harga);
        }
    }
}
