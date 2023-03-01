package entidades;

/**
 * @author scandiani
 */
public abstract class Hotel extends Alojamiento {

    protected Integer cantHabitaciones;
    protected Integer cantCamas;
    protected Integer cantPisos;
    protected Float precioHabitacion;

    public Hotel() {
    }

    public Hotel(Integer cantHabitaciones, Integer cantCamas, Integer cantPisos, String nombreAlojamiento, String direccionAlojamiento, String localidadAlojamiento, String nombreGerente) {
        super(nombreAlojamiento, direccionAlojamiento, localidadAlojamiento, nombreGerente);
        this.cantHabitaciones = cantHabitaciones;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
    }

    //El unico SET y GET que me hace falta
    public Float getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Float precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    //MÉTODOS
    public Float calcularPrecioHabitacion() {
        return precioHabitacion = (50f + cantCamas);
    }
//    public Float calcularPrecioHabitacion() {
//        float auxPrecioHabitacion = (50f + cantCamas);
//        return auxPrecioHabitacion;
//    }
//
//    public void setPrecioHabitacion() {
//        this.precioHabitacion = calcularPrecioHabitacion();
//    }

    @Override
    public String toString() {
        return "Hotel " + nombreAlojamiento + "= Cant. de Habitaciones: " + cantHabitaciones + ", Nro. de Camas: " + cantCamas + ", Cant. de Pisos: " + cantPisos + ", Precio: $" + precioHabitacion + ".";
    }

}//class
