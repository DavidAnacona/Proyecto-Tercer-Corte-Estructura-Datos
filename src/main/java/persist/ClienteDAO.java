package persist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import model.Cliente;
import resources.ListaDoble.ListaDoble;


public class ClienteDAO {
    
    private String fileName;
    private BufferedWriter bw;
    private BufferedReader br;
    private static ClienteDAO clienteDAO;
    
    private ClienteDAO(){
        fileName = "clientes.txt";
    }
    
    public static ClienteDAO instancia(){
        
        if(clienteDAO == null){
            clienteDAO = new ClienteDAO();
        }
        return clienteDAO;
    }
    
    public String guardarClientes(ListaDoble lista){
        String mensaje="";
        try{
            bw = new BufferedWriter(new FileWriter(fileName));
            lista.inicio();
            for(int i=1; i<=lista.size(); i++){
                Cliente cliente = (Cliente)lista.contain(i);
                bw.append(cliente.toRegistro());
                bw.newLine();
            }
            bw.close();
            mensaje = "Registro agregado con exito";
        }catch(IOException e){
            mensaje = "Error al agregar el registro" + e.getMessage();
        }
        return mensaje;
    }
    
    public ListaDoble<Cliente> consultarClientes(){
        
        Cliente cliente;
        ListaDoble<Cliente> lista = new ListaDoble();
        String linea;
        try{
            br = new BufferedReader(new FileReader(fileName));
            linea = br.readLine();
            while(linea!=null){
                cliente = new Cliente(linea);
                lista.add(cliente);
                linea = br.readLine();
            }
            br.close();
        }catch(IOException e){
            
        }
        return lista;
    }
}
