
package CircularesDobles_Equipos;

public class Princiapl {


    public static void main(String[] args) {
        ListaCircularDoble x= new ListaCircularDoble();
        x.insertar(new Nodo(new Jugador(123,"Ana",false)));
        x.insertar(new Nodo(new Jugador(123,"Juan",true)));
        x.insertar(new Nodo(new Jugador(123,"Pedro",true)));
        x.insertar(new Nodo(new Jugador(123,"Maria",false)));
    
        
        ListaDoble Equipo1= new ListaDoble();
        ListaDoble Equipo2= new ListaDoble();
    
        System.out.println("Circular:"+x);
        Equipo1.insertar(x.eliminar(2));        
        System.out.println("Equipo1:"+Equipo1);
        System.out.println("Equipo2:"+Equipo2);
        System.out.println("Circular:"+x);
        
    }

}
