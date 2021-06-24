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
public class ModeloTest {

	private Modelo m;

	@Before
	public void setUp() throws Exception {
		m = new Modelo();
	}

	@After
	public void tearDown() throws Exception {
		m = null;
	}

	@Test
	public void testModelo() {
		Modelo modelo = new Modelo();
		assertTrue(modelo instanceof Modelo);
	}

	@Test
	public void testGetMensaje() {
		String resultadoEsperado = "Bienvenido a mvc";
		String resultadoObtenido = m.getMensaje();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void testGetClima() {
		String resultadoEsperado = "Soleado";
		String resultadoObtenido = m.getClima();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void testSetMensaje() {
		String resultado = "Nuevo mensaje aleatorio";
		m.setMensaje(resultado);
		String resultadoObtenido = m.getMensaje();
		assertEquals(resultado, resultadoObtenido);
	}

	@Test
	public void testSetClima() {
		String resultado = "Nuevo clima aleatorio";
		m.setClima(resultado);
		String resultadoObtenido = m.getClima();
		assertEquals(resultado, resultadoObtenido);
	}

	@Test
	public void testAgregrarOyenteDeCambiosEnElModelo() {
		Vista vista = new SoporteParaProbarLaVista(m);
		m.agregrarOyenteDeCambiosEnElModelo(vista);
		Controlador con = new Controlador(m, vista);
		con.procesarActualizarMensaje("Mensaje desde TestOyenteDeCambiosEnElModelo");
		boolean correcto = ((SoporteParaProbarLaVista)vista).getNotificacion();	
		assertTrue(correcto);
	}

}
