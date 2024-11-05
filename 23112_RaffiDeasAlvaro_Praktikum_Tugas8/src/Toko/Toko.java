package Toko;

import java.util.Scanner;

public class Toko {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        boolean beliLagi = true;

        while (beliLagi) {
            BarangJual.prosesPembelian();

            String pilihan;
            do {
                System.out.print("Beli Lagi? Y/N ");
                pilihan = masukan.next();
                if (pilihan.equalsIgnoreCase("Y")) {
                    beliLagi = true;
                    break;
                } else if (pilihan.equalsIgnoreCase("N")) {
                    beliLagi = false;
                    break;
                } else {
                    System.out.println("Pilihan tidak valid, silakan masukkan 'Y' atau 'N'.");
                }
            } while (true);

            System.out.println();
        }

    }
}
