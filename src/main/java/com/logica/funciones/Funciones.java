package com.logica.funciones;

import java.util.Random;

import com.logica.inteface.confirmacionCallback;
import com.logica.inteface.entregadoCallback;
import com.logica.inteface.listoCallback;

public class Funciones {

    Random random = new Random();
    int tiempoAleatorio = random.nextInt(10)+1;

    public static void ordenProcesada(String platillo, confirmacionCallback callback, listoCallback callback2, entregadoCallback callback3 ){
        confirmacionPedido(platillo, callback);
        pedidoListo(platillo, callback2);
        pedidoEntregado(platillo, callback3);
    }

    public static void confirmacionPedido(String platillo, confirmacionCallback callback){
        String mensaje = "Tu pedido: " + platillo + " ha sido confirmado";
        try {
            Random random = new Random();            
            int tiempoAleatorio = random.nextInt(10)+1;
            System.out.println("Tiempo estimado: " + tiempoAleatorio * 1000);
            Thread.sleep(tiempoAleatorio * 1000);
            System.out.println("Confirmando");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        callback.onConfirmacion(mensaje);
    }

    public static void pedidoListo(String platillo, listoCallback callback){
        String mensaje = "Tu pedido: " + platillo + " esta listo";
        try {
            Random random = new Random();
            int tiempoAleatorio = random.nextInt(10)+1;
            System.out.println("Tiempo estimado: " + tiempoAleatorio * 1000);
            Thread.sleep(tiempoAleatorio * 1000);
            System.out.println("Preparando");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        callback.onListo(mensaje);
    }

    public static void pedidoEntregado(String platillo, entregadoCallback callback){
        String mensaje = "Tu pedido: " + platillo + " ha sido entregado";
        try {
            Random random = new Random();
            int tiempoAleatorio = random.nextInt(10)+1;
            System.out.println("Tiempo estimado: " + tiempoAleatorio * 1000);
            Thread.sleep(tiempoAleatorio * 1000);
            System.out.println("Entregando");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        callback.onEntregado(mensaje);
    }

}
