package CasoClinica;

import java.util.ArrayList;
import CasoClinica.EspecialidadMedica;

public class Clinica {
	private String nombre;
	private String direccionesAsociadas;
	private String tipoClinica;
	public Trabajador trabajadores;
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

	public Clinica() {
		throw new UnsupportedOperationException();
	}
}