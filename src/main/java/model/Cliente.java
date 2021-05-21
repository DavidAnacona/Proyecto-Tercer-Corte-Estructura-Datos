
package model;

import java.util.StringTokenizer;

public class Cliente {
    
    private long NumIdentidad;
    private String nombre;
    private String apellido;
    private String correo;
    private long celular;
    private String ciudad;
    private String direccion;

    public Cliente(){
        
    }
    
    public Cliente(long NumIdentidad, String nombre, String apellido, String correo, long celular, String ciudad, String direccion) {
        this.NumIdentidad = NumIdentidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.celular = celular;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }
    
    public Cliente(String linea){
        StringTokenizer token = new StringTokenizer(linea,"*");
        NumIdentidad = Long.parseLong(token.nextToken());
        nombre = token.nextToken();
        apellido = token.nextToken();
        correo = token.nextToken();
        celular = Long.parseLong(token.nextToken());
        ciudad = token.nextToken();
        direccion = token.nextToken();
        
    }

    public long getNumIdentidad() {
        return NumIdentidad;
    }

    public void setNumIdentidad(long NumIdentidad) {
        this.NumIdentidad = NumIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String toRegistro(){
        return "*" + NumIdentidad + "*" + nombre + "*" + apellido + "*" + correo + "*" + celular + "*" + ciudad + "*" + direccion;
    }
    
    @Override 
    public String toString(){
        return NumIdentidad + "  " + nombre + "  " + apellido + "  " + correo + "  " + celular + "  " + ciudad;
    }
    
}
