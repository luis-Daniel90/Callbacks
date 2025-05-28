package com.logica.clases;
import com.logica.inteface.*;


public class EjecutarSaludo {

    public void Saludo(String nombre, SaludoCallback callback){
        System.out.println("Ejecutando proceso de saludo");
        String mensaje = "Hola " + nombre;
        callback.onSaludoCompletado(mensaje);
    }

}
