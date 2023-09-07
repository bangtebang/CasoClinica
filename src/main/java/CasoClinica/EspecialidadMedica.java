package CasoClinica;

import java.util.ArrayList;
import CasoClinica.Administrativo;
import CasoClinica.Medico;

public class EspecialidadMedica {
	private String nombre;
	private int latitud;
	private int longitud;
	private Clinica clinica;
	private ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
	private ArrayList<Medico> medicos = new ArrayList<Medico>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLatitud() {
		return this.latitud;
	}

	public void setLatitud(int latitud) {
		this.latitud = latitud;
	}

	public int getLongitud() {
		return this.longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public EspecialidadMedica(String nombre, int latitud, int longitud, Clinica clinica) {
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.clinica = clinica;
	}
	public void agregarMedico(Medico medico) {
		medicos.add(medico);
	}
	public ArrayList<Medico>obtenerMedicos() {
		return medicos;
	}
	public void agregarAdministrativo(Administrativo administrativo) {
		administrativos.add(administrativo);
	}
	public ArrayList<Administrativo> obtenerAdministrativos() {
		return administrativos;
	}
}