
package proyectofinal;

/**
 *
 * @author Fabian
 */
public class NodoLista {
    public Almacen info;
    public NodoLista sig;

    public NodoLista(Almacen info) {
        this.info = info;
        this.sig = sig;
    }
    public NodoLista() {
        this.info = info;
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "ALMACENES : |" + "info=" + info +  '|';
    }
    
   
}
