package co.edu.icesi.mio.logic;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import co.edu.icesi.mio.dao.ITmio1_Servicios_DAO;
import co.edu.icesi.mio.exceptions.LogicException;
import co.edu.icesi.mio.model.Tmio1Servicio;
import co.edu.icesi.mio.model.Tmio1ServicioPK;

public class TMIO1_SERVICIOS_LOGIC implements ITMIO1_SERVICIOS_LOGIC{

	private ITmio1_Servicios_DAO dao_servicios;
	
	
	@Override
	@Transactional(rollbackFor = LogicException.class)
	public void save(Tmio1Servicio servicio) throws LogicException{
		if (servicio!=null) {
			
			
			
			
			
			
			
			dao_servicios.save(servicio);
		}else {
			throw new LogicException();
		}
		
	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public void update(Tmio1Servicio servicio)throws LogicException {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public void delete(Tmio1Servicio servicio) throws LogicException{
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public List<Tmio1Servicio> findAll() throws LogicException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public Tmio1Servicio findById(Tmio1ServicioPK id) throws LogicException{
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
