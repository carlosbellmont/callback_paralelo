package com.cbellmont;

public class Main {


    public static void main(String[] args) {
        // Vamos a crear 100 hilos.
        // Cuando se inicie, cada hilo generará número aleatorio comprendido entre entre 1000 y el 8000 y dormirá por ese periodo
        // Cuando termine, notificará que ha terminado la primera escala y volverá a repetir el proceso de
        // generar un número aleatorio y dormir por ese periodo.
        // Cuando el proceso principal haya recibido la confirmación de que todos los hijos han acabado, entonces mostrará
        // una estadística de sobre que hilo ha terminado primero y el tiempo que ha tardado.
        // Este proceso se repetirá 5 veces.
        // Debe hacerse desde una clase que no sea estática (no vale main)


        // Resultado esperado:
        // ITERACION 1:
        // El Hilo 1 ha dormido por XXXXXXXX milisengundos.
        // El Hilo 3 ha dormido por XXXXXXXX milisengundos.
        // El Hilo 2 ha dormido por XXXXXXXX milisengundos.

        // ITERACION 2:
        // El Hilo 3 ha dormido por XXXXXXXX milisengundos.
        // El Hilo 1 ha dormido por XXXXXXXX milisengundos.
        // El Hilo 2 ha dormido por XXXXXXXX milisengundos.

        // Atencion: los hilos no tienen porque que aparece ordenados por nombre ni por tiempo

        new ClasePrincipal();

    }
}
