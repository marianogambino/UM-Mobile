package ar.edu.unimoron.model;

import ar.edu.unimoron.model.DatosAlumno;

/**
 * @author mariano
 *
 */
public class LoginResponse {

	private DatosAlumno alumno;
	 
	
	public LoginResponse(){
	}
	
	/**
	 * 
	 * @param id
	 * @param content
	 */
	public LoginResponse( DatosAlumno alumno){
		this.alumno = alumno;
	}
	/**
	 * @return the alumno
	 */
	public DatosAlumno getAlumno() {
		return alumno;
	}
	/**
	 * @param alumno the alumno to set
	 */
	public void setAlumno(DatosAlumno alumno) {
		this.alumno = alumno;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoginResponse [alumno=" + alumno + "]";
	}
		
}
