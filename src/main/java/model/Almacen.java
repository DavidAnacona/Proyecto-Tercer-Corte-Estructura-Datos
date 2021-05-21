package model;
import java.util.StringTokenizer;
import resources.Cola.Cola;


public class Almacen {
    
    private int codigoAlmacen;
    private String nombreSede;
    private String direccion;
    
    
    public Almacen (){
        
    }

    public Almacen(int codigoAlmacen, String nombreSede, String direccion) {
        this.codigoAlmacen = codigoAlmacen;
        this.nombreSede = nombreSede;
        this.direccion = direccion;
    }

    public Almacen(String linea){
        StringTokenizer token = new StringTokenizer(linea,"*");
        codigoAlmacen = Integer.parseInt(token.nextToken());
        nombreSede = token.nextToken();
        direccion = token.nextToken();
        
    }

    public int getCodigoAlmacen() {
        return codigoAlmacen;
    }

    public void setCodigoAlmacen(int codigoAlmacen) {
        this.codigoAlmacen = codigoAlmacen;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String toRegistro(){
        return "*" + codigoAlmacen + "*" + nombreSede + "*" + direccion;
    }

    @Override
    public String toString(){
        return codigoAlmacen + "  " + nombreSede + "  " + direccion;
    }
}
