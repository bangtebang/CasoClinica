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

	public EspecialidadMedica() {
		throw new UnsupportedOperationException();
	}
}