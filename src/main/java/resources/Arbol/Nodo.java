package resources.Arbol;

import java.util.Objects;

public class Nodo<K,T> {
    private K key;
    private T dato;
    private Nodo<K,T> izq;
    private Nodo<K,T> der;
    
    public Nodo(K key, T dato){
        this.key=key;
        this.dato=dato;
        this.izq=null;
        this.der=null;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<K, T> getIzq() {
        return izq;
    }

    public void setIzq(Nodo<K, T> izq) {
        this.izq = izq;
    }

    public Nodo<K, T> getDer() {
        return der;
    }

    public void setDer(Nodo<K, T> der) {
        this.der = der;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.key);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nodo<?, ?> other = (Nodo<?, ?>) obj;
        if (!Objects.equals(this.key, other.key)) {
            return false;
        }
        return true;
    }
    
    
}