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
public class ControladorTest {

	private Controlador c;
	private Modelo m ;

	@Before
	public void setUp() throws Exception {
		m = new Modelo();
		Vista v = new Vista(m);
		c = new Controlador(m, v);
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test
	public void testControlador() {
		m = new Modelo();
		Vista v = new Vista(m);
		c = new Controlador(m, v);
		assertTrue(c instanceof Controlador);
	}

	@Test
	public void testProcesarObtenerMensaje() {
		Vista v = new SoporteParaProbarLaVista(m);
		Controlador c = new Controlador(m, v);
		c.procesarObtenerMensaje();
		boolean correcto = ((SoporteParaProbarLaVista)v).getNotificacion();
		assertTrue(correcto);
	}

	@Test
	public void testProcesarObtenerClima() {
		Vista v = new SoporteParaProbarLaVista(m);
		Controlador c = new Controlador(m, v);
		c.procesarObtenerClima();
		boolean correcto = ((SoporteParaProbarLaVista)v).getNotificacion();
		assertTrue(correcto);
	}

	@Test
	public void testProcesarActualizarMensaje() {
		Vista v = new SoporteParaProbarLaVista(m);
		Controlador c = new Controlador(m, v);
		m.agregrarOyenteDeCambiosEnElModelo(v);
		c.procesarActualizarMensaje("Mensaje desde testProcesarActualizarMensaje");
		boolean correcto = ((SoporteParaProbarLaVista)v).getNotificacion();
		assertTrue(correcto);
	}

	@Test
	public void testProcesarActualizarClima() {
		Vista v = new SoporteParaProbarLaVista(m);
		Controlador c = new Controlador(m, v);
		m.agregrarOyenteDeCambiosEnElModelo(v);
		c.procesarActualizarClima("Mensaje desde testProcesarActualizarClima");
		boolean correcto = ((SoporteParaProbarLaVista)v).getNotificacion();
		assertTrue(correcto);
	}

}

