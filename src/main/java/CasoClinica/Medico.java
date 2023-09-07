package CasoClinica;

public class Medico extends Trabajador {
	private String especializacion;
	private String horarioAtencion;
	private int pacientesAsignados;
	private String areExperiencia;
	private EspecialidadMedica especialidadMedica;

	public String getEspecializacion() {
		return this.especializacion;
	}

	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}

	public String getNombre() {
		throw new UnsupportedOperationException();
	}

	public void setNombre(String nombre) {
		throw new UnsupportedOperationException();
	}

	public String getHorarioAtencion() {
		return this.horarioAtencion;
	}

	public void setHorarioAtencion(String horarioAtencion) {
		this.horarioAtencion = horarioAtencion;
	}

	public int getPacientesAsignados() {
		return this.pacientesAsignados;
	}

	public void setPacientesAsignados(int pacientesAsignados) {
		this.pacientesAsignados = pacientesAsignados;
	}

	public String getAreExperiencia() {
		return this.areExperiencia;
	}

	public void setAreExperiencia(String areExperiencia) {
		this.areExperiencia = areExperiencia;
	}

	public Medico() {
		throw new UnsupportedOperationException();
	}

	public void getTipo() {
		throw new UnsupportedOperationException();
	}
}