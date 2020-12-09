package proyectofinal;

import java.util.Scanner;

/**
 *
 * @author Fabian
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 3, te = 2;
        Scanner tec = new Scanner(System.in);
        Scanner tec1 = new Scanner(System.in);
        Scanner tec2 = new Scanner(System.in);
        Scanner tec3 = new Scanner(System.in);
        Cola pc = new Cola();
        Cola proceso = new Cola();
//        ColaTecnico tecnico = new ColaTecnico();
//        ColaTecnico trabajo = new ColaTecnico();
        Pila pila = new Pila();
        ListaSimple centro = new ListaSimple();
        //   Computadores cp = new Computadores();

        pc.insertar(new NodoCola(new Computadores(001)));
        pc.insertar(new NodoCola(new Computadores(002)));
        pc.insertar(new NodoCola(new Computadores(003)));

        Almacen primero = new Almacen(1, "ALMACEN 1", new ColaTecnico(), new ColaTrabajo());
        primero.tecnico.insertar(new NodoCola(new Tecnico(117, "Jaime Florez", true)));
        primero.tecnico.insertar(new NodoCola(new Tecnico(118, "Deimart Garzon", true)));
        Almacen segundo = new Almacen(2, "ALMACEN 2 ", new ColaTecnico(), new ColaTrabajo());
        segundo.tecnico.insertar(new NodoCola(new Tecnico(119, "Daniel Solano", true)));
        segundo.tecnico.insertar(new NodoCola(new Tecnico(120, "Jorge Valencia", true)));
        centro.insertarCab(new NodoLista(primero));
        centro.insertarCab(new NodoLista(segundo));
        int al;
        NodoLista sitio;

        while (true) {
            try {
                System.out.println("░░░░░░░░░░░░░░░░░░░░ ");
                System.out.println("1) Ingresar Pc ");
                System.out.println("2) Atender servicio ");
                System.out.println("3) Terminar servicio ");
                System.out.println("4) PC y ténicos por almacen");
                System.out.println("5) Ver Ingresos ");
                System.out.println("6) Ver Almacenes ");
                System.out.println("7) Salir ");
                System.out.println("░░░░░░░░░░░░░░░░░░░░ ");
                System.out.println(" ");
                int opcion = tec.nextInt();
                System.out.println("");

                switch (opcion) {
                    case 1:
//                        System.out.println(" ALMACEN 1 O 2 \n");
                        int id;
                        String marca,
                         propietario,
                         servicio;
//                        System.out.println(" ALMACEN ");
//                        al = tec.nextInt();
//                        sitio = centro.BuscarAlmacen(al);
//                        if (sitio != null) {
                        System.out.println(" Ingresar Datos ");
                        System.out.println(" ");
                        System.out.println("↔ Referencia");
                        id = tec.nextInt();

                        System.out.println(" ");
                        System.out.println("\n↔ Marca ");
                        marca = tec1.nextLine();

                        System.out.println("\n↔ Servicio ");
                        servicio = tec2.nextLine();

                        System.out.println("\n↔ Dueño ");
                        propietario = tec3.nextLine();
                        Computadores compu = new Computadores(id, marca, servicio, propietario);
                        if (servicio.equalsIgnoreCase("normal")) {
                            System.out.println("\nTENDRA UN COSTO DE $15 DOLARES\n");
                        } else {
                            compu.costo = 25;
                            System.out.println("\nTENDRA UN COSTO DE $25 DOLARES\n");

                        }
                        pc.insertar(new NodoCola(compu));
                        System.out.println(pc);
                        cont++;
                        System.out.println("\n CANTIDAD COMPUTADORES: " + cont);
                        System.out.println("\nCANTIDAD DE EMPLEADOS: " + te);
//                        } else {
//                            System.out.println(" NO SE ENCONTRO EL ALAMACEN :" + al);
//                        }
                        break;

                    case 2:
                        if (cont == 0) {
                            System.out.println(" NO HAY COMPUTADORES POR ATENDER ");
                            break;
                        }
                        System.out.println(" ALMACEN ");
                        al = tec.nextInt();
                        sitio = centro.BuscarAlmacen(al);
//                        if (sitio) {
//                            System.out.println(" NO SE ENCONTRO EL ALAMACEN :" + al);
//                            break;
//                        }
                        if (sitio != null) {
                            if (sitio.info.tecnico.tam < 1) {
                                System.out.println(" TODOS LOS EMPLEADOS ESTAN OCUPADOS ");
                                break;
                            } else {

                                System.out.println(" ATENDIENDO SERVICIO ");
                                Computadores pcatendido = pc.Atender();
                                pcatendido.tecnico = sitio.info.tecnico.OcuparEmpleado();
                                pcatendido.tecnico.AtendidosComp++;
                                pcatendido.tecnico.recaudo += pcatendido.costo;
                                sitio.info.trabajo.insertar(new NodoCola(pcatendido.tecnico));
                                pcatendido.tecnico.recaudo = 0;
                                proceso.insertar(new NodoCola(pcatendido));
                                cont--;
                                sitio.info.tecnico.tam--;
                                if (cont >= 0) {
                                    System.out.println("\nCANTIDAD DE EQUIPOS: " + cont);
                                }
                            }
                        } else {
                            System.out.println(" NO SE ENCONTRO EL ALAMACEN :" + al);
                        }
                        break;

                    case 3:
                        int x = 0;
                        te++;
                        System.out.println(" ALMACEN ");
                        al = tec.nextInt();
                        sitio = centro.BuscarAlmacen(al);
                        if (sitio != null) {
                            System.out.println(" INGRESE EL CODIGO DEL TECNICO QUE TERMINO EL SERVICIO");
                            x = tec.nextInt();
                            
                            Tecnico insertar = sitio.info.trabajo.eliminarValor(x);
                            if (insertar == null) {
                                System.out.println("NO EXISTE UN EMPLEADO CON EL ID: " + x);
                                break;
                            } else {
                                Computadores c = proceso.Atender();
                                if (c == null) {
                                    System.out.println(" ERROR, NO HAY EQUIPO");
                                    break;
                                } else {
                                    pila.insertar(new NodoPila(c));
                                    sitio.info.tecnico.insertar(new NodoCola(insertar));
                                    sitio.info.tecnico.tam++;
                                    System.out.println(sitio.info.tecnico.cab.toString());
                                    System.out.println(" ");
                                }
                            }
                        } else {
                            System.out.println(" NO SE ENCONTRO EL ALAMACEN :" + al);
                        }
                        break;
                    case 4:
                        System.out.println("|| COMPUTADORES NO ATENDIDOS || \n");
                        System.out.println(pc);
                        System.out.println("\n || COMPUTADORES EN SERVICIO || \n");
                        System.out.println(proceso);
                        System.out.println("\n || COMPUTADORES ATENDIDOS || \n");
                        System.out.println(pila);
                        System.out.println(" ALMACEN \n");
                        al = tec.nextInt();
                        sitio = centro.BuscarAlmacen(al);
                        if (sitio != null) {

                            System.out.println("\n || TECNICOS LIBRES || \n");
                            System.out.println(sitio.info.tecnico);
                            System.out.println("\n || TECNICOS EN SERVICIO|| ");
                            System.out.println(sitio.info.trabajo);
                        } else {
                            System.out.println(" NO SE ENCONTRO EL ALAMACEN :" + al);
                        }
                        break;
                    case 5:
                        System.out.println(" ALMACEN \n");
                        al = tec.nextInt();
                        sitio = centro.BuscarAlmacen(al);
                        if (sitio != null) {
                            System.out.println(" ----------------------------");
                            System.out.println(" RECAUDO \n ");
                            int g = sitio.info.trabajo.MRecaudo();
                            System.out.println("TOTAL: $" + g + " Dolares");
                            System.out.println(" ----------------------------");
                            System.out.println(" PAGO A LOS TRABAJADORES ");
                            int y = sitio.info.tecnico.plata();
                            System.out.println(" $:" + y + " Dolares");
                            System.out.println("\n GANANCIA DEL ALMACEN \n");
                            System.out.println("$ " + (g - y) + " Dolares");
                            System.out.println(" ----------------------------");
                            System.out.println(" GANANCIAS POR TRABAJADOR ");
                            System.out.println(sitio.info.tecnico.ganancias());
                            System.out.println(sitio.info.trabajo.ganancias());

                        } else {
                            System.out.println(" NO SE ENCONTRO EL ALAMACEN :" + al);
                        }
                        break;
                    case 6:
                        System.out.println(" INFORMACION DE LOS ALMACENES\n");
                        System.out.println(centro.toString());
                        break;
                    case 7:
                        System.exit(0);
                        break;
                }
            } catch (Exception e) {
                tec.next();
                System.out.println(" Datos incorrectos ");

            }
        }

    }

}
