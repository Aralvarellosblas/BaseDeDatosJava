package database;

import conexionconbasededatos.Ordenador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La clase Funciones contiene los metodos necesarios para la conexión,
 * desconexión e interacción del programa con la base de datos.
 *
 * @author Arturo
 */
public class Funciones{

    static Connection conn=null;
    static String url="jdbc:sqlite:D:\\NetBeansProjects\\BasesDeDatos\\Ordenadores.db";
    Ordenador o=new Ordenador();

    /**
     * Este metodo realiza una primera conexión con la base de datos situada en
     * la ruta de la variable URL. Muestra un mensaje de confirmación del estado
     * de la conexión, tanto si se ha realizado como si falla. Si la base no
     * existiese, al inrentar conectarse a ella esta se crearia automaticamente
     */
    public static void firstConnect(){
        try{

            // create a connection to the database
            conn=DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                if(conn!=null){
                    conn.close();
                }
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    /**
     * Este metodo conecta con la base de datos asignada a la URL
     *
     * @return Devuelve un parametro del tipo connection para su uso en otros
     * metodos
     */
    public static Connection connect(){
        Connection conn=null;
        try{
            conn=DriverManager.getConnection(url);
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Connection to SQLite has failed.");
            IO.Mensaje("Connection to SQLite has failed.");
        }
        return conn;
    }

    /**
     * Este metodo ejecuta un comando sql destinado a la creación de la tabla
     * dentro de la base de datos
     */
    public static void createNewTable(){
        // SQL statement for creating a new table
        String sql="CREATE TABLE IF NOT EXISTS ordenadores (\n"
                +"	codigo integer PRIMARY KEY,\n"
                +"	nombre text NOT NULL,\n"
                +"	marca text,\n"
                +"      modelo text,\n"
                +"      precio float\n"
                +");";

        try(Connection conn=DriverManager.getConnection(url);
                Statement stmt=conn.createStatement()){
            // create a new table
            stmt.execute(sql);
            System.out.println("Tabla Creada");
        }catch(SQLException e){
            IO.Mensaje("Fallo en la creacion de la tabla");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Este metodo ejecuta un comando sql destinado a obtener toda la
     * información contenida en la tabla de la base de datos
     */
    public static void selectAll(){
        String sql="SELECT codigo, nombre, marca, modelo, precio FROM ordenadores";
        Ordenador.ordenadores.clear();
        try(Connection conn=Funciones.connect();
                Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql)){

            // loop through the result set
            while(rs.next()){
                System.out.println(rs.getInt("codigo")+"\t"
                        +rs.getString("nombre")+"\t"
                        +rs.getString("marca")+"\t"
                        +rs.getString("modelo")+"\t"
                        +rs.getFloat("precio"));

                Ordenador.ordenadores.add(new Ordenador(
                        rs.getInt("codigo"),
                        rs.getString("nombre"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getFloat("precio")));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * Este metodo permite obtener información de un elemento concreto de la
     * base de datos
     *
     * @param cod El codigo unico del elemento que se desea buscar en la tabla
     * @return Un String con la inoformación de dicho elemento
     */
    public static String selectCod(int cod){
        String sql="SELECT codigo, nombre, marca, modelo, precio "
                +"FROM ordenadores WHERE codigo = ?";
        String st="";
        try(Connection conn=Funciones.connect();
                PreparedStatement pstmt=conn.prepareStatement(sql)){

            // set the value
            pstmt.setDouble(1, cod);
            //
            ResultSet rs=pstmt.executeQuery();

            // loop through the result set
            while(rs.next()){
                st=(rs.getInt("codigo")+"\t"
                        +rs.getString("nombre")+"\t"
                        +rs.getString("marca")+"\t"
                        +rs.getString("modelo")+"\t"
                        +rs.getFloat("precio"));
                System.out.println(st);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return st;
    }

    /**
     * Este metodo permite la inserción de datos en la base de datos
     * introduciendo los parametros necesarios
     *
     * @param cod int Codigo unico del elemento a añadir
     * @param nombre String nombre del objeto
     * @param marca String marca del objeto
     * @param modelo String modelo del objeto
     * @param precio String precio del objeto
     */
    public static void insert(int cod, String nombre, String marca, String modelo, String precio){
        String sql="INSERT INTO ordenadores(codigo ,nombre, marca, modelo, precio) VALUES(?,?,?,?,?)";
        float preciof;
        if(precio.equalsIgnoreCase("")){
            preciof=0.0f;
        }else{
            preciof=Float.parseFloat(precio);
        }
        try(Connection conn=Funciones.connect();
                PreparedStatement pstmt=conn.prepareStatement(sql)){
            pstmt.setInt(1, cod);
            pstmt.setString(2, nombre);
            pstmt.setString(3, marca);
            pstmt.setString(4, modelo);
            pstmt.setFloat(5, preciof);
            pstmt.executeUpdate();
            IO.Mensaje("Introducción Realizada");
        }catch(SQLException e){
            IO.Mensaje("Fallo al introducir datos");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Este metodo permite cerrar la conexión con la base de datos
     */
    public static void close(){
        try{
            if(conn!=null){
                conn.close();
            }
            System.out.println("Database closed");
        }catch(SQLException ex){
            System.out.println("Error al cerrar la base de datos");
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Este metodo permite actualizar la información de un elementod de la base
     * de datos
     *
     * @param cod int Codigo unico del elemento a añadir
     * @param nombre String nombre del objeto
     * @param marca String marca del objeto
     * @param modelo String modelo del objeto
     * @param precio float precio del objeto
     */
    public static void updateAll(int cod, String nombre, String marca, String modelo, float precio){
        String sql="UPDATE ordenadores SET nombre = ? , "
                +"marca = ? , "
                +"modelo = ? , "
                +"precio = ? "
                +"WHERE codigo = ?";

        try(Connection conn=Funciones.connect();
                PreparedStatement pstmt=conn.prepareStatement(sql)){

            // set the corresponding param
            pstmt.setString(1, nombre);
            pstmt.setString(2, marca);
            pstmt.setString(3, modelo);
            pstmt.setFloat(4, precio);
            pstmt.setInt(5, cod);
            // update 
            pstmt.executeUpdate();
        }catch(SQLException e){
            System.out.println("Fallo al actualizar");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Este metodo permite actualizar un campo concreto de la información de la
     * base de datos
     *
     * @param campo campo que se quiere cambiar
     * @param dato nurvo valor del campo
     * @param cod codigo del objeto que se quiere cambiar
     */
    public static void updateField(String campo, String dato, int cod){
        String sql="UPDATE ordenadores SET '"+campo+"' = ? WHERE codigo = ? ";

        try(Connection conn=Funciones.connect();
                PreparedStatement pstmt=conn.prepareStatement(sql)){
            // set the corresponding param
            pstmt.setString(1, dato);
            pstmt.setInt(2, cod);
            //update
            pstmt.executeUpdate();

        }catch(SQLException ex){
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Permite eliminar una fila de la tabla en la base de datos
     *
     * @param cod codigo de la fila a eliminar
     */
    public static void delete(int cod){
        String sql="DELETE FROM ordenadores WHERE codigo = ?";

        try(Connection conn=Funciones.connect();
                PreparedStatement pstmt=conn.prepareStatement(sql)){

            // set the corresponding param
            pstmt.setInt(1, cod);
            // execute the delete statement
            pstmt.executeUpdate();
            IO.Mensaje("Se ha borrado una entrada");
        }catch(SQLException e){
            IO.Mensaje("Fallo al borrar");
            System.out.println(e.getMessage());
        }
    }

}
