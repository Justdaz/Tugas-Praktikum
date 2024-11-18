/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiNilaiAkhir;


public class Mahasiswa {

    private String Nim, Nama, Alamat, Matakul;
    private double nilai1, nilai2, nilai3, nilai4, nilai5;

    public Mahasiswa(String Nim, String Nama, String Alamat, String matakuliah, double nilai1, double nilai2, double nilai3, double nilai4, double nilai5) {
        this.Nim = Nim;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Matakul = matakuliah;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
    }

    public double NilaiAkhir() {
        return (nilai1 * 0.1) + (nilai2 * 0.15) + (nilai3 * 0.25) + (nilai4 * 0.15) + (nilai5 * 0.35);
    }

    public String Alamat() {
        return Alamat;
    }

    public String Nim() {
        return Nim;
    }

    public String Nama() {
        return Nama;
    }

    public String Matakuliah() {
        return Matakul;
    }
}
