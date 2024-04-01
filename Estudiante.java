
public class Estudiante extends Persona{

	private int grado;
	private double promedio;
	
	public Estudiante(String nombre, String direccion, String email, String telefono, double promedio) {
		super(nombre, direccion, email, telefono);
		
		this.grado = 1;
		this.promedio = promedio;
	}

	public Estudiante(String nombre, String direccion, String email, String telefono, int grado, double promedio) {
		super(nombre, direccion, email, telefono);
		
		if( grado > 0  && grado < 5 ) {
			this.grado = grado;			
		}
		else {
			this.grado = 1;
		}
		
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "Estudiante [grado=" + grado + ", promedio=" + promedio + ", nombre=" + nombre + ", direccion="
				+ direccion + ", email=" + email + ", telefono=" + telefono + "]";
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	
	
	
}
