
package proyectofinal;

/**
 *
 * @author Fabian
 */
public class Pila {
     NodoPila cab;

    public Pila() {
        cab = null;
    }

    public boolean isVacia() {
        return (cab == null);
    }

    public void insertar(NodoPila nuevo) {
        if (!isVacia()) {
            cab.ant = nuevo;
            nuevo.sig = cab;
        }
        cab = nuevo;
    }

    public Computadores eliminar() {
        if (!isVacia()) {
            Computadores elim = cab.info;
            cab = cab.sig;
            if (cab != null) {
                cab.ant = null;
            }
            return elim;
        }
        return null;
    }

    @Override
    public String toString() {
        String mostrar = "----------\nBODEGA\n";
        NodoPila tmp = cab;
        while (tmp != null) {
            
            mostrar += "\n"+"(" + tmp.info + ")";
            tmp = tmp.sig;
        }
        return mostrar + "\n----------------------------------------";
    }
}
