package conexionconbasededatos;

import database.Funciones;
import interfazgrafica.InterfazBaseDatos;

/**
 *
 * @author Arturo
 */
public class ConexionConBaseDeDatos{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        InterfazBaseDatos i=new InterfazBaseDatos();
        Funciones.firstConnect();
        Funciones.createNewTable();

    }

}
