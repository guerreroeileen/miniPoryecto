package co.edu.icesi.mio.logic;


import java.util.List;

import co.edu.icesi.mio.exceptions.LogicException;
import co.edu.icesi.mio.model.Tmio1Servicio;
import co.edu.icesi.mio.model.Tmio1ServicioPK;

public interface ITMIO1_SERVICIOS_LOGIC {
	
	public void save(Tmio1Servicio servicio)throws LogicException;

	public void update(Tmio1Servicio servicio)throws LogicException;

	public void delete(Tmio1Servicio servicio)throws LogicException;

	public List<Tmio1Servicio> findAll()throws LogicException;

	public Tmio1Servicio findById(Tmio1ServicioPK id)throws LogicException;


}
