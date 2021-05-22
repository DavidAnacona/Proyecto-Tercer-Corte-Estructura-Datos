 package model;

import controller.AlmacenCtrl;
import java.util.StringTokenizer;


public class Producto  {
    
    private int codigo;
    private String nombre;
    private float precio;
    private int cantidad;
    private String descripcion;
    private Almacen almacen;
    
    public Producto(){
        
    }

    public Producto(int codigo, String nombre, float precio, int cantidad, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        
    }

    
    public Producto(String linea){
        StringTokenizer token = new StringTokenizer(linea,"*");
        codigo = Integer.parseInt(token.nextToken());
        nombre = token.nextToken();
        precio = Float.parseFloat(token.nextToken());
        cantidad = Integer.parseInt(token.nextToken());
        descripcion = token.nextToken();
        AlmacenCtrl.instancia().buscarAlmacenPorCodigo(Integer.parseInt(token.nextToken()));
        almacen = AlmacenCtrl.instancia().getAlmacen();
        
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

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
    
    
    public String toRegistro(){
        return codigo + "*" + nombre + "*" + precio + "*" + cantidad +  "*" + descripcion + "*" + almacen.getCodigoAlmacen();
    }
    
    @Override 
    public String toString(){
        return codigo + "  " + nombre + "  " + precio + "  " + cantidad + "  " + descripcion;
    }
    
}
