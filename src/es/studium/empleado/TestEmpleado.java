package es.studium.empleado;

public class TestEmpleado
{

	public static void main(String[] args)
	{
		//Clase   Objeto        contructor vacio
		Empleado empleado1 = new Empleado();
		
		//Valores de los atributos llamando a Set
		empleado1.setNombre("José");
		empleado1.setApellidos("Alvarez Jimenez");
		empleado1.setDni("453671112");
		empleado1.setDomicilio("calle Larios, portal 2, 3-A");
		empleado1.setPuesto("programador");
		empleado1.setTelefono(653213456);
		
		//mostrar informacion con el syso y metodo get
		
		System.out.println(empleado1.getNombre()+ " " + empleado1.getApellidos()+ " "+ empleado1.getDni() 
		+ " " + empleado1.getDomicilio() +  " " + empleado1.getPuesto() + " " + empleado1.getTelefono());
		
		// nuevo clase objeto pero con constructor por parametros
		
		Empleado empleado2 = new Empleado("Paco", "Mermela Pinga", "763342221A", "Calle huesca, bloque 2, piso 3-C"
				,"programador web", 759958643);
		
		System.out.println(empleado2.getNombre()+ " " + empleado2.getApellidos()+ " "+ empleado2.getDni() 
		+ " " + empleado2.getDomicilio() +  " " + empleado2.getPuesto() + " " + empleado2.getTelefono());
		
	}

}
