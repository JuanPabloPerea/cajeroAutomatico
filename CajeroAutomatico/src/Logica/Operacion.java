package Logica;
import java.util.Date;


public class Operacion {
    private int id;
    private Date fechaOp;
    private int saldoRetirado;
    private boolean estadoTrans;


    public Date getFechaOp() {
        return fechaOp;
    }

    public int getId() {
        return id;
    }

    public int getSaldoRetirado() {
        return saldoRetirado;
    }

    public boolean isEstadoTrans() {
        return estadoTrans;
    }

    public void setEstadoTrans(boolean estadoTrans) {
        this.estadoTrans = estadoTrans;
    }

    public void setFechaOp(Date fechaOp) {
        this.fechaOp = fechaOp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSaldoRetirado(int saldoRetirado) {
        this.saldoRetirado = saldoRetirado;
    }
    
    public void cancelarOp(boolean estado){
        estado=false;
        setEstadoTrans(estado);
    }

    public void validarclave(){
    
    }
    
    
    
}
