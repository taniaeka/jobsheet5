
import java.util.Scanner;

public class SIAKAD24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("=== BIODATA MAHASISWA ===");
        System.out.print("Masukkan nama         : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM          : ");
        int nim = sc.nextInt();
        System.out.print("Masukkan kelas        : ");
        char kelas = sc.next().charAt(0);
        System.out.print("Masukkan nomor absen  : ");
        int nomorAbsen = sc.nextInt();

        System.out.println("=== NILAI MAHASISWA ===");
        System.out.print("Masukkan nilai kuis   : ");
        double kuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas  : ");
        double tugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian  : ");
        double ujian = sc.nextDouble();

        double nilaiAkhir = (kuis + tugas + ujian) / 3;
        String nilaiHuruf, kualifikasi;
        
        if (nilaiAkhir > 80 && nilaiAkhir <= 100){
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else if (nilaiAkhir <= 39){
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        } else {
            System.out.print("input tidak valid ");
            return;
        }
        
        System.out.println("=== LAPORAN NILAI MAHASISWA ===");
        System.out.println("Mahasiswa dengan nama " + nama + " NIM " + nim + " Kelas " + kelas + " nomor absen " + nomorAbsen);
        System.out.println("nilai akhir         : " + nilaiAkhir);
        System.out.println("nilai akhir huruf   : " + nilaiHuruf);
        System.out.println("kualifikasi         : " + kualifikasi);
    }
}

