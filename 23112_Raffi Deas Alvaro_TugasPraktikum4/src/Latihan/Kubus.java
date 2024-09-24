
package Latihan;

public class Kubus extends Balok{
     double sisi;
     
    public Kubus(double sisi){
        super(sisi, sisi, sisi);
        this.sisi = sisi;
    };
    
     @Override
    public void volume (){
        double volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus = " + volume);
    }
    
     @Override
   public void menghitungLuas (){
       double permukaan = 6 * (sisi * sisi);
       System.out.println("Luas Permukaannya = " + permukaan);
   }
    
}
