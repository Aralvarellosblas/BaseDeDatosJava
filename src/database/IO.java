package database;

import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class IO{

    public static void Mensaje(String m){
        JOptionPane.showMessageDialog(null, m);
    }
    public static String PedirDato(String m){
        String o=JOptionPane.showInputDialog(m);
        return o;
    }
    public static int PedirInt(String m){
        int o=Integer.parseInt(JOptionPane.showInputDialog(m));
        return o;
    }
}
