
package com.mycompany.cap4_ejer_7_ig;

public class Operaciones {
    public Operaciones(){
    }
    public String setMayor(int numero_A, int numero_B){
        if(numero_A > numero_B){
            return "A ES MAYOR QUE B";
        }else if(numero_A == numero_B){
        return "A ES IGUAL A B";
        }else{
            return "A ES MENOR QUE B";
        }
    }
}
