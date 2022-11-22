package demoInsCurso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import demoInsCurso.conn.UConnection;
import demoInsCurso.dto.FormaPagoDto;

public class FormaPagoDao {
	public List<FormaPagoDto> getFormasPago() {
		String sql = "SELECT id_forma_pago, descripcion, recargo FROM forma_pago";
		try {
			Connection con = UConnection.getConnection();
			PreparedStatement pstm = con.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			List<FormaPagoDto> lst = new ArrayList<>();
			while (rs.next()) {
				FormaPagoDto dto = new FormaPagoDto();
				dto.setIdFormaPago(rs.getInt("id_forma_pago"));
				dto.setDescripcion(rs.getString("descripcion"));
				dto.setRecargo(rs.getDouble("recargo"));
				lst.add(dto);
			}
			return lst;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
