package co.edu.icesi.mio.logic;

import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.icesi.mio.dao.ITmio1_Servicios_DAO;
import co.edu.icesi.mio.exceptions.LogicException;
import co.edu.icesi.mio.model.Tmio1Servicio;

@Service
public class TMIO1_SERVICIOS_LOGIC implements ITMIO1_SERVICIOS_LOGIC {

	private ITmio1_Servicios_DAO dao_servicios;

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public void save(Tmio1Servicio servicio) throws LogicException {
		if (servicio != null) {
			if (servicio.getTmio1Conductore() == null) {
				throw new LogicException();
			}
			/**
			 * la fecha inicio esta definida y sea menor o igual que la fecha final
			 */
			if (servicio.getId().getFechaInicio() != null && servicio.getId().getFechaFin() != null) {
				if (servicio.getId().getFechaInicio().compareTo(servicio.getId().getFechaFin()) > 0) {
					throw new LogicException();
				}
			} else {
				throw new LogicException();
			}

			if (servicio.getId().getCedulaConductor() == null) {
				throw new LogicException();
			}

			dao_servicios.save(servicio);
		} else {
			throw new LogicException();
		}

	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public void update(Tmio1Servicio servicio) throws LogicException {
		if (servicio != null) {
			if (servicio.getTmio1Conductore() == null) {
				throw new LogicException();
			}
			/**
			 * la fecha inicio esta definida y sea menor o igual que la fecha final
			 */
			if (servicio.getId().getFechaInicio() != null && servicio.getId().getFechaFin() != null) {
				if (servicio.getId().getFechaInicio().compareTo(servicio.getId().getFechaFin()) > 0) {
					throw new LogicException();
				}
			} else {
				throw new LogicException();
			}

			if (servicio.getId().getCedulaConductor() == null) {
				throw new LogicException();
			}

			dao_servicios.update(servicio);
		} else {
			throw new LogicException();
		}

	}

	@Override
	@Transactional(rollbackFor = LogicException.class)
	public void delete(Tmio1Servicio servicio) throws LogicException {
		if (servicio != null) {
			dao_servicios.delete(servicio);
		} else {
			throw new LogicException();
		}
	}

	@Override
	public List<Tmio1Servicio> findByRangeOfDates(Calendar fechaInicio, Calendar fechaFin) throws LogicException {
		if (fechaInicio != null && fechaFin != null) {
			if (fechaInicio.compareTo(fechaFin) > 0) {
				throw new LogicException();
			}
		} else {
			throw new LogicException();
		}
		return dao_servicios.findByRangeOfDates(fechaInicio, fechaFin);
	}

}
