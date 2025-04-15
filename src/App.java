import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        Barang[] barangs = new Barang[5];
        barangs[0] = new Barang("Br001", "Leo Kripik", "Makanan", 10, 1000);
        barangs[1] = new Barang("Br002", "You C1000 Botol","Minuman", 10, 7000);
        barangs[2] = new Barang("Br003", "Teh Pucuk Botol", "Minuman", 10, 4000);
        barangs[3] = new Barang("Br004", "Rinso Cair", "Sabun", 10, 7000);
        barangs[4] = new Barang("Br005", "Mama Lemon Cair", "Sabun", 10, 1000);
        
        TransaksiPembelian[] transaksiPembelians = new TransaksiPembelian[5];
        transaksiPembelians[0] =new TransaksiPembelian("Tr001", "Agus", "21-04-2024", 1, barangs[0]);
        transaksiPembelians[1] =new TransaksiPembelian("Tr002", "Santi", "21-04-2024", 2, barangs[1]);
        transaksiPembelians[2] =new TransaksiPembelian("Tr003", "Santi", "21-04-2024", 3, barangs[2]);
        transaksiPembelians[3] =new TransaksiPembelian("Tr004", "MeiMei", "21-04-2024", 1, barangs[3]);
        transaksiPembelians[4] =new TransaksiPembelian("Tr005", "Ihsan", "21-04-2024", 1, barangs[4]);

        ServiceClass serviceClass = new ServiceClass(transaksiPembelians, 0);
        while (true) { 
            System.out.println("\n========== TOKO MANASUKA ==========");
            System.out.println("BANK MENU :");
            System.out.println("1. Data Barang");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Pencarian Data");
            System.out.println("4. Pengurutan Data");
            System.out.println("5. Keluar Menu");
            System.out.print("Pilih Menu (1-5) : ");
            int plhmn = input.nextInt();
            input.nextLine();

            switch (plhmn) {
                case 1 -> {
                    barangs[0].tampilDataBarang(barangs);
                }
                case 2 -> {
                    transaksiPembelians[0].tampilDataTransaksi(transaksiPembelians);
                }
                case 3 -> {
                    System.out.println("====== Cari Nama ======");
                    System.out.print("Masukan Nama : ");
                    String namaPembeli = input.nextLine();
                    serviceClass.searching(namaPembeli);
                }
                case 4 -> {}
                case 5 -> {
                    return;
                }
                default -> System.out.println("Masukkan Input menu yang sesuai.");
                
            }
        }
    }
}