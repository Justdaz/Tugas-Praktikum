package Latihan2;

class matrix {

    void matrix() {
        for(int i = 0; i < 5; i++) {
            if(i == 0) {
                System.out.print("\t");
                continue;
            }
            System.out.print(i + "\t");
        }
        System.out.println();

        for(int i = 1; i < 5; i++) {
            System.out.print(i + "\t");
            for(int j = 1; j < 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}