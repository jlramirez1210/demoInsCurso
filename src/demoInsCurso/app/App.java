package demoInsCurso.app;

import java.util.List;
import java.util.Scanner;

import demoInsCurso.dto.CursoDto;
import demoInsCurso.dto.FormaPagoDto;
import demoInsCurso.dto.InscripcionDto;
import demoInsCurso.facade.Facade;

public class App {

	public static void main(String[] args) {
		Facade f = new Facade();
		_mostrarPantallaInc(f);
		InscripcionDto dto = _ingresoDatos();
		int idInsc = f.registrarInscripcion(dto);
		_mostrarPantallaConfirm(idInsc);
	}
	
	public static void _mostrarPantallaInc(Facade f) {
		//obtener la lista de cursos
		List<CursoDto> cursos = f.obtenerCursos();
		
		//obtener la lista de formas de pago
		List<FormaPagoDto> formasPago = f.obtenerFormasPago();
		
		System.out.println("-- Cursos --");
		for(CursoDto dto:cursos) {
			System.out.print(dto.getIdCurso() + " - ");
			System.out.print(dto.getDesccripcion());
			System.out.println("");
		}
		
		System.out.println("-- Formas de pago --");
		for(FormaPagoDto dto:formasPago) {
			System.out.print(dto.getIdFormaPago() + " - ");
			System.out.print(dto.getDescripcion());
			System.out.println("");
		}
	}
	
	public static InscripcionDto _ingresoDatos() {
		//Con scanner ingreso datos por teclado
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");;
		String nom = scanner.next();
		
		System.out.print("Ingrese su telefono: ");;
		String tel = scanner.next();
		
		System.out.print("Ingrese el codigo de curso: ");;
		int idCurso = scanner.nextInt();
		
		System.out.print("Ingrese el codigo de formas de pago: ");;
		int idFormaPago = scanner.nextInt();
		
		InscripcionDto dto = new InscripcionDto();
		dto.setNombre(nom);
		dto.setTelefono(tel);
		dto.setIdCurso(idCurso);
		dto.setIdFormaPago(idFormaPago);
		return dto;
	}
	
	public static void _mostrarPantallaConfirm(int id) {
		System.out.print("Codigo de inscripcion " + id);
	}
}
