package Toko;

import java.util.Scanner;

public class BarangJual {
    private String kode;
    private String nama;
    private int harga;

    BarangJual(String kode, String nama, int harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    private static BarangJual[] daftarBarang = {
        new BarangJual("A001", "Buku", 3000),
        new BarangJual("A002", "Pensil", 4000),
        new BarangJual("A003", "Pulpen", 5000),
        new BarangJual("A004", "Penghapus", 2000),
        new BarangJual("A005", "Penggaris", 9000)
    };

    public static int prosesPembelian() {
        Scanner masukan = new Scanner(System.in);

        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");

        System.out.print("Masukkan Item Barang: ");
        int jumlahItem = masukan.nextInt();
        String[] kodeBarangBeli = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            kodeBarangBeli[i] = masukan.next();
            System.out.print("Masukkan jumlah beli: ");
            jumlahBeli[i] = masukan.nextInt();
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("**********************");
        System.out.println("No    Kode       Nama Barang     Harga     Jumlah Beli     Jumlah Bayar");
        System.out.println("========================================================================");
        int totalBayar = 0;

        for (int i = 0; i < jumlahItem; i++) {
            boolean ditemukan = false;
            for (BarangJual barang : daftarBarang) {
                if (barang.getKode().equals(kodeBarangBeli[i])) {
                    int jumlahBayar = barang.getHarga() * jumlahBeli[i];
                    totalBayar += jumlahBayar;
                    System.out.printf("%-6d%-10s%-15s%-10d%-14d%d%n", 
                                      (i + 1), barang.getKode(), barang.getNama(), barang.getHarga(), jumlahBeli[i], jumlahBayar);
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.printf("%-6d%-10s%-15s%-10s%-14d%s%n", 
                                  (i + 1), kodeBarangBeli[i], "Tidak Ditemukan", "-", jumlahBeli[i], "-");
            }
        }

        System.out.println("========================================================================");
        System.out.println("Total Bayar                        : " + totalBayar);
        System.out.println();

        return totalBayar;
    }
}
