
package proyectofinal;

/**
 *
 * @author Fabian
 */
class Almacen {
    int Nlocal;
    String Nombrelocal;
    ColaTecnico tecnico;
    ColaTrabajo trabajo;

    public Almacen(int Nlocal, String Nombrelocal, ColaTecnico tecnico, ColaTrabajo trabajo) {
        this.Nlocal = Nlocal;
        this.Nombrelocal = Nombrelocal;
        this.tecnico = tecnico;
        this.trabajo = trabajo;
    }
    public Almacen() {
        this.Nlocal = Nlocal;
        this.Nombrelocal = Nombrelocal;
        this.tecnico = tecnico;
        this.trabajo = trabajo;
    }

    @Override
    public String toString() {
        return "\"\n¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n"+"\nAlmacen\n"+"_____________________" + "\nN°local=" + Nlocal + ", Nombre=" + Nombrelocal +"\n"+ 
                "\nTecnicos\n_____________________\n" + tecnico + ']'+"\n"+
                "\nEn Servicio\n_____________________\n" + trabajo + ']'+"\n"
                ;
    }
    
    
    
}
