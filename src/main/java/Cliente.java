public class Cliente {
	private String nombre;
	private String direccion;
	private int numTelefonico;
	private String correo;
	private int rut;
	public Automotora automotora;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumTelefonico() {
		return this.numTelefonico;
	}

	public void setNumTelefonico(int numTelefonico) {
		this.numTelefonico = numTelefonico;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getRut() {
		return this.rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public Cliente(String nombre, int rut, String correo, String direccion, int numTelefonico) {
		throw new UnsupportedOperationException();
	}
}