/*
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 */
package servicios;

import entidades.Estudiante;
import entidades.Persona;
import entidades.PersonalServicio;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author scandiani
 */
public class ServiciosGestion {

    ArrayList<Persona> listaPersonas;
    Scanner leer;

    public ServiciosGestion() {
        this.listaPersonas = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearPersonas() {

        Estudiante e1 = new Estudiante("Santiago", "Candiani", 29969096, "Soltero");
        e1.matricularse("Matematica");
        Estudiante e2 = new Estudiante("Marcelo", "Bonadeo", 30303030, "Casado");
        e2.matricularse("Ciencias Sociales");
        Estudiante e3 = new Estudiante("Hugo", "Boss", 66666666, "Viudo");
        e3.matricularse("Fisica Cuantica");
        Profesor p1 = new Profesor("Antropologia", "2001", 11, "Profe1", "Jirafales1", 12345678, "Divorciado");
        Profesor p2 = new Profesor("Algebra", "1983", 01, "Profe2", "Jirafales2", 98765432, "Viudo");
        Profesor p3 = new Profesor("Analisis Matematico", "2023", 05, "Profe3", "Jirafales3", 36985214, "Casado");
        PersonalServicio ps1 = new PersonalServicio("Decanato", "2005", 01, "Willy1", "McDougal1", 1234, "Soltero");
        PersonalServicio ps2 = new PersonalServicio("Biblioteca", "2015", 01, "Willy2", "McDougal2", 12345, "Viudo");
        listaPersonas.add(e1);
        listaPersonas.add(e2);
        listaPersonas.add(e3);
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);
        listaPersonas.add(ps1);
        listaPersonas.add(ps2);
    }

    public void mostrarTodo() {
        System.out.println("****Lista de estudiantes y empleados:****");
        for (Persona aux : listaPersonas) {
            System.out.println("-" + aux);
            System.out.println("");
        }
    }

    public void menuGeneral() {
        System.out.println("-----------MENU DE GESTION FACULTAD-----------");
        System.out.println("Indique que tipo de persona desea gestionar:");
        System.out.println("1- Estudiante.");
        System.out.println("2- Profesor.");
        System.out.println("3- Personal de Servicios.");
        System.out.println("4- Ver toda la nomina que compone la universidad (Empleados+Estudiantes).");
        System.out.println("5- Salir del programa.");
        switch (leer.nextInt()) {
            case 1:
                leer.nextLine();
                System.out.println("Para empezar, elija un estudiante de la lista (segun apellido):");
                menuEstudiante(elegirEstudiante());
                System.out.println("");
                break;
            case 2:
                leer.nextLine();
                System.out.println("Para empezar, elija un Profesor de la lista (segun apellido):");
                menuProfesor(elegirProfesor());
                System.out.println("");
                break;
            case 3:
                leer.nextLine();
                System.out.println("Para empezar, elija un personal de servicios de la lista (segun apellido):");
                menuPersonalServicios(elegirPersonalServicio());
                System.out.println("");
                break;
            case 4:
                mostrarTodo();
                menuGeneral();
                break;
            case 5:
                System.out.println("Usted salio del programa con Exito. Hasta la proxima.");
                System.out.println("");
                break;
            default:
                System.out.println("Opcion Incorrecta. Vuelva a intentarlo");
                System.out.println("");
                menuGeneral();
                break;
        }
    }

    //////////////////////ESTUDIANTE//////////////////////
    public void menuEstudiante(Estudiante estudiante) {
        System.out.println("-----------MENU DE GESTION ESTUDIANTE-----------");
        System.out.println("Indique que desea hacer:");
        System.out.println("1- Matriculacion en nuevo curso.");
        System.out.println("2- Cancelacion de un curso.");
        System.out.println("3- Cambio de estado Civil.");
        System.out.println("4- Mostrar informacion.");
        System.out.println("5- Volver al menu principal");

        switch (leer.nextInt()) {
            case 1:
                System.out.println("Ingrese el curso que desea agregar:");
                estudiante.matricularse(leer.next());
                menuEstudiante(estudiante);
                break;
            case 2:
                System.out.println("Ingrese el curso que desea quitar:");
                estudiante.cancelarMatricula(leer.next());
                menuEstudiante(estudiante);
                break;
            case 3:
                System.out.println("Ingrese el nuevo estado civil:");
                estudiante.cambiarEstadoCivil(leer.next());
                menuEstudiante(estudiante);
                break;
            case 4:
                System.out.println(estudiante);
                menuEstudiante(estudiante);
                break;
            case 5:
                menuGeneral();
                break;
            default:
                System.out.println("Opcion Incorrecta. Vuelva a intentarlo.");
                System.out.println("");
                menuEstudiante(estudiante);
                break;
        }
    }

    public void mostrarEstudiantes() {
        for (Persona aux : listaPersonas) {
            if (aux instanceof Estudiante) {
                System.out.println("-" + aux);
                System.out.println("");
            }
        }
    }

    public Estudiante elegirEstudiante() {

        mostrarEstudiantes();
        String apellidoElegido;
        Estudiante estudianteEncontrado = null;
        boolean encontrado = false;

        while (!encontrado) {
            System.out.print("Ingrese un apellido: ");
            apellidoElegido = leer.nextLine();

            for (Persona aux : listaPersonas) {
                if (aux instanceof Estudiante && aux.getApellido().equalsIgnoreCase(apellidoElegido)) {
                    estudianteEncontrado = (Estudiante) aux;
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("El nombre de estudiante no se encuentra en la lista. Por favor, intente de nuevo.");
            }
        }
        return estudianteEncontrado;
    }

    //////////////////////PROFESOR//////////////////////
    public void menuProfesor(Profesor profesor) {
        System.out.println("-----------MENU DE GESTION PROFESOR-----------");
        System.out.println("Indique que desea hacer:");
        System.out.println("1- Reasignar despacho.");
        System.out.println("2- Cambio de departamento.");
        System.out.println("3- Cambio de estado Civil.");
        System.out.println("4- Mostrar informacion.");
        System.out.println("5- Volver al menu principal");

        switch (leer.nextInt()) {
            case 1:
                System.out.println("Ingrese el numero del nuevo despacho:");
                profesor.reasignarDespacho(leer.nextInt());
                menuProfesor(profesor);
                break;
            case 2:
                System.out.println("Ingrese el nuevo departamento:");
                profesor.cambiarDepartamento(leer.next());
                menuProfesor(profesor);
                break;
            case 3:
                System.out.println("Ingrese el nuevo estado civil:");
                profesor.cambiarEstadoCivil(leer.next());
                menuProfesor(profesor);
                break;
            case 4:
                System.out.println(profesor);
                menuProfesor(profesor);
                ;
                break;
            case 5:
                menuGeneral();
                break;
            default:
                System.out.println("Opcion Incorrecta. Vuelva a intentarlo.");
                System.out.println("");
                menuProfesor(profesor);
                break;
        }
    }

    public void mostrarProfesores() {
        for (Persona aux : listaPersonas) {
            if (aux instanceof Profesor) {
                System.out.println("-" + aux);
                System.out.println("");
            }
        }
    }

    public Profesor elegirProfesor() {

        mostrarProfesores();
        String apellidoElegido;
        Profesor profesorEncontrado = null;
        boolean encontrado = false;

        while (!encontrado) {
            System.out.print("Ingrese un apellido: ");
            apellidoElegido = leer.next();

            for (Persona aux : listaPersonas) {
                if (aux instanceof Profesor && aux.getApellido().equalsIgnoreCase(apellidoElegido)) {
                    profesorEncontrado = (Profesor) aux;
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("El nombre del profesor no se encuentra en la lista. Por favor, intente de nuevo.");
            }
        }
        return profesorEncontrado;
    }

    //////////////////////PERSONAL DE SERVICIOS//////////////////////
    public void menuPersonalServicios(PersonalServicio auxiliar) {
        System.out.println("-----------MENU DE GESTION PERSONAL DE SERVICIOS-----------");
        System.out.println("Indique que desea hacer:");
        System.out.println("1- Reasignar despacho.");
        System.out.println("2- Traslado de seccion.");
        System.out.println("3- Cambio de estado Civil.");
        System.out.println("4- Mostrar informacion.");
        System.out.println("5- Volver al menu principal");

        switch (leer.nextInt()) {
            case 1:
                System.out.println("Ingrese el numero del nuevo despacho:");
                auxiliar.reasignarDespacho(leer.nextInt());
                menuPersonalServicios(auxiliar);
                break;
            case 2:
                System.out.println("Ingrese la nueva seccion de servicios:");
                auxiliar.cambiarSeccion(leer.next());
                menuPersonalServicios(auxiliar);
                break;
            case 3:
                System.out.println("Ingrese el nuevo estado civil:");
                auxiliar.cambiarEstadoCivil(leer.next());
                menuPersonalServicios(auxiliar);
                break;
            case 4:
                System.out.println(auxiliar);
                menuPersonalServicios(auxiliar);
                ;
                break;
            case 5:
                menuGeneral();
                break;
            default:
                System.out.println("Opcion Incorrecta. Vuelva a intentarlo.");
                System.out.println("");
                menuPersonalServicios(auxiliar);
                break;
        }
    }

    public void mostrarPersonalServicio() {
        for (Persona aux : listaPersonas) {
            if (aux instanceof PersonalServicio) {
                System.out.println("-" + aux);
                System.out.println("");
            }
        }
    }

    public PersonalServicio elegirPersonalServicio() {

        mostrarPersonalServicio();
        String apellidoElegido;
        PersonalServicio personalServicioEncontrado = null;
        boolean encontrado = false;

        while (!encontrado) {
            System.out.print("Ingrese un apellido: ");
            apellidoElegido = leer.next();

            for (Persona aux : listaPersonas) {
                if (aux instanceof PersonalServicio && aux.getApellido().equalsIgnoreCase(apellidoElegido)) {
                    personalServicioEncontrado = (PersonalServicio) aux;
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("El nombre del profesor no se encuentra en la lista. Por favor, intente de nuevo.");
            }
        }
        return personalServicioEncontrado;
    }

}//class
