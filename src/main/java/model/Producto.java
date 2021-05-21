package model;

import java.io.Serializable;
import java.util.StringTokenizer;

// Primero voy a dejar sirviendo todo sin la foto cuando ya funcione
//comienzo a agregar todo lo necesario para la foto
public class Producto /*implements Serializable*/ {
    
    private int codigo;
    private String nombre;
    private float precio;
    private int cantidad;
    private String descripcion;
    //private byte[] foto;
    
    public Producto(){
        
    }

    public Producto(int codigo, String nombre, float precio, int cantidad, String descripcion/*, byte[] foto*/) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        //this.foto = foto;
    }

    
    public Producto(String linea){
        StringTokenizer token = new StringTokenizer(linea,"*");
        codigo = Integer.parseInt(token.nextToken());
        nombre = token.nextToken();
        precio = Float.parseFloat(token.nextToken());
        cantidad = Integer.parseInt(token.nextToken());
        descripcion = token.nextToken();
        //foto = ;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /*public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    */
    
    public String toRegistro(){
        return "*" + codigo + "*" + nombre + "*" + precio + "*" + cantidad +  "*" + descripcion;
    }
    
    @Override 
    public String toString(){
        return codigo + "  " + nombre + "  " + precio + "  " + cantidad + "  " + descripcion ;
    }
    
}
