package controller;

import javax.swing.table.DefaultTableModel;
import model.Almacen;
import persist.AlmacenDAO;
import resources.ListaDoble.ListaDoble;


public class AlmacenCtrl {
    
    private Almacen almacen;
    private ListaDoble<Almacen> listaAlmacen;
    private static AlmacenCtrl almacenCtrl;
    private int indexAlmacenSelect;
    
    private AlmacenCtrl(){
        listaAlmacen = cargarAlmacenes();
        almacen = null;
    }
    
    private ListaDoble<Almacen> cargarAlmacenes(){
        return AlmacenDAO.instancia().consultarAlmacen();
    }
    
    public static AlmacenCtrl instancia(){
        
        if(almacenCtrl == null){
            almacenCtrl = new AlmacenCtrl();
        }
        return almacenCtrl;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public ListaDoble<Almacen> getListaAlmacen() {
        return listaAlmacen;
    }

    public void setListaAlmacen(ListaDoble<Almacen> listaAlmacen) {
        this.listaAlmacen = listaAlmacen;
    }
    
    public void addAlmacen(String codigoAlmacen, String nombreSede, String direccion){
        
        this.almacen = new Almacen();
        this.almacen.setCodigoAlmacen(Integer.parseInt(codigoAlmacen));
        this.almacen.setNombreSede(nombreSede);
        this.almacen.setDireccion(direccion);
        this.listaAlmacen.add(almacen);
    }
    

    
    public void buscarAlmacen(int index){
        almacen = listaAlmacen.contain(index + 1);
        indexAlmacenSelect = index + 1;
    }
    
    public void modificarAlmacen(String codigoAlmacen, String nombreSede, String direccion){
        
        this.almacen = new Almacen();
        this.almacen.setCodigoAlmacen(Integer.parseInt(codigoAlmacen));
        this.almacen.setNombreSede(nombreSede);
        this.almacen.setDireccion(direccion);
        this.listaAlmacen.set(indexAlmacenSelect, almacen);
    }
    
    public void guardaAlmacen(){
        AlmacenDAO.instancia().guardarAlmacen(listaAlmacen);
    }
    
    public void eliminarAlmacen(){
        listaAlmacen.remove(almacen);
    }
}
