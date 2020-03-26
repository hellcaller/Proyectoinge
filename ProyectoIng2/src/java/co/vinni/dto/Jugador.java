/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.vinni.dto;

import co.vinni.dao.Consultas;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class Jugador 
{
    
    String nacionalidad;
    String pieDominante;
    String premiosGanados;

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

    public Jugador(String nacionalidad, String pieDominante, String premiosGanados) {
        this.nacionalidad = nacionalidad;
        this.pieDominante = pieDominante;
        this.premiosGanados = premiosGanados;
    }

    public Jugador() {
    }
    
    
      public ArrayList<Jugador> consultarJugador() {
        Consultas dao = new Consultas();
        try {
            return dao.consultarJugador();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
