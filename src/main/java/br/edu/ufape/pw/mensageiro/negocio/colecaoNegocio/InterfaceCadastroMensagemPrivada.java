package br.edu.ufape.pw.mensageiro.negocio.colecaoNegocio;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.pw.mensageiro.negocio.basica.MensagemPrivada;

public interface InterfaceCadastroMensagemPrivada {

	MensagemPrivada salvarMensagemPrivada(MensagemPrivada entity);

	List<MensagemPrivada> listarTodosMensagemPrivadas();

	Optional<MensagemPrivada> localizarMensagemPrivadaId(Long id);

	void deletarMensagemPrivada(MensagemPrivada entity);

	void deleteMensagemPrivada(Long id);

}