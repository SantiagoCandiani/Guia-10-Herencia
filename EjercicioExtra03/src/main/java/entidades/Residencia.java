package entidades;

/**
 * @author scandiani
 */
public class Residencia extends ExtraHotelero {

    private Integer cantHabitaciones;
    private Boolean tieneDescuento;
    private Boolean tieneCampoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer cantHabitaciones, Boolean tieneDescuento, Boolean tieneCampoDeportivo, Boolean privado, Float metrosOcupa, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosOcupa, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.tieneDescuento = tieneDescuento;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    //El unico SET y GET que me hace falta
    public Boolean getTieneDescuento() {
        return tieneDescuento;
    }

    public void setTieneDescuento(Boolean tieneDescuento) {
        this.tieneDescuento = tieneDescuento;
    }

    @Override
    public String toString() {
        return "Residencia " + nombreAlojamiento + "= Cant. de Habitaciones: " + cantHabitaciones + ", Tiene Descuento: " + tieneDescuento + ", Tiene Campo Deportivo: " + tieneCampoDeportivo + '.';
    }

}//class
