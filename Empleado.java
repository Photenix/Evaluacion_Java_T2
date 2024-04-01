
public class Empleado extends Persona{
	public String departamento, fechaContrato;
	public float salario;
	
	public Empleado(String nombre, String direccion, String email, String telefono, String departamento,
			String fechaContrato, float salario) {
		super(nombre, direccion, email, telefono);
		this.fechaContrato = fechaContrato;
		this.salario = salario;
		
		if( departamento.equals("Contabilidad") || departamento.equals("Recursos Humanos") || departamento.equals("Compras") ) {
			this.departamento = departamento;			
		}
		else {
			this.departamento = "Recursos Humanos";
		}
	}
	
	
	public Empleado(String nombre, String direccion, String email, String telefono,
			String fechaContrato, float salario) {
		super(nombre, direccion, email, telefono);
		this.departamento = "Recursos Humanos";
		this.fechaContrato = fechaContrato;
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "Empleado [departamento=" + departamento + ", fechaContrato=" + fechaContrato + ", salario=" + salario
				+ ", nombre=" + nombre + ", direccion=" + direccion + ", email=" + email + ", telefono=" + telefono
				+ "]";
	}
	
	
}
