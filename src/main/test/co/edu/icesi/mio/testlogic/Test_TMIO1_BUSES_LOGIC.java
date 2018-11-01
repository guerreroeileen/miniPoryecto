package co.edu.icesi.mio.testlogic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.edu.icesi.mio.exceptions.LogicException;
import co.edu.icesi.mio.logic.ITMIO1_BUSES_LOGIC;
import co.edu.icesi.mio.model.Tmio1Bus;
import co.edu.icesi.mio.model.Tmio1Servicio;
import co.edu.icesi.mio.model.Tmio1ServiciosSitio;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")

public class Test_TMIO1_BUSES_LOGIC {
	
	@Autowired
	private ITMIO1_BUSES_LOGIC buses_logica;
	
	
	
	@Test
	public void testAgregadoCorrecto () {
		Tmio1Bus bus = new Tmio1Bus();
		bus.setPlaca("SDF457");
		bus.setCapacidad(new BigDecimal(1000));
		bus.setMarca("Renault");
		bus.setModelo(new BigDecimal(2015));
		bus.setTipo("T");
		bus.setTmio1Servicios(new ArrayList<Tmio1Servicio>());
		bus.setTmio1ServiciosSitios(new ArrayList<Tmio1ServiciosSitio>());
		try {
			buses_logica.save(bus);
			fail("se agrego");
		} catch (LogicException e) {
			assertEquals("error",e.getMessage());
		}
	}
	
	@Test
	public void testPlacaMayor6Elementos() throws LogicException {
		Tmio1Bus bus = new Tmio1Bus();
		bus.setPlaca("SDF 4578");
		bus.setCapacidad(new BigDecimal(1000));
		bus.setMarca("Renault");
		bus.setModelo(new BigDecimal(2015));
		bus.setTipo("T");
		bus.setTmio1Servicios(new ArrayList<Tmio1Servicio>());
		bus.setTmio1ServiciosSitios(new ArrayList<Tmio1ServiciosSitio>());
		
		try {
			buses_logica.save(bus);
			fail("se agrego");
		} catch (LogicException e) {
			assertEquals("error",e.getMessage());
		}
		
				
	}
	
	
	@Test
	public void testMarcaNull () {
		Tmio1Bus bus = new Tmio1Bus();
		bus.setPlaca("SDF578");
		bus.setCapacidad(new BigDecimal(1000));
		bus.setModelo(new BigDecimal(2015));
		bus.setTipo("T");
		bus.setTmio1Servicios(new ArrayList<Tmio1Servicio>());
		bus.setTmio1ServiciosSitios(new ArrayList<Tmio1ServiciosSitio>());
		
		try {
			buses_logica.save(bus);
			fail("se agrego");
		} catch (LogicException e) {
			assertEquals("error",e.getMessage());
		}
	}
	
	
	

}
