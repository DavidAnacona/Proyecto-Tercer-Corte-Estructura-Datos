package persist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import model.Producto;
import resources.Cola.Cola;



public class ProductoDAO {
    
    private String fileName;
    private BufferedWriter bw;
    private BufferedReader br;
    private static ProductoDAO productoDAO;
    
    private ProductoDAO(){
        fileName = "productos.txt";
    }
    
    public static ProductoDAO instancia(){
        
        if(productoDAO == null){
            productoDAO = new ProductoDAO();
        }
        return productoDAO;
    }
    
    public String guardarProductos(Cola cola){
        String mensaje="";
        try{
            bw = new BufferedWriter(new FileWriter(fileName));
            cola.inicio();
            for(int i=1; i<=cola.size(); i++){
                Producto producto = (Producto)cola.contain(i);
                bw.append(producto.toRegistro());
                bw.newLine();
            }
            bw.close();
            mensaje = "Registro agregado con exito";
        }catch(IOException e){
            mensaje = "Error al agregar el registro" + e.getMessage();
        }
        return mensaje;
    }
    
    public Cola<Producto> consultarProducto(){
        
        Producto producto;
        Cola<Producto> cola = new Cola();
        String linea;
        try{
            br = new BufferedReader(new FileReader(fileName));
            linea = br.readLine();
            while(linea!=null){
                producto = new Producto(linea);
                cola.add(producto);
                linea = br.readLine();
            }
            br.close();
        }catch(IOException e){
            
        }
        return cola;
    }
}
