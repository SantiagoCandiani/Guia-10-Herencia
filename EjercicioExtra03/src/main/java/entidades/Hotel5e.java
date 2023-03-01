package entidades;

/**
 * @author scandiani
 */
public final class Hotel5e extends Hotel4e {

    private Integer cantSalones;
    private Integer cantSuites;
    private Integer cantLimusinas;

    public Hotel5e() {
    }

    public Hotel5e(Integer cantSalones, Integer cantSuites, Integer cantLimusinas, String nommbreRestaurant, Integer capacidadRestaurant, String tipoGimnasio, Integer cantHabitaciones, Integer cantCamas, Integer cantPisos, String nombreAlojamiento, String direccionAlojamiento, String localidadAlojamiento, String nombreGerente) {
        super(nommbreRestaurant, capacidadRestaurant, tipoGimnasio, cantHabitaciones, cantCamas, cantPisos, nombreAlojamiento, direccionAlojamiento, localidadAlojamiento, nombreGerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimusinas = cantLimusinas;
    }

    //MÉTODOS
    @Override
    public Float calcularPrecioHabitacion() {
        return precioHabitacion = (super.calcularPrecioHabitacion() + (15 * cantLimusinas));
    }

    @Override
    public String toString() {
        return "Hotel 5 Estrellas " + nombreAlojamiento + "= Cant. de Salones: " + cantSalones + ", Cant. de Suites: " + cantSuites + ", Cant. de Limusinas: " + cantLimusinas + '.';
    }

}//class
