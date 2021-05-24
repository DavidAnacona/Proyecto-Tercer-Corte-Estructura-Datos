package controller;

import model.Factura;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import model.Almacen;
import model.Cliente;
import model.Producto;
import persist.FacturaDAO;
import resources.ListaDoble.ListaDoble;
import persist.FacturaDAO;

public class FacturaCtrl {
    
    private Factura factura;
    private ListaDoble<Factura> listaFacturas;
    private static FacturaCtrl facturaCtrl;
    private int indexFacturaSelect;
    
    private FacturaCtrl(){
        listaFacturas = cargarFacturas();
        factura = null;
    }
    
    private ListaDoble<Factura> cargarFacturas(){
        return FacturaDAO.instancia().consultarFacturas();
    }
    
    public static FacturaCtrl instancia(){
        
        if(facturaCtrl == null){
            facturaCtrl = new FacturaCtrl();
        }
        return facturaCtrl;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public ListaDoble<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(ListaDoble<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }
    public void addFacturas(String codigo, Cliente cliente, Almacen almacen, String fecha) {
        this.factura = new Factura(); 
        this.factura.setCodigoFactura(Integer.parseInt(codigo));
        this.factura.setCliente(cliente);       
        this.factura.setAlmacen(almacen);
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        try {
            this.factura.setFechaFactura(formato.parse(fecha));
        } catch (ParseException ex) {
            Logger.getLogger(FacturaCtrl.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.listaFacturas.add(factura);
    }
    
    public void guardarFacturas(){
        FacturaDAO.instancia().guardarFacturas(listaFacturas);
    }
    public void eliminarEstudiante(){
        listaFacturas.remove(factura);
    }
    
    public ModeloFactura buscarFacturaPorCliente(Object clientes){
        Cliente cli = (Cliente)clientes;
        ListaDoble<Factura> listaFiltrada = new ListaDoble();
        listaFacturas.inicio();
        for(int i =0; i<listaFacturas.size();i++){
            Factura fac = listaFacturas.next();
            if(fac.getCliente().getNumIdentidad() == cli.getNumIdentidad()){
                listaFiltrada.add(fac);
            }
        }
        ModeloFactura modelo = new ModeloFactura(listaFiltrada);
        return modelo;
    }
    
     public DefaultListModel listarProductoFactura(){
        DefaultListModel model = new DefaultListModel();
        factura.getProductos().inicio();
        for(int i=0; i<factura.getProductos().size();i++){
            model.addElement(factura.getProductos().next());
        }
        return model;
    }
}
