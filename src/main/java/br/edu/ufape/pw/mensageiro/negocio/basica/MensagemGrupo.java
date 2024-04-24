package br.edu.ufape.pw.mensageiro.negocio.basica;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class MensagemGrupo extends Mensagem{
	
	@ManyToOne
	private Grupo destinatario;
}
