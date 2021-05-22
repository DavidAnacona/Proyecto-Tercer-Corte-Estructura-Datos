package controller;

import model.Cliente;
import persist.ClienteDAO;
import resources.ListaDoble.ListaDoble;

public class ClienteCtrl {
    
    private Cliente cliente;
    private ListaDoble<Cliente> listaCliente;
    private static ClienteCtrl clienteCtrl;
    private int indexClienteSelect;
    
    private ClienteCtrl(){
        listaCliente = cargarClientes();
        cliente = null;
    }
    
    
    private ListaDoble<Cliente> cargarClientes(){
        return ClienteDAO.instancia().consultarClientes();
    }
    
    public static ClienteCtrl instancia(){
        
        if(clienteCtrl == null){
            clienteCtrl = new ClienteCtrl();
        }
        return clienteCtrl;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ListaDoble<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ListaDoble<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
    
    public void addCliente(String NumIdentidad, String nombre, String apellido, String correo, 
            String celular, String ciudad, String direccion){
        
        this.cliente = new Cliente();
        this.cliente.setNumIdentidad(Long.parseLong(NumIdentidad));
        this.cliente.setNombre(nombre);
        this.cliente.setApellido(apellido);
        this.cliente.setCorreo(correo);
        this.cliente.setCelular(Long.parseLong(celular));
        this.cliente.setCiudad(ciudad);
        this.cliente.setDireccion(direccion);
        this.listaCliente.add(cliente);
    }
    
    public void buscarCliente(int index){
        cliente = listaCliente.contain(index + 1);
        indexClienteSelect = index + 1;
    }
    
    public void buscarClientePorNumIdentidad(int NumIdentidad){
        cliente = null;
        Cliente cli = null;
        listaCliente.inicio();
        for(int i=0; i<listaCliente.size(); i++){
            cli = listaCliente.next();
            if(cli.getNumIdentidad() == NumIdentidad){
                cliente = cli;
            }
        }
    }
    
    public void modificarCliente(String NumIdentidad, String nombre, String apellido, String correo, 
            String celular, String ciudad, String direccion){
        
        this.cliente = new Cliente();
        this.cliente.setNumIdentidad(Long.parseLong(NumIdentidad));
        this.cliente.setNombre(nombre);
        this.cliente.setApellido(apellido);
        this.cliente.setCorreo(correo);
        this.cliente.setCelular(Long.parseLong(celular));
        this.cliente.setCiudad(ciudad);
        this.cliente.setDireccion(direccion);
        this.listaCliente.set(indexClienteSelect, cliente);
    }
    
    public void guardarCliente(){
        ClienteDAO.instancia().guardarClientes(listaCliente);
    }
    
    public void eliminarCliente(){
        listaCliente.remove(cliente);
    }
}
