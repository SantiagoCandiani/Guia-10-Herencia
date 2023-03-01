package entidades;

/**
 * @author scandiani
 */
public abstract class Empleado extends Persona {

    protected String anioIncorporacion;
    protected Integer nroDespacho;

    public Empleado() {
    }

    public Empleado(String anioIncorporacion, Integer nroDespacho, String nombre, String apellido, Integer documento, String estadoCivil) {
        super(nombre, apellido, documento, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.nroDespacho = nroDespacho;
    }

    public String getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(String anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public Integer getNroDespacho() {
        return nroDespacho;
    }

    public void setNroDespacho(Integer nroDespacho) {
        this.nroDespacho = nroDespacho;
    }

    //Metodos
    public void reasignarDespacho(Integer nroDespacho) {
        this.nroDespacho = nroDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "Año de Incorporacion: " + anioIncorporacion + ", Nro de Despacho: " + nroDespacho + ".\n";
    }
    
    

}//class
