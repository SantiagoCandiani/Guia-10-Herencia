/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
 */
package entidades;

/**
 * @author scandiani
 */
public class Velero extends Barco {

    protected Integer nroMastiles;

    public Velero() {
    }

    public Velero(Integer nroMastiles, Integer matricula, Integer metrosEslora, Integer anioFabricacion) {
        super(matricula, metrosEslora, anioFabricacion);
        this.nroMastiles = nroMastiles;
    }

    public Integer getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(Integer nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public Integer calcularModulo() {
        return super.calcularModulo() + nroMastiles;
    }

    @Override
    public String toString() {
        return "Velero= " + "Nro de Mastiles: " + nroMastiles + '.';
    }

}//class
