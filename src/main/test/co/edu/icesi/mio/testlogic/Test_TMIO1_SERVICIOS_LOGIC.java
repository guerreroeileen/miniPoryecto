package co.edu.icesi.mio.testlogic;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.edu.icesi.mio.logic.ITMIO1_SERVICIOS_LOGIC;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class Test_TMIO1_SERVICIOS_LOGIC {

	@Autowired
	private ITMIO1_SERVICIOS_LOGIC servicios_logic;

}
