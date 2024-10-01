package Latihan1;
import java.util.Scanner;

public class DataNilaiBeraksi {
    public static void main(String[] args) {
        
        
        DataNilai mahasiswa = new DataNilai();

        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NPM \t\t\t: ");
        mahasiswa.NPM = input.nextLine();
        
        System.out.print("Masukkan Nama \t\t\t: ");
        mahasiswa.Nama = input.nextLine();
        
        System.out.print("Masukkan Nilai Kehadiran \t: ");
        mahasiswa.nilaiKehadiran = input.nextFloat();
        
        System.out.print("Masukkan Nilai Tugas \t\t: ");
        mahasiswa.nilaiTugas = input.nextFloat();
        
        System.out.print("Masukkan Nilai UTS \t\t: ");
        mahasiswa.nilaiUTS = input.nextFloat();
        
        System.out.print("Masukkan Nilai UAS \t\t: ");
        mahasiswa.nilaiUAS = input.nextFloat();
       
        mahasiswa.getData();
        
        input.close();
    }
}
