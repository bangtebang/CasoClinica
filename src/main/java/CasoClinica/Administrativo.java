package CasoClinica;

public class Administrativo extends Trabajador {
	private String correoElectronico;
	private EspecialidadMedica especialidaMedica;

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Administrativo(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo, Clinica clinica,String correoElectronico, EspecialidadMedica especialidaMedica) {
		super(tituloProfesional, nombre, direccion, estadoCivil, rut, horarioTrabajo, clinica);
		this.correoElectronico = correoElectronico;
		this.especialidaMedica = especialidaMedica;
	}

	public String getTipo() {
		return "Administrativo";
	}
}