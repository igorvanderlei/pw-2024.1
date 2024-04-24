package br.edu.ufape.pw.mensageiro.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufape.pw.mensageiro.negocio.basica.MensagemPrivada;

public interface ColecaoMensagemPrivada extends JpaRepository<MensagemPrivada, Long>{

}
