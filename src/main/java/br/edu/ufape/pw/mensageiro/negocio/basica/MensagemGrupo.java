package br.edu.ufape.pw.mensageiro.negocio.basica;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class MensagemGrupo extends Mensagem{
	
	@ManyToOne
	private Grupo destinatario;
}
