package persist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import model.Factura;
import resources.ListaDoble.ListaDoble;

public class FacturaDAO {
    
    private String fileName;
    private BufferedWriter bw;
    private BufferedReader br;
    private static FacturaDAO facturaDAO;
    
    private FacturaDAO(){
        fileName = "Facturas.txt";
    }
    
    public static FacturaDAO instancia(){
        if(facturaDAO == null){
            facturaDAO = new FacturaDAO();
        }
        return facturaDAO;
    }
    
    public String guardarFacturas(ListaDoble lista){
        String mensaje="";
        try{
            bw = new BufferedWriter(new FileWriter(fileName));
            lista.inicio();
            for(int i=1;i<=lista.size();i++){
                Factura factura = (Factura)lista.contain(i);
                bw.append(factura.toRegistro());
                bw.newLine();
            }
            bw.close();
            mensaje = "Estudiantes adicionados correctamente";
        }catch(IOException e){
            mensaje = "Error al adicionar registros" + e.getMessage();
        }
        return mensaje;
    }
    
    public ListaDoble<Factura> consultarFacturas(){
        Factura factura;
        ListaDoble<Factura> lista = new ListaDoble();
        String linea;
        try{
            br = new BufferedReader(new FileReader(fileName));
            linea = br.readLine();
            while(linea!=null){
                factura = new Factura(linea);
                lista.add(factura);
                linea = br.readLine();
            }
            br.close();
        }catch(IOException e){
            
        }
        return lista;
    }
}
