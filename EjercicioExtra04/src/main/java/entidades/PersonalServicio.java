package entidades;

/**
 * @author scandiani
 */
public class PersonalServicio extends Empleado {

    private String Seccion;

    public PersonalServicio(String Seccion, String anioIncorporacion, Integer nroDespacho, String nombre, String apellido, Integer documento, String estadoCivil) {
        super(anioIncorporacion, nroDespacho, nombre, apellido, documento, estadoCivil);
        this.Seccion = Seccion;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    //Metodos
    public void cambiarSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    @Override
    public String toString() {
        return "Personal de Servicio= " + super.toString() + "Seccion: " + Seccion + '.';
    }

}//class
