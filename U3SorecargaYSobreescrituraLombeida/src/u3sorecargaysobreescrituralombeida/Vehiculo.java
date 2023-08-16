/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u3sorecargaysobreescrituralombeida;

/**
 *
 * @author LOMBEIDA ANA
 */
public class Vehiculo extends Auto {//Clase hija herera de la clase principal Auto
    
    int numeroLlantas;
    
    public Vehiculo(int numeroLlantas,String color,String){
    super(marca,modelo,color);
    this.numeroLlantas=numeroLlantas;
    }
    
    
}
