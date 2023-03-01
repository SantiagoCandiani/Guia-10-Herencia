/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package servicios;

import entidades.Alquiler;
import entidades.BarcoMotor;
import entidades.Velero;
import entidades.YateLujo;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * @author scandiani
 */
public class ServiciosAlquiler {

    Scanner leer;

    public ServiciosAlquiler() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void menuCrearBarco() {

        System.out.println("--------ELIJA QUE TIPO DE BARCO DESEA ALQUILAR--------");
        System.out.println("1. Velero.");
        System.out.println("2. Barco Motor.");
        System.out.println("3. Yate de Lujo.");
        System.out.println("");

        switch (leer.nextInt()) {
            case 1:
                Velero v1 = new Velero(3, 666, 10, 2020);
                Alquiler alq1 = new Alquiler("Santiago Candiani", 29969096, LocalDate.now(), LocalDate.parse("2023-02-25"), "5A", v1);
                System.out.println("El valor del velero a alquilar es: " + calcularAlquiler(alq1) + " USD.");
                System.out.println(alq1);
                System.out.println("");
                break;
            case 2:
                BarcoMotor bm1 = new BarcoMotor(200, 12345, 30, 1999);
                Alquiler alq2 = new Alquiler("Santiago Candiani", 29969096, LocalDate.now(), LocalDate.parse("2023-02-25"), "5A", bm1);
                System.out.println("El valor del Barco Motor a alquilar es: " + calcularAlquiler(alq2) + " USD.");
                System.out.println(alq2);
                System.out.println("");
                break;
            case 3:
                YateLujo y1 = new YateLujo(5, 150, 98765, 60, 2023);
                Alquiler alq3 = new Alquiler("Santiago Candiani", 29969096, LocalDate.now(), LocalDate.parse("2023-02-25"), "5A", y1);
                System.out.println("El valor del Yate de Lujo a alquilar es: " + calcularAlquiler(alq3) + " USD.");
                System.out.println(alq3);
                System.out.println("");
                break;
            default:
                System.out.println("Opcion Incorrecta.");
                menuCrearBarco();
                break;
        }

    }

    public long calcularAlquiler(Alquiler alquiler) {
        System.out.println("El intervalo de tiempo a alquilar es de: " + (ChronoUnit.DAYS.between(alquiler.getFechaAlquiler(), alquiler.getFechaDevolucion())) + " días.");

        return alquiler.getBarco().calcularModulo() * (ChronoUnit.DAYS.between(alquiler.getFechaAlquiler(), alquiler.getFechaDevolucion()));
    }

}//class
