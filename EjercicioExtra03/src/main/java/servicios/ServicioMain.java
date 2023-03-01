/*
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package servicios;

import entidades.Alojamiento;
import entidades.Camping;
import entidades.Hotel;
import entidades.Hotel4e;
import entidades.Hotel5e;
import entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author scandiani
 */
public class ServicioMain {

    ArrayList<Alojamiento> listaAlojamientos;
    Scanner leer;

    public ServicioMain() {
        this.listaAlojamientos = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearAlojamientos() {

        Hotel4e a = new Hotel4e("Mc Donanald 1", 20, "B", 30, 50, 2, "Holiday Inn 1", "Rio Ceballos 1", "Cordoba 1", "Candiani, Santiago 1");
        Hotel4e a1 = new Hotel4e("Mc Donanald 2", 40, "B", 30, 50, 2, "Holiday Inn 2", "Rio Ceballos 2", "Cordoba 2", "Candiani, Santiago 2");
        Hotel4e a2 = new Hotel4e("Mc Donanald 3", 100, "A", 30, 50, 2, "Holiday Inn 3", "Rio Ceballos 3", "Cordoba 3", "Candiani, Santiago 3");
        Hotel5e b = new Hotel5e(2, 10, 5, "Mc Donald 4", 20, "A", 150, 230, 5, "Holiday Inn 4", "Rio Ceballos 4", "Cordoba 4", "Santiago Candiani 4");
        Hotel5e b1 = new Hotel5e(3, 20, 50, "Mc Donald 5", 40, "B", 150, 230, 5, "Holiday Inn 5", "Rio Ceballos 5", "Cordoba 5", "Santiago Candiani 5");
        Hotel5e b2 = new Hotel5e(5, 50, 15, "Mc Donald 6", 100, "A", 150, 230, 5, "Holiday Inn 6", "Rio Ceballos 6", "Cordoba 6", "Santiago Candiani 6");
        Camping c = new Camping(10, 2, true, true, 5000f, "Sheep Camp 1", "Rio Ceballos 5", "Cordoba 5", "Candiani, Santiago 5");
        Camping c1 = new Camping(10, 2, false, false, 5000f, "Sheep Camp 2", "Rio Ceballos 6", "Cordoba 6", "Candiani, Santiago 6");
        Camping c2 = new Camping(10, 2, true, false, 5000f, "Sheep Camp 3", "Rio Ceballos 6a", "Cordoba 6a", "Candiani, Santiago 6a");
        Residencia d = new Residencia(15, true, true, true, 20000f, "Cocoon 1", "Rio Ceballos 7", "Cordoba 7", "Candiani, Santiago 7");
        Residencia d1 = new Residencia(15, false, false, false, 20000f, "Cocoon 2", "Rio Ceballos 8", "Cordoba 8", "Candiani, Santiago 8");
        Residencia d2 = new Residencia(15, false, false, false, 20000f, "Cocoon 2", "Rio Ceballos 8", "Cordoba 8", "Candiani, Santiago 8");

        listaAlojamientos.add(a);
        listaAlojamientos.add(a1);
        listaAlojamientos.add(a2);
        listaAlojamientos.add(b);
        listaAlojamientos.add(b1);
        listaAlojamientos.add(b2);
        listaAlojamientos.add(c);
        listaAlojamientos.add(c1);
        listaAlojamientos.add(c2);
        listaAlojamientos.add(d);
        listaAlojamientos.add(d1);
        listaAlojamientos.add(d2);

        actualizarPrecioFinal();
        //a1.setPrecioHabitacion(5000f);
        mezclarAlojamientos();
    }

    public void actualizarPrecioFinal() {
        for (Alojamiento aux : listaAlojamientos) {
            if (aux instanceof Hotel4e) {
                ((Hotel4e) aux).calcularPrecioHabitacion();

            } else if (aux instanceof Hotel5e) {
                ((Hotel5e) aux).calcularPrecioHabitacion();
            }
        }
    }

    public void mezclarAlojamientos() {
        Collections.shuffle(listaAlojamientos);
    }

    public void mostrarTodosAlojamientos() {
        System.out.println("* La lista completa de alojamientos desordenados es:");
        for (Alojamiento aux : listaAlojamientos) {
            if (aux instanceof Hotel) {
                System.out.println("- " + aux + " - Precio por noche: $" + ((Hotel) aux).getPrecioHabitacion());
            } else {
                System.out.println("- " + aux);
            }
        }
    }

    public void mostrarHotelesOrdenadosPrecio() {
        //creo una lista solo con los hoteles
        ArrayList<Hotel> listaHoteles = new ArrayList<>();
        for (Alojamiento aux : listaAlojamientos) {
            if (aux instanceof Hotel) {
                listaHoteles.add((Hotel) aux);
            }
        }
        //utilizo el método sort de la clase Collections para ordenar los hoteles por precio de habitación, 
        //utilizando un Comparator que se encarga de comparar los precios de los hoteles
        Collections.sort(listaHoteles, Comparator.comparing(Hotel::getPrecioHabitacion).reversed());

        //muestro la lista ordenada
        System.out.println("* Los Hoteles ordenados por precio quedan:");
        for (Hotel auxHotel : listaHoteles) {
            System.out.println(auxHotel + " - Precio por noche: $" + auxHotel.getPrecioHabitacion());
        }
    }

    public void mostarCampingRestaurant() {
        System.out.println("* Los camping con restaurante son:");
        for (Alojamiento aux : listaAlojamientos) {
            if (aux instanceof Camping && ((Camping) aux).getTieneRestaurante()) {
                System.out.println(aux);
            }
        }

    }

    public void mostarResindeciasDecuento() {
        System.out.println("* Las residencias con descuento son:");
        for (Alojamiento aux : listaAlojamientos) {
            if (aux instanceof Residencia && ((Residencia) aux).getTieneDescuento()) {
                System.out.println(aux);
            }
        }
    }

    public void menuConsulta() {

        System.out.println("--------SISTEMA DE CONSULTAS DE HOTELERIA--------");
        System.out.println("Elija una de las siguientes opciones de consulta:");
        System.out.println("1- Mostrar todos los alojamientos existentes (desordenados).");
        System.out.println("2- Mostrar solamente los Hoteles y ordenados segun precio(mayor a menor).");
        System.out.println("3- Mostrar solamente los Camping con Restaurantes.");
        System.out.println("4- Mostrar solamente las residencias con descuento.");
        switch (leer.nextInt()) {
            case 1:
                mostrarTodosAlojamientos();
                System.out.println("");
                menuConsulta();
                break;
            case 2:
                mostrarHotelesOrdenadosPrecio();
                System.out.println("");
                menuConsulta();
                break;
            case 3:
                mostarCampingRestaurant();
                System.out.println("");
                menuConsulta();
                break;
            case 4:
                mostarResindeciasDecuento();
                System.out.println("");
                menuConsulta();
                break;
            default:
                System.out.println("Opcion Incorrecta.");
                System.out.println("");
                menuConsulta();
                break;
        }
    }
}//class

