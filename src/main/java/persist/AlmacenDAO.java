package persist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import model.Almacen;
import resources.ListaDoble.ListaDoble;

public class AlmacenDAO {
    
    private String fileName;
    private BufferedWriter bw;
    private BufferedReader br;
    private static AlmacenDAO almacenDAO;
    
    private AlmacenDAO(){
        fileName = "almacen.txt";
    }
    
    public static AlmacenDAO instancia(){
        
        if(almacenDAO == null){
            almacenDAO = new AlmacenDAO();
        }
        return almacenDAO;
    }
    
    public String guardarAlmacen(ListaDoble lista){
        String mensaje="";
        try{
            bw = new BufferedWriter(new FileWriter(fileName));
            lista.inicio();
            for(int i=1; i<=lista.size(); i++){
                Almacen almacen = (Almacen)lista.contain(i);
                bw.append(almacen.toRegistro());
                bw.newLine();
            }
            bw.close();
            mensaje = "Registro agregado con exito";
        }catch(IOException e){
            mensaje = "Error al agregar el registro" + e.getMessage();
        }
        return mensaje;
    }
    
    public ListaDoble<Almacen> consultarAlmacen(){
        
        Almacen almacen;
        ListaDoble<Almacen> lista = new ListaDoble();
        String linea;
        try{
            br = new BufferedReader(new FileReader(fileName));
            linea = br.readLine();
            while(linea!=null){
                almacen = new Almacen(linea);
                lista.add(almacen);
                linea = br.readLine();
            }
            br.close();
        }catch(IOException e){
            
        }
        return lista;
    }
    
    
}
