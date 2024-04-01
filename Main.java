
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado e1 = new Empleado("Pedro", "calle siembre viva", "jeje@gmail.com", "2312312321", "Junio 3 del 2023", 10000f);
		Estudiante es1 = new Estudiante("Juan", "calle de mi barrio", "juajua@gmail.com", "32913892", 2.4);
		
		System.out.println( e1.toString() );
		System.out.println( es1.toString() );
	}

}
