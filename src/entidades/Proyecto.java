package entidades;

public class Proyecto {
	
	private String titulo;
	private String descripcion;
	private Integer id;
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Proyecto(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		
	}
	public Proyecto(Integer id, String titulo, String descripcion) {
		this.descripcion = descripcion;
		this.id = id;
		this.titulo = titulo;
	}
	
	public void setID(Integer id) {
		this.id = id;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	public String getTitulo() {
		return this.titulo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public String toString() {
		return "ID: "+id+"Título: "+titulo+"\nDescripción: "+descripcion+"\n";
	}
	

}
