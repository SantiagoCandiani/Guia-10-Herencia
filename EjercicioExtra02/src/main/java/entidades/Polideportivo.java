package entidades;

/**
 * @author scandiani
 */
public final class Polideportivo extends Edificio {

    private String nombre;
    private String tipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoInstalacion) {
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public Polideportivo(String nombre, String tipoInstalacion, Integer alto, Integer ancho, Integer largo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public int calcularSuperficie() {
        return alto * ancho;
    }

    @Override
    public int calcularVolumen() {
        return calcularSuperficie() * alto;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipoInstalacion=" + tipoInstalacion + '}';
    }

}//class
