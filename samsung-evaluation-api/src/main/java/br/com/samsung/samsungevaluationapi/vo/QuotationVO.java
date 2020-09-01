package br.com.samsung.samsungevaluationapi.vo;

public class QuotationVO {
	
	private String fromCurrencyCode;
	
	private String toCurrencyCode;
	
	private String cotacao;
	
	private String dataHoraCotacao;
	
	public QuotationVO() {
		
	}

	// getters and setters
	
	
	/**
	 * @return the fromCurrencyCode
	 */
	public String getFromCurrencyCode() {
		return fromCurrencyCode;
	}

	/**
	 * @param fromCurrencyCode the fromCurrencyCode to set
	 */
	public void setFromCurrencyCode(String fromCurrencyCode) {
		this.fromCurrencyCode = fromCurrencyCode;
	}

	/**
	 * @return the toCurrencyCode
	 */
	public String getToCurrencyCode() {
		return toCurrencyCode;
	}

	/**
	 * @param toCurrencyCode the toCurrencyCode to set
	 */
	public void setToCurrencyCode(String toCurrencyCode) {
		this.toCurrencyCode = toCurrencyCode;
	}

	/**
	 * @return the cotacao
	 */
	public String getCotacao() {
		return cotacao;
	}

	/**
	 * @param cotacao the cotacao to set
	 */
	public void setCotacao(String cotacao) {
		this.cotacao = cotacao;
	}

	/**
	 * @return the dataHoraCotacao
	 */
	public String getDataHoraCotacao() {
		return dataHoraCotacao;
	}

	/**
	 * @param dataHoraCotacao the dataHoraCotacao to set
	 */
	public void setDataHoraCotacao(String dataHoraCotacao) {
		this.dataHoraCotacao = dataHoraCotacao;
	}
	

}