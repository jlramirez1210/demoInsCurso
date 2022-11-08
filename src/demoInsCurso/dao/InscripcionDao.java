package demoInsCurso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import demoInsCurso.conn.UConnection;
import demoInsCurso.dto.InscripcionDto;

public class InscripcionDao {
	public int insertar(InscripcionDto dto) {
		// el query para obtener la secuencia
		String s1 = "SELECT MAX(id_inscripcion)+1 FROM inscripcion";
		String s2 = "INSERT INTO inscripcion(id_insc, nombre, telefono, id_curso, if_forma_pago) "
				+ "VALUES(?,?,?,?,?)";

		try {
			Connection con = UConnection.getConnection();
			PreparedStatement ps1 = con.prepareStatement(s1);
			PreparedStatement ps2 = con.prepareStatement(s2);
			ResultSet rs = ps1.executeQuery();

			if (rs.next()) {
				int max = rs.getRow();
				ps2.setInt(0, max);
				ps2.setString(1, dto.getNombre());
				ps2.setString(2, dto.getTelefono());
				ps2.setInt(3, dto.getIdCurso());
				ps2.setInt(4, dto.getIdFormaPago());

				if (ps2.executeUpdate() != 1) {
					throw new RuntimeException("Error ...");
				}
				return max;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
		return 0;
	}
}
