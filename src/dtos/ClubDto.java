package dtos;

public class ClubDto {

	int idClub;
	String nombreClub;
	String descripcinClub;
	boolean privado;
	
	//cosntructor con campos
	public ClubDto(int idClub, String nombreClub, String descripcinClub, boolean privado) {
		super();
		this.idClub = idClub;
		this.nombreClub = nombreClub;
		this.descripcinClub = descripcinClub;
		this.privado = privado;
	}
	
	public ClubDto() {
		
	}
	
	
	//Getters an setters
	
	public int getIdClub() {
		return idClub;
	}

	public void setIdClub(int idClub) {
		this.idClub = idClub;
	}

	public String getNombreClub() {
		return nombreClub;
	}

	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}

	public String getDescripcinClub() {
		return descripcinClub;
	}

	public void setDescripcinClub(String descripcinClub) {
		this.descripcinClub = descripcinClub;
	}

	public boolean isPrivado() {
		return privado;
	}

	public void setPrivado(boolean privado) {
		this.privado = privado;
	}
	
}
