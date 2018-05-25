package conexionconbasededatos;

import database.Funciones;
import interfazgrafica.InterfazBaseDatos;

/**
 * Clase principal del programa que se encarga de iniciar la base de datos y la
 * interfaz gráfica
 *
 * @author Arturo
 */
public class ConexionConBaseDeDatos{

    /**
     * Contiene las llamadas a los metodos necesarios para iniciar el programa
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){
        InterfazBaseDatos i=new InterfazBaseDatos();
        Funciones.firstConnect();
        Funciones.createNewTable();

    }

}
