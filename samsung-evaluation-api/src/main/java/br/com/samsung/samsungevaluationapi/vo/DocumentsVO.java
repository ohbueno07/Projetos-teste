package br.com.samsung.samsungevaluationapi.vo;

public class DocumentsVO {
	
	private String documentId;
	
	private String documentNumber;
	
	private String notaFiscal;
	
	private String documentDate;
	
	private String documentValue;
	
	private String currencyCode;
	
	public DocumentsVO() {
		
	}

	// getters and setters
	

	
	/**
	 * @return the documentId
	 */
	public String getDocumentId() {
		return documentId;
	}

	/**
	 * @param documentId the documentId to set
	 */
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	/**
	 * @return the documentNumber
	 */
	public String getDocumentNumber() {
		return documentNumber;
	}

	/**
	 * @param documentNumber the documentNumber to set
	 */
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	/**
	 * @return the notaFiscal
	 */
	public String getNotaFiscal() {
		return notaFiscal;
	}

	/**
	 * @param notaFiscal the notaFiscal to set
	 */
	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	/**
	 * @return the documentDate
	 */
	public String getDocumentDate() {
		return documentDate;
	}

	/**
	 * @param documentDate the documentDate to set
	 */
	public void setDocumentDate(String documentDate) {
		this.documentDate = documentDate;
	}

	/**
	 * @return the documentValue
	 */
	public String getDocumentValue() {
		return documentValue;
	}

	/**
	 * @param documentValue the documentValue to set
	 */
	public void setDocumentValue(String documentValue) {
		this.documentValue = documentValue;
	}

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

	

}