package demoInsCurso.facade;

import demoInsCurso.dao.InscripcionDao;
import demoInsCurso.dto.InscripcionDto;

public class Facade {
	public int registrarInscripcion(InscripcionDto dto) {
		InscripcionDao dao = new InscripcionDao();
		return dao.insertar(dto);
	}
}
