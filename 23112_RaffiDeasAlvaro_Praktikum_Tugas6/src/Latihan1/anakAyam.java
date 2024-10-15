package Latihan1;

public class anakAyam {
   
   
    public void anakAyamLoop(int n) {
        int i = n;
        while (i > 0) {
            if (i > 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            } else {
                System.out.println("Anak ayam turun 1, mati satu tinggal induknya");
            }
            i--;
        }
    }
}
