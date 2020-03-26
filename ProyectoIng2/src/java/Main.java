
import co.vinni.dto.Jugador;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
        Jugador jugador = new Jugador();
        

        listaJugadores = jugador.consultarJugador();
        int num = 1;
        System.out.println("-----Consulta-----");
        for (Jugador datos : listaJugadores) {
            System.out.println("Prueba°: " + num);
            System.out.println("Nacionalidad: " + datos.getNacionalidad());
            System.out.println("Pie Dominante: " + datos.getPieDominante());
            System.out.println("Premios Ganados: " + datos.getPremiosGanados());
            System.out.println("----- -----");
            num++;
        }
    }
}
