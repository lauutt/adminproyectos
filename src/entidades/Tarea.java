package entidades;

public class Tarea {
	
	private Integer id;
	private String titulo;
	private String descripcion;
	private Float cantidadHoras;
	
	public void setID(Integer id) {
		this.id = id;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setCantidadHoras(Float cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public Float getCantidadHoras() {
		return cantidadHoras;
	}
	
	public Integer getID() {
		return id;
	}
	
	
	
	

}
