package com.logica.main;
import com.logica.funciones.*;
import com.logica.inteface.SaludoCallback;
import com.logica.inteface.confirmacionCallback;
import com.logica.inteface.entregadoCallback;
import com.logica.inteface.listoCallback;
import com.logica.clases.*;

/*
 * EJERCICIO:
 * Explora el concepto de callback en tu lenguaje creando un ejemplo
 * simple (a tu elección) que muestre su funcionamiento.
 */


public final class main {
    public static void main(String[] args) {

        EjecutarSaludo saludo = new EjecutarSaludo();
        saludo.Saludo("Daniel", new SaludoCallback() {
            @Override
            public void onSaludoCompletado(String mensaje) {
                System.out.println("Callback recibido: " + mensaje);
            }
        }
        );

        System.out.println();
        System.out.println("************************** EXTRA ******************");
        System.out.println();

        /* Crea un simulador de pedidos de un restaurante utilizando callbacks.
        * Estará formado por una función que procesa pedidos.
        * Debe aceptar el nombre del plato, una callback de confirmación, una
        * de listo y otra de entrega.
        * - Debe imprimir un confirmación cuando empiece el procesamiento.
        * - Debe simular un tiempo aleatorio entre 1 a 10 segundos entre
        *   procesos.
        * - Debe invocar a cada callback siguiendo un orden de procesado.
        * - Debe notificar que el plato está listo o ha sido entregado.
        */

        // Funciones.ordenProcesada("Pollo", new confirmacionCallback() {
        //     @Override
        //     public void onConfirmacion(String mensaje){
        //         System.out.println(mensaje);
        //     }            
        // }, new listoCallback() {
        //   @Override
        //   public void onListo(String mensaje){
        //     System.out.println(mensaje);
        //   }  
        // }, new entregadoCallback() {
        //     @Override
        //     public void onEntregado(String mensaje){
        //         System.out.println(mensaje);
        //     }
        // });
         /*  *******Con expresiones lambda****
         mensaje -> System.out.println(mensaje), 
         mensaje -> System.out.println(mensaje), 
         mensaje -> System.out.println(mensaje));*/
       
    }
}
