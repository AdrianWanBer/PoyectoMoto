package dtos;

public class UsuarioDto {

	int id_cliente;
	String dni;
	String nombre;
	String apellidos;
	String contraseya;
	String correoElectronico;
	int club_id;

	// Constuctor con los campos
	public UsuarioDto(int id_cliente, String dni, String nombre, String apellidos, int club_id, String contraseya,
			String correoElectronico) {
		super();
		this.id_cliente = id_cliente;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.club_id = club_id;
		this.contraseya = contraseya;
		this.correoElectronico= correoElectronico; 
	}

	// Constructor vacio
	public UsuarioDto() {

	}

	// Getters and setters
	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getClub_id() {
		return club_id;
	}

	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}

	public String getContraseya() {
		return contraseya;
	}

	public void setContraseya(String contraseya) {
		this.contraseya = contraseya;
	}
	
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

}
