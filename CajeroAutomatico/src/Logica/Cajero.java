package Logica;
import java.util.Date;
import Logica.*;

public class Cajero {
    private int numCajero;
    private int saldoCajero;
    private int retiroMax = 1800000;
    private int numeroInt = 3;
    private Operacion oper;
    private Cuenta cuentaUsu;
    private Tarjeta tar;
     

    public Cajero() {
    }

    public int getNumCajero() {
        return numCajero;
    }

    public int getNumeroInt() {
        return numeroInt;
    }

    public int getRetiroMax() {
        return retiroMax;
    }

    public int getSaldoCajero() {
        return saldoCajero;
    }

    public void setNumCajero(int numCajero) {
        this.numCajero = numCajero;
    }

    public void setNumeroInt(int numeroInt) {
        this.numeroInt = numeroInt;
    }

    public void setRetiroMax(int retiroMax) {
        this.retiroMax = retiroMax;
    }

    public void setSaldoCajero(int saldoCajero) {
        this.saldoCajero = saldoCajero;
    }
    
    public void cambioClave(int claveVieja, int nuevaClave){
        claveVieja = tar.getClave();
        if (claveVieja == nuevaClave){
            System.out.println("clave incorrecta");
            System.out.println("la clave ingresada es la misma");
        }else{
            tar.setClave(nuevaClave);
        }
    }
    
    public void limitarIntentos(int intento){
        intento = getNumeroInt();
        if (oper.isEstadoTrans()==false){
            intento = intento - 1;
            System.out.println("ha ocurrido un error en la transaccion");
            System.out.println("quedan"+intento);
        }
    }
    
    public void limitarMonto (int montoLimite,int montoRetirado){
        montoLimite = getRetiroMax();
        if (montoLimite >= montoRetirado ){
            System.out.println("operacion exitosa");
        }else{
            System.out.println("no es posible retirar esa canridad");
        }
    }
    
    public void recargaCajero(int salCaj){
        salCaj = getSaldoCajero();
        if (salCaj<=200000){
            System.out.println("dar alerta al banco de estar proximo el saldo");
        }
    
    }
    
    public void verSaldo (int cuenta){
        
    
    }

}