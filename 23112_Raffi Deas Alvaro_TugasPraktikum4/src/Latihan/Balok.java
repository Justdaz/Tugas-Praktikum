package Latihan;

public class Balok {
    double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;

    }

    public void volume() {
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok = " + volume);
    }

    public void menghitungLuas() {
         double permukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
         System.out.println("Luas Permukaannya = " + permukaan);
    }
}

