package conexionconbasededatos;

import java.util.ArrayList;

/**
 * Clase ordenador que contiene todos los metodos y atributos necesarios para
 * trabajar con los objetos antes de introducirlos en la base de datos.
 *
 * @author Arturo
 */
public class Ordenador{

    private int codigo;
    private String nombre;
    private String marca;
    private String modelo;
    private float precio;
    public static ArrayList<Ordenador> ordenadores=new ArrayList();

    public Ordenador(){
    }

    public Ordenador(int codigo, String nombre, String marca, String modelo, float precio){
        this.codigo=codigo;
        this.nombre=nombre;
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    public float getPrecio(){
        return precio;
    }

    public void setPrecio(float precio){
        this.precio=precio;
    }

    @Override
    public String toString(){
        return "Codigo "+codigo+", nombre "+nombre+", marca "+marca+", modelo "+modelo+", precio "+precio;
    }

}
