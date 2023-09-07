package CasoClinica;

public class Medico extends Trabajador {
	private String especializacion;
	private String horarioAtencion;
	private int pacientesAsignados;
	private String areaExperiencia;
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
		return this.areaExperiencia;
	}

	public void setAreExperiencia(String areExperiencia) {
		this.areaExperiencia = areExperiencia;
	}

	public Medico(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo, Clinica clinica, String especializacion, String horarioAtencion, int pacientesAsignados, String areaExperiencia, EspecialidadMedica especialidadMedica) {
		super(tituloProfesional, nombre, direccion, estadoCivil, rut, horarioTrabajo, clinica);
		this.especializacion = especializacion;
		this.horarioAtencion = horarioAtencion;
		this.pacientesAsignados = pacientesAsignados;
		this.areaExperiencia = areaExperiencia;
		this.especialidadMedica = especialidadMedica;
	}

	public String getTipo() {
		return "Medico";
	}
}