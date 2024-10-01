package Latihan3;
import java.util.Scanner;

public class BeratBadanBeraksi {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan berat badan anda(kg): ");
        Float Berat = input.nextFloat();
                
        System.out.print("Masukkan tinggi badan anda(cm): ");
        Float Tinggi = input.nextFloat();
        
        BeratBadan Orang = new BeratBadan(Berat, Tinggi);
        input.close();
    }
}
