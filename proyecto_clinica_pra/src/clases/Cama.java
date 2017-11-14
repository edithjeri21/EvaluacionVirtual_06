package clases;

public class Cama {
	
	private int nuneroCama;
	private double precioDia;
	private int estado;
	/*0 = Libre
      1 = Ocupad*/
	
	
	
	public Cama(int nuneroCama, double precioDia, int estado) {
		this.nuneroCama = nuneroCama;
		this.precioDia = precioDia;
		this.estado = estado;
	}
	
	
	public int getNuneroCama() {
		return nuneroCama;
	}
	public void setNuneroCama(int nuneroCama) {
		this.nuneroCama = nuneroCama;
	}
	public double getPrecioDia() {
		return precioDia;
	}
	public void setPrecioDia(double precioDia) {
		this.precioDia = precioDia;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	} 
	
	
	
}
