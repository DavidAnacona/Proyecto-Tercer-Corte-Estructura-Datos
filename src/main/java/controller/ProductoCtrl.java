package controller;

import model.Producto;
import persist.ProductoDAO;
import resources.Cola.Cola;

public class ProductoCtrl {
    
    private Producto producto;
    private Cola<Producto> listaProducto;
    private static ProductoCtrl productoCtrl;
    private int indexProductoSelect;
    
    private ProductoCtrl(){
        listaProducto = cargarProductos();
        producto = null;
    }
    
    
    private Cola<Producto> cargarProductos(){
        return ProductoDAO.instancia().consultarProducto();
    }
    
    public static ProductoCtrl instancia(){
        
        if(productoCtrl == null){
            productoCtrl = new ProductoCtrl();
        }
        return productoCtrl;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cola<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(Cola<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }
    
    public void addProducto(String codigo, String nombre, String precio, String cantidad, String descripcion){
        
        this.producto = new Producto();
        this.producto.setCodigo(Integer.parseInt(codigo));
        this.producto.setNombre(nombre);
        this.producto.setPrecio(Float.parseFloat(precio));
        this.producto.setCantidad(Integer.parseInt(cantidad));
        this.producto.setDescripcion(descripcion);
        this.listaProducto.add(producto);
    }
    
    public void buscarProducto(int index){
        producto = listaProducto.contain(index + 1);
        indexProductoSelect = index + 1;
    }
    
    public void buscarProductoPorCodigo(int codigo){
        producto = null;
        Producto pro = null;
        listaProducto.inicio();
        for(int i=1; i<listaProducto.size(); i++){
            pro = listaProducto.next();
            if(pro.getCodigo() == codigo){
                producto = pro;
            }
        }
        
        //Este metodo lo usaremos mas adelante cuando estemos filtrando las busquedas
    }
    
    public void modificarProducto (String codigo, String nombre, String precio,String cantidad, String descripcion){
        
        this.producto = new Producto();
        this.producto.setCodigo(Integer.parseInt(codigo));
        this.producto.setNombre(nombre);
        this.producto.setPrecio(Float.parseFloat(precio));
        this.producto.setCantidad(Integer.parseInt(cantidad));
        this.producto.setDescripcion(descripcion);
        this.listaProducto.set(indexProductoSelect, producto);
    }
    
    public void guardarProducto(){
        ProductoDAO.instancia().guardarProductos(listaProducto);
    }
    
    public void eliminarProducto(){
        listaProducto.remove();
    }
}
