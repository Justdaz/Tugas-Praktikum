package Latihan2;
import java.util.Scanner;

public class PembelianBeraksi {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Total pembelian Rp. = ");
        int totalHarga = input.nextInt();

        Pembelian pelanggan = new Pembelian(totalHarga);
        input.close();
    }
}