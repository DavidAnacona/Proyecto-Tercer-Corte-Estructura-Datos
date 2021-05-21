package resources.Cola;

public class Cola<T> {
 
    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private Nodo<T> aux;
    private int size;
    
    
    public Cola(){
        cabeza=null;
        cola=null;
        size=0;
    }
    
    public void add(T t){
        Nodo<T> nodo = new Nodo(t);
        if(cabeza==null){
           cabeza = nodo; 
           cola =nodo;
        }else{
            cola.setSig(nodo);
            cola = nodo;
        }
        size++;
    }
    
    
    public T remove(){
        Nodo<T> aux = cabeza;
        if(cabeza !=null){
            cabeza = cabeza.getSig();
            size--;
            aux.setSig(null);
            return aux.getDato();
        }
        return null;
    }
    
    public int size(){
        return size;
    }
    
    public void inicio(){
        aux = cabeza;
    }
    
    public T next(){
        T t;
        if(aux!=null){
            t = aux.getDato();
            aux=aux.getSig();
            return t;
        }else{
            return null;
        }
    }
    public T contain(int index){
       aux = cabeza;
        if (index > 0 && index <= size) {
            for (int i = 1; i < index; i++) {
                aux = aux.getSig();
            }
            return aux.getDato();
        }
        return null;
    }
    public T set(int index, T t){
        aux = cabeza;
        if(index>size || index<1 ){
            return null;
        }else{
            for(int i=1;i<index;i++){
                aux = aux.getSig();
            }
            aux.setDato(t);
            return aux.getDato();
        }
    }
}