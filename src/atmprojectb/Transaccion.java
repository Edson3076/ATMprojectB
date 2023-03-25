/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmprojectb;

/**
 *
 * @author HP
 */
//para que no se puedan hacer instancias de la clase Transaccion: Abstract
public abstract class Transaccion {
    private int monto;

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
   
    public void ejecutar(int monto){
        System.out.println("Transaccion.ejecutar");
    }

     
}
