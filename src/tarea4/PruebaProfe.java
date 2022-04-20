package tarea4;

public class PruebaProfe {

	public static void main(String[] args) {
		Profesor profe = new Profesor();
		Profesor setExperiencia = new Profesor();
		Profesor setSexo = new Profesor();
		Profesor setRut = new Profesor();
		
		setRut.generarRut();
		setRut.generaLetraRut(0);
		
		setSexo.comprobarSexo('H');
		
		setExperiencia.calcularCategoria(2);
		setExperiencia.esTitular();

	}

}
