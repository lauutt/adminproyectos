package entidades;

public class Empleado {
	private String nombres;
	private String apellidos;
	private String contacto;
	private Integer costoHora;
	private Integer id;
	
	public Empleado(String nombres, String apellidos, String contacto, Integer costoHora) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.contacto = contacto;
		this.costoHora = costoHora;
	}
	
	public Empleado(Integer id, String nombres, String apellidos, String contacto, Integer costoHora) {
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.contacto = contacto;
		this.costoHora = costoHora;
	}
	
	public Empleado() {
	}
	
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	public void setCostoHora(Integer costoHora) {
		this.costoHora = costoHora;
	}
	
	
	public String getNombres() {
		return this.nombres;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public String getContacto() {
		return this.contacto;
	}
	
	public Integer getCostoHora() {
		return this.costoHora;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String toString() {
		return id+"\n"+nombres+" "+apellidos+"\n"+contacto+"\nCosto x hora : "+costoHora+" patacones";
	}
	


}
