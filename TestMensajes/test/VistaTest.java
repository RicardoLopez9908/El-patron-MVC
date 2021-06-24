package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import soporte.SoporteParaProbarLaVista;
import mvc.Controlador;
import mvc.Modelo;
import mvc.Vista;

//Esto es un JUnit case
public class VistaTest {

	Modelo m;
	Vista v ;
	
	
	@Before
	public void setUp() throws Exception {
		m = new Modelo();
		v = new Vista(m);
	}

	@After
	public void tearDown() throws Exception {
		v = null;
	}

	@Test
	public void testVista() {
		Vista v = new Vista(m);
		assertTrue(v instanceof Vista);
	}

	@Test
	public void testProcesarCambioEnElModelo() {
		Vista vista = new SoporteParaProbarLaVista(m);
		m.agregrarOyenteDeCambiosEnElModelo(vista);
		Controlador con = new Controlador (m,vista);
		//Provocamos el cambio en el modelo y verificamos que se ejecute el llamado a procesarCambioEnElModelo
		con.procesarActualizarMensaje("Mensaje desde testProcesarCambioEnElModelo");
		boolean correcto = ((SoporteParaProbarLaVista)vista).getNotificacion();
		assertTrue(correcto);
	}

}