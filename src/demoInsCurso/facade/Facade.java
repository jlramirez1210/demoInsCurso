package demoInsCurso.facade;

import java.util.List;

import demoInsCurso.dao.CursoDao;
import demoInsCurso.dao.FormaPagoDao;
import demoInsCurso.dao.InscripcionDao;
import demoInsCurso.dto.CursoDto;
import demoInsCurso.dto.FormaPagoDto;
import demoInsCurso.dto.InscripcionDto;

public class Facade {
	public int registrarInscripcion(InscripcionDto dto) {
		InscripcionDao dao = new InscripcionDao();
		return dao.insertar(dto);
	}
	
	public List<CursoDto> obtenerCursos(){
		CursoDao dao =new CursoDao();
		return dao.getCusos();
	}
	
	public List<FormaPagoDto> obtenerFormasPago(){
		FormaPagoDao dao =new FormaPagoDao();
		return dao.getFormasPago();
	}	
}
