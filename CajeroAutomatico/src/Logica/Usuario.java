package Logica;

public class Usuario {
    
    private String nombre;
    private String Apellido;
    private int identificacion;
    private int telefono;
    private String direccion;

    public Usuario(String nombre, String Apellido, int identificacion, int telefono, String direccion) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    } 
    
}
