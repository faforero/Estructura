
package CircularesDobles_Equipos;

public class Jugador {
    public int id;
    public String nombre;
    public boolean sexo;

    public Jugador(int id, String nombre, boolean sexo) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
    }
    
    
    Jugador(int id){
        this.id=id;
        nombre="NN";
        sexo=true;
    }

    @Override
    public String toString() {
        return ((sexo)?"Sr.":"Sra.")+nombre + "("+id+")";
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
}
