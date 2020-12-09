
package proyectofinal;

/**
 *
 * @author Fabian
 */
public class NodoPila {
    Computadores info;
    NodoPila sig;
    NodoPila ant;
    
    public NodoPila(Computadores info){
        this.info=info;
        sig=ant=null;        
    }
}
