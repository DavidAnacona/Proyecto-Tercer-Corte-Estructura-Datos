
package resources.Arbol;


public class Main {
    
    public static void main(String[] args) {
        Tree<Integer,String> arbol = new Tree();
        arbol.insert(50, "Cincuenta");
        arbol.insert(25, "Veinticinco");
        arbol.insert(80, "Ochenta");
        arbol.insert(15, "Quince");
        arbol.insert(35, "Treinta y Cinco");
        arbol.insert(60, "Sesenta");
        arbol.insert(90, "Noventa");
        arbol.insert(85, "Ochenta y Cinco");
        arbol.insert(82, "Ochenta y Dos");
        arbol.insert(95, "Noventa y Cinco");
        arbol.insert(92, "Noventa y Dos");
        arbol.insert(98, "Noventa y Ocho");
        
        arbol.listarTree(1);        
        System.err.println("******************");
        arbol.delete(80);
        
        arbol.listarTree(1);
    }
}
