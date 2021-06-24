package soporte;

import mvc.Modelo;
import mvc.Vista;

public class SoporteParaProbarLaVista extends Vista {

	boolean bandera = false;
	
	public SoporteParaProbarLaVista(Modelo modelo) {
		super(modelo);
	}

	public void procesarCambioEnElModelo(Object evento) {
		bandera = true;
		super.procesarCambioEnElModelo(evento);
	}

	public void mostrarPantalla(String pantalla) {
		bandera = true;
	}	

	public boolean getNotificacion() {
		return bandera;
	}

}