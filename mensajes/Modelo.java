package mvc;

import java.util.*;
public class Modelo {
    
	// Modelar los datos
    private String mensaje = "Bienvenido a mvc";
    private String clima = "Soleado";
    // Estructuras de datos para gestionar los oyentes del modelo
    private ArrayList<Vista> oyentes = new ArrayList<Vista>(10);
    
    public Modelo() {
        System.out.println("Modelo : Modelo()");
    }
    
    // Métodos para consulta del estado
    public String getMensaje() {
        System.out.println("Modelo: getMensaje() ");
        return mensaje;
    }
    public String getClima() {
        System.out.println("Modelo: getClima() ");
        return clima;
    }
    
    // Métodos para el cambio de estado
    public void setMensaje(String mensaje) {
        System.out.println("Modelo: setMensaje() ");
        this.mensaje = mensaje;
        disparaEventoDeCambioEnElModelo(mensaje);
    }
    
    public void setClima(String clima) {
        System.out.println("Modelo: setClima() ");
        this.clima = clima;
        disparaEventoDeCambioEnElModelo(clima);
    }
    
    // Método para registrar los oyentes
    public void agregrarOyenteDeCambiosEnElModelo(Vista vista) {
        System.out.println("Modelo: agregrarOyenteDeCambiosEnElModelo(vista) ");
        oyentes.add(vista);
    }
    
    private void disparaEventoDeCambioEnElModelo(Object o) {
        for (Vista v: oyentes) {
            System.out.println("Modelo: disparaEventoDeCambioEnElModelo() - Ciclo for para informar a los oyentes");
            v.procesarCambioEnElModelo(o);
        }
    }
}
