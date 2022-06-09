package entidades;

public class TareaProyecto {
	private Tarea tarea;
	private Proyecto proyecto;
	
	public TareaProyecto(Tarea tarea, Proyecto proyecto) {
		this.proyecto = proyecto;
		this.tarea = tarea;
	}
	
	public Tarea getTarea() {
		return tarea;
	}
	
	public Proyecto getProyecto() {
		return proyecto;
	}
	
	public void setTarea(Tarea t) {
		this.tarea = t;
	}
	
	public void setProyecto(Proyecto p) {
		this.proyecto = p;
	}
}
