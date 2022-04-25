package tarea4;

public class Profesor {
	
		private String nombre = "", apellido = "", categoria = "";
		private int edad = 0, experiencia = 0;
		static final private char sexo = 'H';
		private String RUT;
		
		
	    public Profesor(){

	    }
	    
		
		public Profesor(String nombre, int edad, char sexo){
			String apellido = "", categoria = "", RUT;
			int experiencia = 0;
		}
		
		
		public Profesor(String nombre, String apellido, String categoria, String RUT, int edad, int experiencia, char sexo){

		}

		
		
		public void calcularCategoria(int experiencia) {
			this.experiencia = experiencia;
			if(experiencia <= 2) {
				categoria = "ASISTENTE";
			} else if(experiencia > 2 && experiencia < 5) {
				categoria = "AGREGADO";
			} else if(experiencia >= 5) {
				categoria = "TITULAR";
			}
			System.out.println("La categoría del Profesor es: " + categoria);
		}
		
		
		public boolean esTitular() {
			boolean verdadero = false;
			if (categoria == "TITULAR") { 
				verdadero = true;
				
			}
			System.out.println(verdadero);
			return verdadero;	
		}
		
		
		public void comprobarSexo(char sexo) {
			if(sexo != 'H' && sexo != 'M') {
				
			}else {
				System.out.println("El sexo del Profesor es: " + sexo);
			}
			
		}
		
		
		protected void generarRut() {

	        final int divisor = 11;

	        //8 dig

	        int numRut = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));

	        int res = numRut - (numRut / divisor * divisor);


	        //dígito

	        char digitoRut = generaDigitoRut(res);


	        RUT = Integer.toString(numRut) + "-" + digitoRut;
	        
	        System.out.println("El rut del Profesor es: " + RUT);

	    }


	    protected char generaDigitoRut(int res) {

	        char digito[] = {'0', '1', '2', '3', '4', '5', '6',

	            '7', '8', '9', 'K'};

	        return digito[res];

	    }
	    
	    
	    public void setNombre(String nombre) {

	        this.nombre = nombre;

	    }
	    
	    public void setApellido(String apellido) {

	        this.apellido = apellido;

	    }
	    
	    public void setEdad(int edad) {

	        this.edad = edad;

	    }
	    
	    public void setExperiencia(int experiencia) {

	        this.experiencia = experiencia;

	    }
	    
	    public void setCategoria(String categoria) {

	        this.categoria = categoria;

	    }
   
	    
	    	    		
}



