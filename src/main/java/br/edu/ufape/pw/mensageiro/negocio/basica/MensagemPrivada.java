package br.edu.ufape.pw.mensageiro.negocio.basica;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class MensagemPrivada extends Mensagem {
	
	@ManyToOne
	private Usuario destinatario;
}
