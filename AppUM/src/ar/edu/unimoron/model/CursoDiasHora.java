/**
 * 
 */
package ar.edu.unimoron.model;

/**
 * @author mariano
 *
 */
public class CursoDiasHora {

	private DiasHora diasHora;
	
	public CursoDiasHora( DiasHora diasHora){
		this.diasHora = diasHora;
	}

	/**
	 * @return the diasHora
	 */
	public DiasHora getDiasHora() {
		return diasHora;
	}

	/**
	 * @param diasHora the diasHora to set
	 */
	public void setDiasHora(DiasHora diasHora) {
		this.diasHora = diasHora;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CursoDiasHora [diasHora=" + diasHora + "]";
	}
	
	
}
