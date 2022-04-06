package demoInsCurso.prueba;

import java.util.Iterator;
import java.util.List;

import demoInsCurso.dao.CursoDao;
import demoInsCurso.dto.CursoDto;

public class SimpleTesting {

	public static void main(String[] args) {
		CursoDao cursoDao = new CursoDao();
		List<CursoDto> lst = cursoDao.getCusos();
		/*Iterator<CursoDto> it = lst.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}*/
		System.out.println(lst.toString());
	}

}
