package co.edu.icesi.mio.logic;

import java.math.BigDecimal;
import java.util.List;

import co.edu.icesi.mio.dao.ITmio1_Rutas_DAO;
import co.edu.icesi.mio.exceptions.LogicException;
import co.edu.icesi.mio.model.Tmio1Ruta;

public class TMIO1_RUTAS_LOGIC implements ITMIO1_RUTAS_LOGIC{

	private ITmio1_Rutas_DAO dao_rutas;

	@Override
	public void save(Tmio1Ruta entity) throws LogicException {
		if (entity!=null) {
			
		}else {
			throw new LogicException();
		}
		
	}

	@Override
	public void update(Tmio1Ruta entity) throws LogicException {
		if (entity!=null) {
			
		}else {
			throw new LogicException();
		}
		
	}

	@Override
	public void delete(Tmio1Ruta entity) throws LogicException {
		if (entity!=null) {
			
		}else {
			throw new LogicException();
		}
		
	}

	@Override
	public List<Tmio1Ruta> findByRangeOfDays(BigDecimal diaInicio, BigDecimal diaFin) throws LogicException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
