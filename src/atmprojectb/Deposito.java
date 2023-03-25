/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmprojectb;

/**
 *
 * @author HP
 */
public class Deposito extends Transaccion{
    //super.ejecutar(monto); = primero va a ejecutar el metodo padre
    public void ejecutar(int monto){
        System.out.println("Deposito.ejecutar");
    }        
}
