package co.vinni.servicios;

import co.vinni.dao.Consultas;
import co.vinni.dto.Datos;
import co.vinni.dto.Jugador;

import co.vinni.dto.Respuesta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("operacion")
public class Operaciones {

    private PreparedStatement objPreparedStatement;
    private ResultSet objResultSet;
    private Connection objConexion;

    @Path("version")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String version() {
        return "version 1.0";
    }

    @Path("autenticar")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)

    public Respuesta autenticar(Datos datos) {
        Respuesta r = new Respuesta();
        r.setCodigo(1);
        r.setMensajeE("Existe");

        Consultas cons = new Consultas();
        Datos d = cons.consulta(datos);

        if (d == null) {
            r.setCodigo(0);
            r.setMensajeE("No Existe");
        }

        r.setInfo(d);
        return r;
    }

    @Path("consultarProyectos")
    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public Respuesta consultarJugadores() throws SQLException {
        Respuesta r = new Respuesta();
        r.setCodigo(1);
        r.setMensajeE("Consulta exitosa");

        Consultas cons = new Consultas();
        ArrayList<Jugador> consultaJugador = cons.consultarJugador();

        if (consultaJugador == null) {
            r.setCodigo(0);
            r.setMensajeE("Consulta fallida");
        }
        return r;
    }
}
//////////