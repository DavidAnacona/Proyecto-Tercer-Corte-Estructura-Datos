package model;

import controller.AlmacenCtrl;
import controller.ClienteCtrl;
import java.text.SimpleDateFormat;
import resources.ListaDoble.ListaDoble;
import java.util.Date;
import java.util.StringTokenizer;


import java.text.ParseException;
public class Factura {
    
    private int codigoFactura;
    private Cliente cliente;
    private ListaDoble<Producto> productos;
    private Almacen almacen;
    private Date fechaFactura;
    
    public Factura(){
        productos = new ListaDoble();
    }

    public Factura(int codigoFactura, Cliente cliente, ListaDoble<Producto> productos, Almacen almacen, Date fechaFactura) {
        this.codigoFactura = codigoFactura;
        this.cliente = cliente;
        this.productos = productos;
        this.almacen = almacen;
        this.fechaFactura = fechaFactura;
    }
    
    public Factura(String linea){
        
        StringTokenizer token = new StringTokenizer(linea,"");
        codigoFactura = Integer.parseInt(token.nextToken());
        ClienteCtrl.instancia().buscarClientePorNumIdentidad(Integer.parseInt(token.nextToken()));
        cliente = ClienteCtrl.instancia().getCliente();
        AlmacenCtrl.instancia().buscarAlmacenPorCodigo(Integer.parseInt(token.nextToken()));
        almacen = AlmacenCtrl.instancia().getAlmacen();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        try{
            fechaFactura = formato.parse(token.nextToken());
        }catch(ParseException e){
            
        }
        productos = new ListaDoble();
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ListaDoble<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ListaDoble<Producto> productos) {
        this.productos = productos;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }
    
    public void addProductos(Producto producto){
        productos.add(producto);
    }
    
    public String toRegistro(){
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String fecha = formato.format(fechaFactura);
        return "*" + codigoFactura + "*" + cliente.getNumIdentidad() + "*" + almacen.getCodigoAlmacen() + "*" + fecha;
    }
    
    public String toString(){
        return codigoFactura + "  " + cliente + "  " + fechaFactura;
    }
    
}
