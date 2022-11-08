package demoInsCurso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import demoInsCurso.conn.UConnection;
import demoInsCurso.dto.CursoDto;

public class CursoDao {
	public List<CursoDto> getCusos() {
		String sql = "SELECT id_curso, descripcion, precio FROM curso";
		try {
			Connection con = UConnection.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			List<CursoDto> lst = new ArrayList<>();
			while (rs.next()) {
				CursoDto dto = new CursoDto();
				dto.setIdCurso(rs.getInt("id_curso"));
				dto.setDesccripcion(rs.getString("descripcion"));
				dto.setPrecio(rs.getDouble("precio"));
				lst.add(dto);
			}
			return lst;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
