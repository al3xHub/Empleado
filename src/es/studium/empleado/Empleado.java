package es.studium.empleado;

public class Empleado
{
	// Atributos
	private String nombre;
	private String apellidos;
	private String dni;
	private String domicilio;
	private String puesto;
	private int telefono;

	// Constructor vacio

	public Empleado()
	{
		nombre = "";
		apellidos = "";
		dni = "";
		domicilio = "";
		puesto = "";
		telefono = 0;

	}

	// crear constructor por parametos (source-> generate constructor using fields)
	// omitir super antes de generarlo.

	public Empleado(String nombre, String apellidos, String dni, String domicilio, String puesto, int telefono)
	{
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.domicilio = domicilio;
		this.puesto = puesto;
		this.telefono = telefono;
	}

	// Generar los metodos get y set (source-> generate getter and setter) Despues darle formato (source-> format)

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellidos()
	{
		return apellidos;
	}

	public void setApellidos(String apellidos)
	{
		this.apellidos = apellidos;
	}

	public String getDni()
	{
		return dni;
	}

	public void setDni(String dni)
	{
		this.dni = dni;
	}

	public String getDomicilio()
	{
		return domicilio;
	}

	public void setDomicilio(String domicilio)
	{
		this.domicilio = domicilio;
	}

	public String getPuesto()
	{
		return puesto;
	}

	public void setPuesto(String puesto)
	{
		this.puesto = puesto;
	}

	public int getTelefono()
	{
		return telefono;
	}

	public void setTelefono(int telefono)
	{
		this.telefono = telefono;
	}

}
