package co.vinni.dto;

public class Datos {

    private String nombre;
    private String clave;
    private String correo;
    private String nacionalidad;
    String pieDominante;
    String premiosGanados;

  

    public Datos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPieDominante() {
        return pieDominante;
    }

    public void setPieDominante(String pieDominante) {
        this.pieDominante = pieDominante;
    }

    public String getPremiosGanados() {
        return premiosGanados;
    }

    public void setPremiosGanados(String premiosGanados) {
        this.premiosGanados = premiosGanados;
    }

   

}
