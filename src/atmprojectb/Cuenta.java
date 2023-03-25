/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmprojectb;

/**
 *
 * @author HP
 */
public class Cuenta {
    private float saldo ;
    private float saldoFlotante;
    private int numeroDeCuenta;
    private int nip;
    
    //El constructor debe tener el mismo nombre de la clase y no tiene tipo de retorno
    public Cuenta(String nombre){
        System.out.println("Hola " + nombre);
    } 
    public Cuenta (){
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoFlotante() {
        return saldoFlotante;
    }

    public void setSaldoFlotante(float saldoFlotante) {
        this.saldoFlotante = saldoFlotante;
    }

    public int getNumeroDeCuenta() {
    
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        //para que al ingresar el número de cuenta sea de 5 digitos
        if(numeroDeCuenta > 9999 && numeroDeCuenta<100000){
        this.numeroDeCuenta = numeroDeCuenta;
            System.out.println("El número de cuenta es: "+numeroDeCuenta);}
        else{System.out.println("El número de cuenta no es valido");return;}
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        if(nip >9999 && nip <100000){
        this.nip = nip;
            System.out.println("El número de NIP es: "+nip);}
        else{System.out.println("El número de NIP es invalido");}
    }

    public int obtenerSaldo(int numeroDeCuenta){
        System.out.println("Cuenta.obtenersaldo(int)");
        return 0;
    }
//sobre carga de metodos
    public int obtenerSaldo(String numeroDeCuenta){
        System.out.println("Cuenta.obtenersaldo(String)");
        return 0;
    }

    public void acreditar (int monto){}
    public void debitar (int monto){}
    

}
