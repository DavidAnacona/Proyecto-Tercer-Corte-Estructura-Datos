package resources.Arbol;

import java.util.Objects;


public class Tree<K,T> {

    private Nodo<K,T> raiz;
    private Nodo<K,T> aux;
    private int lado;

    
    public Tree(){
        raiz =null;
    }

    public Nodo<K, T> getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo<K, T> raiz) {
        this.raiz = raiz;
    }

    public boolean insert(K key, T dato){
        boolean inserto=true;
        Nodo<K,T> nuevo = new Nodo(key,dato);
        if(raiz == null){
            raiz = nuevo;
        }else{
            Nodo<K,T> aux = seekHoja(key);
            if(key.equals(aux.getKey())){
                inserto=false;
            }else{
                if(aux.getKey().hashCode()>key.hashCode()){
                    aux.setIzq(nuevo);
                }else{
                    aux.setDer(nuevo);
                }
            }
        }
        return inserto;
    }

    private Nodo<K, T> seekHoja(K key) {                                                                            
       boolean encontro = false;
       Nodo<K,T> aux = raiz;
       do{
           if(key.equals(aux.getKey())){
               encontro =true;
           }else{
               if(key.hashCode()< aux.getKey().hashCode()){
                   if(aux.getIzq()!=null){
                       aux = aux.getIzq();
                   }else{
                       encontro=true;
                   }
               }else{
                   if(aux.getDer()!=null){
                       aux = aux.getDer();
                   }else{
                       encontro = true;
                   }
               }
           }
       }while(!encontro);
       return aux;
    }
    
    public void listarTree(int metodo){
        if(raiz !=null){
            Nodo<K,T> aux = raiz;
            switch(metodo){
                case 1:
                    listarInOrden(aux);
                    break;
                case 2:
                    listarPreOrden(aux);
                    break;
                case 3:
                    listarPosOrden(aux);
                    break;
                default:    
            }
        }
    }

    private void listarInOrden(Nodo<K, T> aux) {
        if(aux!=null){
            listarInOrden(aux.getIzq());
            System.out.println(aux.getDato());
            listarInOrden(aux.getDer());
        }
    }
    
    private void listarPreOrden(Nodo<K, T> aux) {
        if(aux!=null){
            System.out.println(aux.getDato());
            listarPreOrden(aux.getIzq());
            listarPreOrden(aux.getDer());
        }
    }
    
    private void listarPosOrden(Nodo<K, T> aux) {
        if(aux!=null){
            listarPosOrden(aux.getIzq());
            listarPosOrden(aux.getDer());
            System.out.println(aux.getDato());
        }
    }
    
    public boolean delete(K key){
        lado=2;
        Nodo<K,T> dato = seekNodo(key);
        Nodo<K,T> aux1;
        boolean borrado = true;
        if(dato != null){
            while(dato.getIzq()!=null || dato.getDer()!=null){
                if(dato.getIzq()!=null){
                    aux1 = buscarNext(dato,0);
                }else{
                    aux1 = buscarNext(dato,1);
                }
                dato.setKey(aux1.getKey());
                dato.setDato(aux1.getDato());
                dato = aux1;
            }
            if(lado==0)
                aux.setIzq(null);
            else{
                if(lado==1){
                    aux.setDer(null);
                }
            }
        }else{
            borrado = false;
        }
        return borrado;
    }

    private Nodo<K,T> seekNodo(K key) {
        boolean encontro=false;
        Nodo<K,T> aux1 = raiz;
        aux=raiz;
        do{
            if(aux1.getKey().equals(key))
                encontro = true;
            else{
                if(aux1.getKey().hashCode()>key.hashCode()){
                    aux=aux1;
                    lado=0;
                    aux1 = aux1.getIzq();
                }else{
                    aux=aux1;
                    lado=1;
                    aux1 = aux1.getDer();
                }
            }
        }while(!encontro && aux1!=null);
        return aux1;
    }

    private Nodo<K,T> buscarNext(Nodo<K,T> izq, int i) {
        boolean fin = true;
        Nodo<K,T> nodo = izq;
        
        if(i==0){
            aux = nodo;
            lado=0;
            nodo = nodo.getIzq();
        }else{
            aux = nodo;
            lado=1;
            nodo = nodo.getDer();
        }
        do{
            if(i==0)
                if(nodo.getDer()!= null){
                    aux =nodo;
                    lado=1;
                    nodo = nodo.getDer();
                }else
                    fin =false;
            else{
                if(i==1)
                    if(nodo.getIzq()!= null){
                        aux = nodo;
                        lado=0;
                        nodo = nodo.getIzq();
                    }else
                    fin =false;
            }    
        }while(fin);
        return nodo;
    }

}