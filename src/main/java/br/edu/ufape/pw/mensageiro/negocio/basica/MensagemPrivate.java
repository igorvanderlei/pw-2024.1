package br.edu.ufape.pw.mensageiro.negocio.basica;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class MensagemPrivate extends Mensagem {
	
	@ManyToOne
	private Usuario destinatario;
}
