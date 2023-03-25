    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmprojectb;

/**
 *
 * @author HP
 */
public class ATM {
    private Cuenta cuenta =new Cuenta();
    
//composicion:    
    private RanuraParaDeposito ranuraParaDepositoObj  = new  RanuraParaDeposito(); 
    private TecladoNumerico tecladoNumericoObj = new TecladoNumerico();
    private Pantalla pantallaObj = new Pantalla();
    private Dispensador dispensadorObj = new Dispensador();

    //Constructor
    public ATM(){
    this.ranuraParaDepositoObj = new RanuraParaDeposito();
    this.tecladoNumericoObj = new TecladoNumerico();
    this.pantallaObj = new Pantalla();
    this.dispensadorObj = new Dispensador();

    this.solicitarDatos();
    this.menu();
    }

    public void polimorfismo (Transaccion trans){
    trans.ejecutar(0);
    }
    
    public void solicitarDatos(){
        while(true){
            pantallaObj.mostrarMensaje("Bienvenido\n");
            pantallaObj.mostrarMensaje("Ingrese su número de cuenta: ");
            int numeroDeCuenta=tecladoNumericoObj.capturarDatos();
            cuenta.setNumeroDeCuenta(numeroDeCuenta);
            
            pantallaObj.mostrarMensaje("Ingrese su número de NIP: ");
            int numeroNip=tecladoNumericoObj.capturarDatos();
            cuenta.setNip(numeroNip);
            
         }   
    }
    private void menu(){
        pantallaObj.mostrarMensaje("Menu Principal\n");
        pantallaObj.mostrarMensaje("1 - Ver mi saldo\n");
        pantallaObj.mostrarMensaje("2 - Retirar efectivo\n");
        pantallaObj.mostrarMensaje("3 - Depositar fondos\n");
        pantallaObj.mostrarMensaje("4 - Salir\n");
        pantallaObj.mostrarMensaje("escriba una opcion: ");
        int seleccion = tecladoNumericoObj.capturarDatos();

        if(seleccion>0 && seleccion<5){
            switch(seleccion){
                case 1: System.out.println("Has elegido la opcion 1");
                    pantallaObj.mostrarMensaje("El saldo disponible es: "+cuenta.getSaldo());
                break;
                case 2: System.out.println("Has elegido la opcion 2");break;
                case 3: break;
                case 4: break;
            }
        }else{System.out.println("Elige una opcion correcta!");}
    }
}














