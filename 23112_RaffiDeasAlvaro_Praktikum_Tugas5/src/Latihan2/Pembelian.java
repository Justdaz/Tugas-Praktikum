package Latihan2;
public class Pembelian {
    
    int totalHarga;
    int Potongan;

    public Pembelian(int totalHarga) {
        this.totalHarga = totalHarga;
        Hitung();
    }

    public void Hitung() {
        if (totalHarga >= 50000) {
            Potongan = totalHarga * 1/5;
        } else {
            Potongan = totalHarga * 5/100;
        }
        System.out.println("Besarnya potongan Rp. " + Potongan);
        System.out.println("Jumlah yang harus dibayarkan = " + (totalHarga - Potongan));
    }
    
}
