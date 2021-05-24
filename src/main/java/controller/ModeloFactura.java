package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Factura;
import resources.ListaDoble.ListaDoble;

public class ModeloFactura extends AbstractTableModel {
    
    private List<String> titulos;
    private ListaDoble<Factura> lista;
    
    public ModeloFactura(){
        this.lista = new ListaDoble<>();
        titulos.add("Codigo");
        titulos.add("Cliente");
        titulos.add("Almacen");
        titulos.add("Productos");
        titulos.add("Fecha");
    }

    public ModeloFactura (ListaDoble<Factura> lista){
        this.lista = lista;
        titulos = new ArrayList();
        titulos.add("Codigo");
        titulos.add("Cliente");
        titulos.add("Almacen");
        titulos.add("Productos");
        titulos.add("Fecha");
    }
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return titulos.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Factura factura = lista.contain(rowIndex + 1 );
        switch(columnIndex){
            case 0:
                return factura.getCodigoFactura();
            case 1:
                return factura.getCliente();
            case 2:
                return factura.getAlmacen();
            case 3:
                return factura.getProductos();
            case 4:{
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                String fecha = formato.format(factura.getFechaFactura());
                return fecha;
                }
            default:
                return null;
        }
    }
    
    @Override 
    public String getColumnName(int columnIndex){
        return titulos.get(columnIndex);
    }
    
    public Object getValueAt(int rowIndex){
        return lista.contain(rowIndex + 1);
    }
}
