package co.edu.icesi.mio.logic;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import co.edu.icesi.mio.dao.ITmio1_Buses_DAO;
import co.edu.icesi.mio.exceptions.LogicException;
import co.edu.icesi.mio.model.Tmio1Bus;

public class TMIO1_BUSES_LOGIC implements ITMIO1_BUSES_LOGIC{
	
	private ITmio1_Buses_DAO dao_buses;

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public void save(Tmio1Bus entity) throws LogicException {
		if (entity!=null) {
			if (entity.getId()==null) {
				throw new LogicException();
			}
			
			if (entity.getPlaca()==null || entity.getPlaca().length()>8) {
				throw new LogicException();
			}
			if (entity.getMarca().length()>20) {
				throw new LogicException();
			}
			if (entity.getModelo()==null) {
				throw new LogicException();
			}
			
			
			dao_buses.save(entity);
		}else {
			throw new LogicException();
		}
		
		
	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public void update(Tmio1Bus entity) throws LogicException {
		if (entity!=null) {
			if (entity.getId()==null) {
				throw new LogicException();
			}
			
			if (entity.getPlaca()==null || entity.getPlaca().length()>8) {
				throw new LogicException();
			}
			if (entity.getMarca().length()>20) {
				throw new LogicException();
			}
			if (entity.getModelo()==null) {
				throw new LogicException();
			}
			
			
			dao_buses.save(entity);
		}else {
			throw new LogicException();
		}
		
	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public void delete(Tmio1Bus entity) throws LogicException {
		if (entity!=null) {
			dao_buses.delete(entity);
		}else {
			throw new LogicException();
		}
		
	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public List<Tmio1Bus> findByModel(BigDecimal model) throws LogicException {
		List<Tmio1Bus> retorno = null;
		if (dao_buses!=null) {
			retorno = dao_buses.findByModel(model);
		}else {
			throw new LogicException();
		}
		return retorno;
	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public List<Tmio1Bus> findByType(String type) throws LogicException {
		List<Tmio1Bus> retorno = null;
		if (dao_buses!=null) {
			retorno = dao_buses.findByType(type);
		}else {
			throw new LogicException();
		}
		return retorno;
	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public List<Tmio1Bus> findByCapacity(BigDecimal capacity) throws LogicException {
		List<Tmio1Bus> retorno = null;
		if (dao_buses!=null) {
			retorno = dao_buses.findByCapacity(capacity);
		}else {
			throw new LogicException();
		}
		return retorno;
	}

}
