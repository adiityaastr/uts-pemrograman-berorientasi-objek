import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for(int ulang = 1; ulang == 1;) {
            
            System.out.print("Masukkan jumlah siswa: ");
            int jumlahsiswa = input.nextInt();
            input.nextLine();
            
            // Array untuk menyimpan data
            String[] nama = new String[jumlahsiswa];
            int[] nilai = new int[jumlahsiswa];
            int totalnilai = 0;
            
            // Input data siswa
            for(int i = 0; i < jumlahsiswa; i++) {
                System.out.print("\nMasukkan nama siswa ke-" + (i+1) + ": ");
                nama[i] = input.nextLine();
                
                System.out.print("Masukkan nilai siswa ke-" + (i+1) + ": ");
                nilai[i] = input.nextInt();
                input.nextLine();
                
                totalnilai = totalnilai + nilai[i];
            }
            
            // Tampilkan data siswa
            System.out.println("\nData Siswa:");
            for(int i = 0; i < jumlahsiswa; i++) {
                System.out.println((i+1) + ". Nama: " + nama[i] + ", Nilai: " + nilai[i]);
            }
            
            double ratarata = (double) totalnilai / jumlahsiswa;
            System.out.printf("\nRata-rata nilai siswa: %.2f\n", ratarata);
            
            System.out.print("\nApakah ingin mengulang program? (Y/N): ");
            String jawaban = input.nextLine();
            if(!jawaban.equalsIgnoreCase("Y")) {
                ulang = 0;
            }
        }
        
        input.close();
    }
} 