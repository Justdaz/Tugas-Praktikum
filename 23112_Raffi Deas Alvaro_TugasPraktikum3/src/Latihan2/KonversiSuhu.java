/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author hp
 */
public class KonversiSuhu {
    
    public void celciusToFahrenheit(int Celcius){
        int Fahrenheit = (Celcius * 9/5) + 32;
        System.out.println("Suhu Celcius        : " + Celcius + "\nSuhu Fahrenheit     : " + Fahrenheit + "\n");
    }
    
    public void celciusToReamur(int Celcius){
        int Reamur = Celcius * 4/5;
        System.out.println("Suhu Celcius        : " + Celcius + "\nSuhu Reamur         : " + Reamur + "\n");
    }
}
