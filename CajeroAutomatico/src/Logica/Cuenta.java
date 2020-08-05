package Logica;
import java.util.Date;
import Logica.*;

public class Cuenta {
    private int numCuenta;
    private boolean estado;
    private Date fechaApertura;
    private int saldoCuenta;
    private Usuario usuario;
    private Tarjeta tar;

   

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldoCuenta(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public boolean isEstado() {
        return estado;
    }
    
    public void bloquearTarjeta(int serialTar){
        serialTar = tar.getNumTarjeta();
        if (tar.isEst()==true){
            tar.setEst(false);
            System.out.println("se ha bloqueado la clave exitosamente");
        }else{
            System.out.println("la tarjeta ya esta bloqueada");
        }
    }
    
    public void verSaldo(int saldo){
        
    }
    
    
    
}
