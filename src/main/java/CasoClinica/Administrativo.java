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

	public Administrativo() {
		throw new UnsupportedOperationException();
	}

	public void getTipo() {
		throw new UnsupportedOperationException();
	}
}