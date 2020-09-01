package br.com.samsung.samsungevaluationapi.vo;

public class CurrencyVO {
	
	private String currencyId;
	
	private String currencyCode;
	
	private String currencyDesc;
	
	
	/**
	 * Constructor
	 */
	public CurrencyVO() {
		
	}

	
	// getters and setters 
	
	
	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @param currencyCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}



	/**
	 * @return the currencyId
	 */
	public String getCurrencyId() {
		return currencyId;
	}



	/**
	 * @param currencyId the currencyId to set
	 */
	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}



	/**
	 * @return the currencyDesc
	 */
	public String getCurrencyDesc() {
		return currencyDesc;
	}



	/**
	 * @param currencyDesc the currencyDesc to set
	 */
	public void setCurrencyDesc(String currencyDesc) {
		this.currencyDesc = currencyDesc;
	}


}
