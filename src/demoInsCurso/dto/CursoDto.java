package demoInsCurso.dto;

public class CursoDto {
	private int idCurso;
	private String desccripcion;
	private double precio;

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getDesccripcion() {
		return desccripcion;
	}

	public void setDesccripcion(String desccripcion) {
		this.desccripcion = desccripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "CursoDto [idCurso=" + idCurso + ", desccripcion=" + desccripcion + ", precio=" + precio + "]";
	}
}