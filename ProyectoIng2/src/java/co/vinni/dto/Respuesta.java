package co.vinni.dto;

import java.util.ArrayList;

public class Respuesta {

    private int codigo;
    private String mensajeE;
    private Datos info;
   
    private ArrayList<Jugador> listaJugadores;

    public Respuesta() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMensajeE() {
        return mensajeE;
    }

    public void setMensajeE(String mensajeE) {
        this.mensajeE = mensajeE;
    }

    public Datos getInfo() {
        return info;
    }

    public void setInfo(Datos info) {
        this.info = info;
    }

    public ArrayList<Jugador> getListaJugadors() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

}
