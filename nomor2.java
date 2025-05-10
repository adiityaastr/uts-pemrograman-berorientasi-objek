import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // simpan data produk
        String[] nama = new String[20];
        String[] id = new String[20];
        double[] harga = new double[20];
        int[] stok = new int[20];
        int jml = 0;
        String ulang;

        do {
            // Input produk
            System.out.println("--- Input Produk Baru ---");
            System.out.print("Masukkan Nama Produk: ");
            nama[jml] = input.nextLine();
            System.out.print("Masukkan ID Produk: ");
            id[jml] = input.nextLine();
            System.out.print("Masukkan Harga Satuan: ");
            harga[jml] = input.nextDouble();
            input.nextLine();
            System.out.print("Masukkan Stok: ");
            stok[jml] = input.nextInt();
            input.nextLine();

            System.out.println("\n=== DATA PRODUK DITAMBAHKAN ===");
            System.out.println("Nama Produk : " + nama[jml]);
            System.out.println("ID Produk   : " + id[jml]);
            System.out.println("Harga Satuan: Rp" + harga[jml]);
            System.out.println("Stok        : " + stok[jml]);

            jml++;
            System.out.print("\nApakah ingin menginput data produk lain? (y/n): ");
            ulang = input.nextLine();
        } while(ulang.equalsIgnoreCase("y"));

        // cari produk
        System.out.print("\nApakah anda ingin mencari produk? (y/n): ");
        if(input.nextLine().equalsIgnoreCase("y")) {
            System.out.print("Masukkan ID: ");
            String cariId = input.nextLine();
            boolean ditemukan = false;
            for(int i = 0; i < jml; i++) {
                if(id[i].equalsIgnoreCase(cariId)) {
                    System.out.println("\nData Ditemukan!");
                    System.out.println("Nama Produk : " + nama[i]);
                    System.out.println("ID Produk   : " + id[i]);
                    System.out.println("Harga Satuan: Rp" + harga[i]);
                    System.out.println("Stok        : " + stok[i]);
                    ditemukan = true;
                    break;
                }
            }
            if(!ditemukan) {
                System.out.println("\nData tidak ditemukan!");
            }
        }

        // tampilkan semua
        System.out.println("\n=== SELURUH DATA PRODUK ===");
        for(int i = 0; i < jml; i++) {
            System.out.println("Nama Produk : " + nama[i]);
            System.out.println("ID Produk   : " + id[i]);
            System.out.println("Harga Satuan: Rp" + harga[i]);
            System.out.println("Stok        : " + stok[i]);
            System.out.println();
        }
        System.out.println("Terima kasih telah menggunakan program penjualan!");
        input.close();
    }
}