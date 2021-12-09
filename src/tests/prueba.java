package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.cupi2.almacen.mundo.Almacen;
import uniandes.cupi2.almacen.mundo.AlmacenException;
import uniandes.cupi2.almacen.mundo.Categoria;

class Prueba {
	
	private Almacen almacen;
	private Categoria categoria;
	
	@BeforeEach
	void configuracion() throws AlmacenException {
		almacen = new Almacen(new File("data/datos.txt"));
	}
	
	@AfterEach
	void reset() {
		almacen = null;
	}
	
	
	//primero probamos la carga de datos
	@Test
	void probarCargaArchivoNoExiste() throws AlmacenException {
		try {
			almacen = new Almacen(new File("data/archivo_inexistente.txt"));
			fail("Not yet implemented");
		} catch(Exception e) {
			
		}
	}

}
