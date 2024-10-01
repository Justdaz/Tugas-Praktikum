package Latihan1;
public class DataNilai {
   
    String NPM;
    String Nama;
    String Nilai;
    float nilaiKehadiran;
    float nilaiTugas;
    float nilaiUTS;
    float nilaiUAS;
    String Keterangan; 
    

    public void getData (){ 
        float NilaiAkhir = (0.1f * nilaiKehadiran) + (0.2f * nilaiTugas) + (0.3f * nilaiUTS) + (0.4f * nilaiUAS);

        if (NilaiAkhir >= 76) {
            Keterangan = "ISTIMEWA";
             Nilai = "A";
        } else if (NilaiAkhir >= 66) {
            Keterangan = "BAIK";
             Nilai = "B";
        } else if (NilaiAkhir >= 56) {
            Keterangan = "CUKUP";
            Nilai = "C";
        } else if (NilaiAkhir >= 46) {
            Keterangan = "KURANG";
            Nilai = "D";
        } else {
            Keterangan = "KURANG SEKALI";
            Nilai ="E";
        }
    
        System.out.println("\nNPM Mahasiswa \t\t: " + NPM);
        System.out.println("Nama Mahasiswa \t\t: " + Nama);
        System.out.println("Nilai Rata-rata \t: " + NilaiAkhir);
        System.out.println("Grade \t\t\t: " + Nilai);
        System.out.println("Keterangan \t\t: " + Keterangan);
    }

}
    
