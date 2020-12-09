package proyectofinal;

/**
 *
 * @author Fabian
 */
public class Computadores {

    private int id;
    private String marca;
    private String servicio;
    private String propietario;
    int costo;
    Tecnico tecnico;

    public Computadores(int id, String nombre, String servicio, String propietario) {
        this.id = id;
        this.marca = nombre;
        this.servicio = servicio;
        this.propietario = propietario;
        this.costo=15;
    }

    public Computadores(int id) {
        this.id = id;
        this.marca = "NN";
        this.servicio = "normal";
        this.propietario = "Fabian Forero ";
        this.costo=15;
    }

    public Computadores() {
        this.id = id;
        this.marca = "NN";
        this.servicio = "normal";
        this.propietario = "Fabian Forero ";
        this.costo=15;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    

    @Override
    public String toString() {
        if(tecnico!=null)
            return "Computador" + " Referencia=" + id + ", marca=" + marca + ", servicio=" + servicio+ ", Dueño=" + propietario+", Atendido por: "+tecnico.toString() ;
        else
            return "Computador" + " Referencia=" + id + ", marca=" + marca + ", servicio=" + servicio+ ", Dueño=" + propietario ;
    }

}
