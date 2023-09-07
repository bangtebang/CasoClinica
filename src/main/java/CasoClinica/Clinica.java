package CasoClinica;

import java.util.ArrayList;
import CasoClinica.EspecialidadMedica;

public class Clinica {
	private String nombre;
	private String direccionesAsociadas;
	private String tipoClinica;
	public Trabajador trabajadores;
	private ArrayList<Medico> medicos = new ArrayList<Medico>();
	private ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
	private ArrayList<EspecialidadMedica> especialidadesMedicas = new ArrayList<EspecialidadMedica>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccionesAsociadas() {
		return this.direccionesAsociadas;
	}

	public void setDireccionesAsociadas(String direccionesAsociadas) {
		this.direccionesAsociadas = direccionesAsociadas;
	}

	public String getTipoClinica() {
		return this.tipoClinica;
	}

	public void setTipoClinica(String tipoClinica) {
		this.tipoClinica = tipoClinica;
	}

	public Clinica(String nombre, String direccionesAsociadas, String tipoClinica, Trabajador trabajadores, ArrayList<Medico> medicos, ArrayList<Administrativo> administrativos, ArrayList<EspecialidadMedica> especialidadesMedicas) {
		this.nombre = nombre;
		this.direccionesAsociadas = direccionesAsociadas;
		this.tipoClinica = tipoClinica;
		this.trabajadores = trabajadores;
		this.medicos = medicos;
		this.administrativos = administrativos;
		this.especialidadesMedicas = especialidadesMedicas;
	}
	public void agregarMedico(Medico medico) {
		medicos.add(medico);
	}
	public void agregarAdministrativo(Administrativo administrativo) {
		administrativos.add(administrativo);
	}
	public ArrayList<Administrativo> obtenerAdministrativos() {
		return administrativos;
	}
	public ArrayList<Medico> obtenerMedicos() {
		return medicos;
	}
	public ArrayList<Medico> obtenerMedicosPorEspecialidad(String nombreEspecialidad) {
		ArrayList<Medico> medicosPorEspecialidad = new ArrayList<>();
		for (EspecialidadMedica especialidad : especialidadesMedicas) {
			if (especialidad.getNombre().equalsIgnoreCase(nombreEspecialidad)) {
				medicosPorEspecialidad.addAll(especialidad.obtenerMedicos());
			}
		}
		return medicosPorEspecialidad;
	}
	public Administrativo obtenerAdministrativoPorEspecialidadNombreRut(String nombreEspecialidad, String nombreAdministrativo, String rutAdministrativo) {
		for (EspecialidadMedica especialidad : especialidadesMedicas) {
			if (especialidad.getNombre().equalsIgnoreCase(nombreEspecialidad)) {
				for (Administrativo administrativo : administrativos) {
					if (administrativo.getNombre().equalsIgnoreCase(nombreAdministrativo) && administrativo.getRut().equalsIgnoreCase(rutAdministrativo)) {
						return administrativo;
					}
				}
			}
		}
		return null;
	}
}