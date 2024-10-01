package Latihan3;
public class BeratBadan {
    float Berat;
    float Tinggi;
    float Ideal;
    
    public BeratBadan(float Berat, float Tinggi) {
        this.Berat = Berat;
        this.Tinggi= Tinggi/100;
        Hitung();
    }
    
    public void Hitung() {
        Ideal= Berat / (Tinggi * Tinggi);
        if(Ideal >= 40){
            System.out.println("\nAnda Sangat Gemuk");
        } else if (Ideal >= 30) {
            System.out.println("\nAnda Gemuk");
        } else if (Ideal >= 25) {
            System.out.println("\nBerat Badan Anda Lebih");
        } else if (Ideal >= 18.5) {
            System.out.println("\nBerat Badan Anda Ideal");
        } else {
            System.out.println("\nBerat Badan Anda Kurang");
        }
    }

}
