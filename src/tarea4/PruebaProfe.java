package tarea4;

public class PruebaProfe {

	public static void main(String[] args) {
		Profesor Experiencia = new Profesor();
		Profesor Sexo = new Profesor();
		Profesor Rut = new Profesor();

		Rut.generarRut();
		Rut.generaDigitoRut(0);
		
		Sexo.comprobarSexo('H');
		
		Experiencia.calcularCategoria(5);
		Experiencia.esTitular();

	}

}

