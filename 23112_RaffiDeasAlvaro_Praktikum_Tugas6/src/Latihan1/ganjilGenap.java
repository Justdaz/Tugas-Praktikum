package Latihan1;


public class ganjilGenap {
    public void ganjilGenap(int size) {
        int i = 1;
        while (i <= size) {
            if (i % 2 != 0) {
                System.out.println(i + " adalah bilangan ganjil");

            } else {
                System.out.println(i + " adalah bilangan genap");
            }
            i++;
        }
    }
}
