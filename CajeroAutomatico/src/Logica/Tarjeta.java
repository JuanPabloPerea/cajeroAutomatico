package Logica;
import java.util.Date;

public class Tarjeta {
    private int clave;
    private int numTarjeta;
    private Date fechavenc;
    private int cuotaManejo;
    private Date fechaexpe;
    private boolean est;

    public Tarjeta(int clave, int numTarjeta, Date fechavenc, int cuotaManejo, Date fechaexpe, boolean est) {
        this.clave = clave;
        this.numTarjeta = numTarjeta;
        this.fechavenc = fechavenc;
        this.cuotaManejo = cuotaManejo;
        this.fechaexpe = fechaexpe;
        this.est = est;
    }
    
    public int getClave() {
        return clave;
    }

    public int getCuotaManejo() {
        return cuotaManejo;
    }

    public Date getFechaexpe() {
        return fechaexpe;
    }

    public Date getFechavenc() {
        return fechavenc;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public boolean isEst() {
        return est;
    }
    
    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setCuotaManejo(int cuotaManejo) {
        this.cuotaManejo = cuotaManejo;
    }

    public void setFechaexpe(Date fechaexpe) {
        this.fechaexpe = fechaexpe;
    }

    public void setFechavenc(Date fechavenc) {
        this.fechavenc = fechavenc;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public void setEst(boolean est) {
        this.est = est;
    }
    
}
