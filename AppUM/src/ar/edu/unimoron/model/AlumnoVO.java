/**
 * 
 */
package ar.edu.unimoron.model;

import java.util.Date;

import ar.edu.unimoron.model.Carrera;

/**
 * @author mariano
 *
 */
public class AlumnoVO {

	private String matricula;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private String planEstudio;
	private Carrera carrera;
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * @return the planEstudio
	 */
	public String getPlanEstudio() {
		return planEstudio;
	}
	/**
	 * @param planEstudio the planEstudio to set
	 */
	public void setPlanEstudio(String planEstudio) {
		this.planEstudio = planEstudio;
	}
	/**
	 * @return the carrera
	 */
	public Carrera getCarrera() {
		return carrera;
	}
	/**
	 * @param carrera the carrera to set
	 */
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AlumnoVO [matricula=" + matricula + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", planEstudio=" + planEstudio
				+ ", carrera=" + carrera + "]";
	}
	
	
	
}
