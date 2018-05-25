package database;

import javax.swing.JOptionPane;

/**
 * Esta clase tiene una serie de metodos que permiten la comunicación con el
 * usuario
 *
 * @author Arturo
 */
public class IO{

    /**
     * Este metodo muestra un mensaje en pantalla
     *
     * @param m String Contenido del mensaje
     */
    public static void Mensaje(String m){
        JOptionPane.showMessageDialog(null, m);
    }

    /**
     * Este metodo muestra un mensaje por pantalla y recoje un dato
     *
     * @param m String Contenido del mensaje
     * @return String Dato recibido por el usuario
     */
    public static String PedirDato(String m){
        String o=JOptionPane.showInputDialog(m);
        return o;
    }

    /**
     * Este metodo muestra un mensaje por pantalla y recoje un dato
     * @param m String Contenido del mensaje
     * @return int Dato recibido por el usuario
     */
    public static int PedirInt(String m){
        int o=Integer.parseInt(JOptionPane.showInputDialog(m));
        return o;
    }
}
