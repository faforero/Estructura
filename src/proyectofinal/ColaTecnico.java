
package proyectofinal;

/**
 *
 * @author Fabian
 */
public class ColaTecnico {
    NodoCola cab;
    NodoCola cola;
    int tam=0;
    int recaudo=0;

    public ColaTecnico() {
        cab = null;
    }

    public boolean isVacia() {
        return (cab == null);
    }

    public void insertar(NodoCola nuevo) {
        if (isVacia()) {
            cola = nuevo;
             recaudo+=nuevo.informacion.recaudo;
        } else {
            cab.ant = nuevo;
            nuevo.sig = cab;
            recaudo+=nuevo.informacion.recaudo;
        }
        tam++;
        cab = nuevo;
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
    
    public Tecnico eliminarValor(int infoId) {
        Tecnico a=new Tecnico();
        if (!isVacia()) {
            if (cab.informacion.getId() == infoId) {
                a=cab.informacion;
                cab = cab.sig;
                return a;
            }
            NodoCola tmp = cab, aux = cab;
            while (tmp != null) {
                if (tmp.informacion.getId() == infoId) {
                     a=aux.sig.informacion;
                    aux.sig = tmp.sig;
                    return a;
                }
                aux = tmp;
                tmp = tmp.sig;
            }
        }
        return null;
    }
   
    public String ganancias() {
        String mostrar = "  ";
        NodoCola tmp = cab;
        while (tmp != null) {
            mostrar += "\n[" +tmp.informacion + ",Ganancia: "+tmp.informacion.AtendidosComp*5+" Dolares ]  ";        
            tmp = tmp.sig;
        }
        return mostrar + "";
    } 

    public int plata() {
        int mostrar = 0;
        NodoCola tmp = cab;
        while (tmp != null) {
           mostrar +=tmp.informacion.AtendidosComp*5;        
            tmp = tmp.sig;
        }
        return mostrar;
    } 
   
 
    public String Mrecaudo() {
        return "TOTAL: $"+recaudo+" Dolares";
    } 
    public int MRecaudo() {
        return recaudo;
    } 

    @Override
    public String toString() {
        String mostrar = "  ÁREA↔";
        NodoCola tmp = cab;
        while (tmp != null) {
            mostrar += "\n[" + tmp.informacion + "] ↔ ";
            tmp = tmp.sig;
        }
        return mostrar + " ";
    } 
}
