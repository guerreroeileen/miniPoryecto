package co.edu.icesi.mio.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.edu.icesi.mio.dao.ITmio1_Conductores_DAO;
import co.edu.icesi.mio.exceptions.LogicException;
import co.edu.icesi.mio.model.Tmio1Conductore;

public class TMIO1_CONDUCTORES_LOGIC implements ITMIO1_CONDUCTORES_LOGIC {

	@Autowired
	private ITmio1_Conductores_DAO dao_conductores;

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public void save(Tmio1Conductore entity) throws LogicException {
		if (entity != null) {
			dao_conductores.save(entity);
		}
	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public void update(Tmio1Conductore entity) throws LogicException {
		dao_conductores.update(entity);

	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public void delete(Tmio1Conductore entity) throws LogicException {
		dao_conductores.delete(entity);

	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public List<Tmio1Conductore> findByName(String name) throws LogicException {
		dao_conductores.findByName(name);
		return null;
	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public List<Tmio1Conductore> findByLastName(String lastname) throws LogicException {
		dao_conductores.findByLastName(lastname);
		return null;
	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public Tmio1Conductore findByCedula(String cedula) throws LogicException {
		dao_conductores.findByCedula(cedula);
		return null;
	}

}
