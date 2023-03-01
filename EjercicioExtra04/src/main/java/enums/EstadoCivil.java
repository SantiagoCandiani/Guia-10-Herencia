package enums;

/**
 *
 * @author scand
 */
public enum EstadoCivil {

    SOLTERO("Soltero"), CASADO ("Casado"), VIUDO ("Viudo"), DIVORCIADO ("Divorciado");

    private String estadoCivil;

    private EstadoCivil() {
    }

    private EstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

}
