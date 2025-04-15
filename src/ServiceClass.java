public class ServiceClass {
    TransaksiPembelian[] transaksiPembelian;
    int index;

    ServiceClass(TransaksiPembelian[] transaksiPembelian, int index){
        this.transaksiPembelian = transaksiPembelian;
        this.index = index;
    }

    void searching(String namaPembeli){
        int count = 0;
        for (TransaksiPembelian trs : transaksiPembelian) {
            if (trs.namaPembeli.equalsIgnoreCase(namaPembeli)) {
                    if(count < 1) {
                        System.out.printf("%-15s %-15s %-20s %-20s %-15s %-15s", "Kode Transaksi", "Nama Pembeli", "Tanggal Pembelian", "Nama Barang", "Kuantitas", "Harga");
                    }
                    System.out.printf("\n%-15s %-15s %-20s %-20s %-15d %-15d", trs.kodeTransaksi, trs.namaPembeli, trs.tanggalPembelian, trs.brg.nama, trs.qty, trs.brg.harga);
                    count++;
                }
        } if (count == 0) {
            System.out.println("\nNama yang dicari tidak ada.");
        }
    }
    

    void sorting(){}
}
