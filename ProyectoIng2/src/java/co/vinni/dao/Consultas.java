package co.vinni.dao;

import co.vinni.dto.Datos;
import co.vinni.dto.Jugador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Consultas {

    private final String url = "jdbc:postgresql://localhost:5432/futbol";
    private final String user = "postgres";
    private final String password = "47413305654904a";

    public Datos consulta(Datos d) {
        if (d != null) {
            if (d.getNombre().toUpperCase().equals("JULIAN")) {
                d.setCorreo("elcorreo.com.co");
                return d;
            }
        }
        return null;
    }

    public ArrayList<Jugador> consultarJugador() throws SQLException {
        PreparedStatement objPreparedStatement = null;
        ResultSet objResultSet;
        Connection objConexion = null;

        ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();

        String sqlQuery = "SELECT * FROM club.jugador";

        try {

            objConexion = DriverManager.getConnection(url, user, password);
            objPreparedStatement = objConexion.prepareStatement(sqlQuery);
            objResultSet = objPreparedStatement.executeQuery();

            while (objResultSet.next()) {

                Jugador jugadorBD = new Jugador(objResultSet.getString(1), objResultSet.getString(2),
                        objResultSet.getString(3));

                listaJugadores.add(jugadorBD);

            }

            objPreparedStatement.close();
            objConexion.close();
        } catch (SQLException e) {
            e.getMessage();
        } finally {

            if (objConexion != null) {
                objConexion.close();
            }

            if (objPreparedStatement != null) {
                objPreparedStatement.close();
            }

        }
        return listaJugadores;
    }

   
    
    public ArrayList<Jugador> consultarJugadors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
