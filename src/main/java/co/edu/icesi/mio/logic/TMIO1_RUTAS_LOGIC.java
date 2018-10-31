package co.edu.icesi.mio.logic;

import static org.hamcrest.CoreMatchers.endsWith;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import co.edu.icesi.mio.dao.ITmio1_Rutas_DAO;
import co.edu.icesi.mio.exceptions.LogicException;
import co.edu.icesi.mio.model.Tmio1Ruta;

public class TMIO1_RUTAS_LOGIC implements ITMIO1_RUTAS_LOGIC{

	private ITmio1_Rutas_DAO dao_rutas;

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public void save(Tmio1Ruta entity) throws LogicException {
		if (entity!=null) {
			if (entity.getId()!=null) {
				
			}else {
				throw new LogicException();
			}
			
		}else {
			throw new LogicException();
		}
		
		if (entity.getNumero()==null || entity.getNumero().length()!=3) {
			throw new LogicException();
		}
		if (entity.getDescripcion()==null || entity.getDescripcion().length()>30){
			throw new LogicException();
		}
		if (entity.getDiaInicio()==null || entity.getDiaFin()==null) {
			throw new LogicException();
		}
		if (entity.getHoraFin()==null || entity.getHoraInicio()==null) {
			throw new LogicException();
		}
		dao_rutas.save(entity);
	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public void update(Tmio1Ruta entity) throws LogicException {
		if (entity!=null) {
			if (entity.getId()!=null) {
				
			}else {
				throw new LogicException();
			}
			
		}else {
			throw new LogicException();
		}
		
		if (entity.getNumero()==null || entity.getNumero().length()!=3) {
			throw new LogicException();
		}
		if (entity.getDescripcion()==null || entity.getDescripcion().length()>30){
			throw new LogicException();
		}
		if (entity.getDiaInicio()==null || entity.getDiaFin()==null) {
			throw new LogicException();
		}
		if (entity.getHoraFin()==null || entity.getHoraInicio()==null) {
			throw new LogicException();
		}
		dao_rutas.update(entity);
		
	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public void delete(Tmio1Ruta entity) throws LogicException {
		if (entity!=null) {
			dao_rutas.delete(entity);
		}else {
			throw new LogicException();
		}
		
	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public List<Tmio1Ruta> findByRangeOfDays(BigDecimal diaInicio, BigDecimal diaFin) throws LogicException {
		if (dao_rutas.findByRangeOfDays(diaInicio, diaFin)==null) {
			throw new LogicException();
		}
		return dao_rutas.findByRangeOfDays(diaInicio, diaFin);
	}
	
	
	
}
