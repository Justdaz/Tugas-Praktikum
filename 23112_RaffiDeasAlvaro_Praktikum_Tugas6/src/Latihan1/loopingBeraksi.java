package Latihan1;



class loopingBeraksi {
    public static void main(String[] args) {
        System.out.println(" Prima");
        Prima p = new Prima();
        p.Prima(10);
        System.out.println();

        System.out.println(" Ganjil genap");
        ganjilGenap gg = new ganjilGenap();
        gg.ganjilGenap(10);
        System.out.println();

        System.out.println(" Alphabet");
        Aphabet a = new Aphabet();
        a.loopAlphabet();

        System.out.println("\n \n Anak Ayam");
        anakAyam aa = new anakAyam();
        aa.anakAyamLoop(10);


    }
}