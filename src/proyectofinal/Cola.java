package proyectofinal;

/**
 *
 * @author Fabian
 */
public class Cola {

    NodoCola cab;
    NodoCola cola;

    public Cola() {
        cab = null;
    }

    public boolean isVacia() {
        return (cab == null);
    }

    public void insertar(NodoCola nuevo) {
        if (isVacia()) {
            cola = nuevo;
        } else {
            cab.ant = nuevo;
            nuevo.sig = cab;
        }
        cab = nuevo;
    }
    public int recaudo(NodoCola nuevo) {
        int cont=0,con=0;
        NodoCola tmp=new NodoCola();
        if (!isVacia()) {
            if (tmp.info.getServicio()=="normal") {
                
                cont++;
            }
        } 
        return 0;
    }

    public Computadores Atender() {
        if (!isVacia()) {
            Computadores elim;
            elim = cola.info;
            if (cola.ant != null) {
                cola = cola.ant;
                cola.sig = null;
            } else {
                cola = cab = null;
            }
            return elim;
        }
        return null;
    }

    public Tecnico OcuparEmpleado() {
        if (!isVacia()) {
            Tecnico elim;
            elim = cola.informacion;
            if (cola.ant != null) {
                cola = cola.ant;
                cola.sig = null;
            } else {
                cola = cab = null;
            }
            return elim;
        }
        return null;
    }

    @Override
    public String toString() {
        String mostrar = " --------------------------------\nAlmacén";
        NodoCola tmp = cab;
        while (tmp != null) {
            mostrar += "\n[" + tmp.info + "] ";
            tmp = tmp.sig;
        }
        return mostrar + "";
        
    }
}
