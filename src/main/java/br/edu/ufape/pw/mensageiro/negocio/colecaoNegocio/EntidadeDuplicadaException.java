package br.edu.ufape.pw.mensageiro.negocio.colecaoNegocio;

public class EntidadeDuplicadaException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public EntidadeDuplicadaException(String msg) {
		super(msg);
	}

}
