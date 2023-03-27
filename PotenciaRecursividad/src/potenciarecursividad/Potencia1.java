/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package potenciarecursividad;

/**
 *
 * @author eq29
 */
public class Potencia1 {
    
   
    public static int Potencia1(int base, int exponente){
        
        if(exponente==0){
            return 1;
        } else if (exponente<0) {
            return Potencia1(base, exponente+1) / base;
        } else {
            return base * Potencia1(base, exponente-1);
        }
    }
      
}
