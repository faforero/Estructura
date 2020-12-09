package proyectofinal;

/**
 *
 * @author Fabian
 */
public class NodoCola {

    Computadores info;
    Tecnico informacion;
    NodoCola sig;
    NodoCola ant;

    public NodoCola() {
        this.info = info;
        this.informacion = informacion;
        this.sig = sig;
        this.ant = ant;
    }
    
    

    public NodoCola(Computadores info) {
        this.info = info;
        sig = ant = null;
    }
    public NodoCola(Tecnico informacion) {
        this.informacion = informacion;
        sig = ant = null;
    }

    @Override
    public String toString() {
        return "DATOS :|" + "informacion=" + informacion + '|';
    }
    
    
}
