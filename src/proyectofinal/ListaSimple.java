
package proyectofinal;

/**
 *
 * @author Fabian
 */
public class ListaSimple {
     public NodoLista cab;

    public ListaSimple() {
        cab = null;
    }

    public boolean vacia() {
        return (cab == null);
    }

    public void insertarCab(NodoLista nuevo) {
        if (vacia()) {
            cab = nuevo;
        } else {
            nuevo.sig = cab;
            cab = nuevo;
        }
    }

    public NodoLista BuscarAlmacen(int infoId) {
        if (!vacia()) {
            if (cab.info.Nlocal == infoId) {
                return cab;                
            }
            NodoLista tmp = cab, aux = cab;
            while (tmp != null) {
                if (tmp.info.Nlocal == infoId) {
                    return tmp;
                }
                aux = tmp;
                tmp = tmp.sig;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String mostrar = " ";
        NodoLista tmp = cab;
        while (tmp != null) {
            mostrar += tmp.info + " ";
            tmp = tmp.sig;
        }
        return mostrar + " ";
    }
}
