/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2;

/**
 *
 * @author hp
 */
public class KonversiSuhu2 extends KonversiSuhu{ 
    
   public void FahrenheitToReamur(int Fahrenheit){
        int Reamur = (Fahrenheit - 32) * 4/9;
        System.out.println("Suhu Fahrenheit     : " + Fahrenheit + "\nSuhu Reamur         : " + Reamur + "\n");
    }
}
