public class Barang {
    String kodeBarang, nama, kategori;
    int stok, harga;

    Barang(String kodeBarang, String nama, String kategori, int stok, int harga){
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        this.stok = stok;
        this.harga = harga;
    }

    void tampilDataBarang(Barang[] barang){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s", "Kode Barang", "Nama Barang", "Kategori", "Stok", "Harga");
        for (Barang brg : barang) {
            System.out.printf("\n%-15s %-20s %-15s %-7d %-15d", brg.kodeBarang, brg.nama, brg.kategori, brg.stok, brg.harga);
        }
    }
}
