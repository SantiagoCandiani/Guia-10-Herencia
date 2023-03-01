package entidades;

/**
 * @author scandiani
 */
public class Hotel4e extends Hotel {

    protected String nommbreRestaurant;
    protected Integer capacidadRestaurant;
    protected String tipoGimnasio;

    public Hotel4e() {
    }

    public Hotel4e(String nommbreRestaurant, Integer capacidadRestaurant, String tipoGimnasio, Integer cantHabitaciones, Integer cantCamas, Integer cantPisos, String nombreAlojamiento, String direccionAlojamiento, String localidadAlojamiento, String nombreGerente) {
        super(cantHabitaciones, cantCamas, cantPisos, nombreAlojamiento, direccionAlojamiento, localidadAlojamiento, nombreGerente);
        this.nommbreRestaurant = nommbreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
        this.tipoGimnasio = tipoGimnasio;
    }

    //MÉTODOS
    @Override
    public Float calcularPrecioHabitacion() {
        float valorRestaurante = 0;
        float valorGimnasio = 0;

        if (capacidadRestaurant < 30) {
            valorRestaurante = 10;
        } else if (capacidadRestaurant >= 30 && capacidadRestaurant <= 50) {
            valorRestaurante = 30;
        } else if (capacidadRestaurant > 50) {
            valorRestaurante = 50;
        }

        if (tipoGimnasio.equalsIgnoreCase("A")) {
            valorGimnasio = 50;
        } else if (tipoGimnasio.equalsIgnoreCase("B")) {
            valorGimnasio = 30;
        }

        return precioHabitacion = (super.calcularPrecioHabitacion() + valorRestaurante + valorGimnasio);

    }

    @Override
    public String toString() {
        return "Hotel 4 Estrellas " + nombreAlojamiento + "= Restaurant: " + nommbreRestaurant + ", Capacidad del Restaurante: " + capacidadRestaurant + ", Tipo de Gimnasio: " + tipoGimnasio + '.';
    }

}//class
