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
public class BarcoMotor extends Barco {

    protected Integer potencia;

    public BarcoMotor(Integer potencia, Integer matricula, Integer metrosEslora, Integer anioFabricacion) {
        super(matricula, metrosEslora, anioFabricacion);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public Integer calcularModulo() {
        return super.calcularModulo() + potencia;
    }

    @Override
    public String toString() {
        return "BarcoMotor= " + "Potencia: " + potencia + '.';
    }

}//class
