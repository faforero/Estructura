package proyectofinal;

/**
 *
 * @author Fabian
 */
public class Tecnico {
     int id;
    private String nombre;
    private boolean sexo;
    int AtendidosComp;
    int recaudo;

    public Tecnico(int id, String nombre, boolean sexo) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.AtendidosComp=0;
        this.recaudo=0;
    }
    
    public Tecnico() {
        this.id = id;
        this.nombre = "NN";
        this.sexo = true;
        this.AtendidosComp=0;
        this.recaudo=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return ((sexo)?"Sr. ":"Sra. ")+ nombre + "(" + id + ')'+ "( PC Atendidos:" + AtendidosComp + ')';
    }
    
}
