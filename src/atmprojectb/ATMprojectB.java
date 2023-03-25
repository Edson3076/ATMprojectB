/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmprojectb;

/**
 *
 * @author HP
 */
public class ATMprojectB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creacion de objeto
        //El constructor necesita un nombre de parametro 
        //Cuenta cuentaObj = new Cuenta("Edson");
        //se esta asignando el valor
        /*cuentaObj.setNumeroDeCuenta(98012);
        cuentaObj.getNumeroDeCuenta();
        System.out.println("Número de cuenta: "+cuentaObj.getNumeroDeCuenta());
        */
 /*    
        Retiro retiroObj1 = new Retiro();
        // recibe el metodo de transaccion
        //retiroObj1.ejecutar(0);
        
        Deposito depositoObj1 = new Deposito();
        // recibe el metodo de transaccion
        //depositoObj1.ejecutar(0);
        

        //Polimorfismo
        retiroObj1.ejecutar(0);
        depositoObj1.ejecutar(0);
        Transaccion transaccionObj1 = new Deposito();
        Transaccion transaccionObj2 = new Retiro();
        transaccionObj1.ejecutar(0);
*/
/*
        int [] arr1 = new int[2];
        Transaccion [] arr2 = new Transaccion[2];
        arr2[0]=new Retiro();
        arr2[1]=new Deposito();
        //metodos: 
        arr2[0].ejecutar(0);
        arr2[1].ejecutar(0);
*/
/*
        //polimorfismo por parametros
        ATM atm = new ATM();
        atm.polimorfismo(new Retiro());
        atm.polimorfismo(new Deposito());
*/
        //Se crea un objeto de transaccion pero no tiene sentido 
        //Transaccion transaccionObj1= new Transaccion(); para que no se pueda se hace la clase transaccion abstracta

        
        /*
        Cuenta cuentaObj2 = new Cuenta("Javier");
            //cuentaObj2.numeroDeCuenta=2;
        cuentaObj2.setNumeroDeCuenta(2);
        cuentaObj2.getNumeroDeCuenta();
        System.out.println("Número de cuenta: "+cuentaObj2.getNumeroDeCuenta());

        TecladoNumerico tecladoNumerico = new TecladoNumerico();
        ATM atm1 = new ATM(tecladoNumerico);
        */
 /*       
Pantalla pantallaObj = new Pantalla();
pantallaObj.mostrarMensaje(".");
*/
ATM atm = new ATM();


    }
    
}
