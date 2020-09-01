
public class Usuario {
	
	
	private int pontos;
	private boolean moderador;
	
	public void tornaModerador() {
		this.setModerador(true);
	}
	
	@Override
	public String toString() {
		return "Usuario [pontos=" + pontos + ", moderador=" + moderador + "]";
	}

	public Usuario(int pontos) {
		this.setPontos(pontos);
	}

	/**
	 * @return the pontos
	 */
	public int getPontos() {
		return pontos;
	}

	/**
	 * @param pontos the pontos to set
	 */
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	/**
	 * @return the moderador
	 */
	public boolean isModerador() {
		return moderador;
	}

	/**
	 * @param moderador the moderador to set
	 */
	public void setModerador(boolean moderador) {
		this.moderador = moderador;
	}


}
