package mvc;

public class Controlador {
	// Referencias con el modelo y la vista
    private Modelo modelo;
    private Vista vista;
    private static int nroDeControlador=0;
    private int idControlador;
    
    
    public Controlador(Modelo modelo, Vista vista) {
        idControlador = ++nroDeControlador;
        System.out.println("Controlador " + idControlador + ": Controlador(modelo, vista)");
        this.modelo = modelo;
        this.vista = vista;
        vista.agregarOyenteDeAccionDelUsuario(this);

    }
    
    // métodos para gestionar las acciones del usuario
    public void procesarObtenerMensaje() {
        System.out.println("Controlador " + idControlador +
                ": procesarObtenerMensaje() ");
        vista.mostrarPantalla("mensaje");
    }
    
    public void procesarObtenerClima() {
        System.out.println("Controlador " + idControlador +
                ": procesarObtenerClima() ");
        vista.mostrarPantalla("clima");
    }
    
    public void procesarActualizarMensaje(String mensaje) {
        System.out.println("Controlador " + idControlador +
                ": procesarActualizarMensaje() ");
        modelo.setMensaje(mensaje);
    }
    
    public void procesarActualizarClima(String clima) {
        System.out.println("Controlador " + idControlador +
                ": procesarActualizarClima() ");
        modelo.setClima(clima);
}
}
