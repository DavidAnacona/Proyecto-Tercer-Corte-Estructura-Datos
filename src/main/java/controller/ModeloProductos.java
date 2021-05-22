package controller;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import java.util.List;
import resources.Cola.Cola;
import model.Producto;


public class ModeloProductos extends AbstractTableModel {

    private List<String> titulos;
    private Cola<Producto> lista;
    
    public ModeloProductos(){
        this.lista = new Cola<>();
        titulos = new ArrayList();
        titulos.add("codigo");
        titulos.add("nombre");
        titulos.add("precio");
        titulos.add("cantidad");
        titulos.add("descripcion");
    }
    public ModeloProductos(Cola<Producto> lista){
        this.lista = new Cola<>();
        titulos = new ArrayList();
        titulos.add("codigo");
        titulos.add("nombre");
        titulos.add("precio");
        titulos.add("cantidad");
        titulos.add("descripcion");
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
        Producto producto = lista.contain(+1);
        switch(columnIndex){
            case 0:
                return producto.getCodigo();
            case 1:
                return producto.getNombre();
            case 2:
                return producto.getPrecio();
            case 3:
                return producto.getCantidad();
            case 4:
                return producto.getDescripcion();
            default:
                return null;
        }
    }
    
    public String getColumnName(int columnIndex){
        return titulos.get(columnIndex);
    }
    
    public Object getValueAt(int rowIndex){
        return lista.contain(rowIndex+1);
    }
}
