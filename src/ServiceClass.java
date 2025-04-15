
import java.util.Arrays;

public class ServiceClass {
    TransaksiPembelian[] transaksiPembelian;

    ServiceClass(TransaksiPembelian[] transaksiPembelian){
        this.transaksiPembelian = transaksiPembelian;
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
            System.out.println("\nData yang dicari tidak ditemukan.");
        }
    }
    

    void sorting(){
        Arrays.sort(transaksiPembelian, 0, transaksiPembelian.length, (a, b) -> a.namaPembeli.compareToIgnoreCase(b.namaPembeli));
        System.out.println("Data Setelah Sorting");
        transaksiPembelian[0].tampilDataTransaksi(transaksiPembelian);
    }
}
