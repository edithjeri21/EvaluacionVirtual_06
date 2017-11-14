package clases;

public class Paciente {
	
	private int codigoPaciente;
	/*codigoPaciente int Correlativo (1001)*/
	
	private String Apellidos;
	private String Nombres;
	private String Telefono;
	private String DNI;
	public Paciente(int codigoPaciente, String apellidos, String nombres, String telefono, String dNI) {
		this.codigoPaciente = codigoPaciente;
		Apellidos = apellidos;
		Nombres = nombres;
		Telefono = telefono;
		DNI = dNI;
	}
	public int getCodigoPaciente() {
		return codigoPaciente;
	}
	public void setCodigoPaciente(int codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	

}
