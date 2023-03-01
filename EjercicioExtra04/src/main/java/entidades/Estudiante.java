package entidades;

import java.util.ArrayList;

/**
 * @author scandiani
 */
public class Estudiante extends Persona {

    private ArrayList<String> listaCursos;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, Integer documento, String estadoCivil) {
        super(nombre, apellido, documento, estadoCivil);
        listaCursos = new ArrayList();
    }

    public ArrayList<String> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList<String> listaCursos) {
        this.listaCursos = listaCursos;
    }

    //Metodos
    public void matricularse(String curso) {
        listaCursos.add(curso);
    }

    public void cancelarMatricula(String curso) {
        listaCursos.remove(curso);
    }

    @Override
    public String toString() {
        return "Estudiante: " + super.toString() + "Cursos Actuales: " + listaCursos + '.';
    }

}//class
