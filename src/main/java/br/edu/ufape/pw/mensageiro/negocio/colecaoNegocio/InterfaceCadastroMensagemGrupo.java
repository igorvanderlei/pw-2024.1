package br.edu.ufape.pw.mensageiro.negocio.colecaoNegocio;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.pw.mensageiro.negocio.basica.MensagemGrupo;

public interface InterfaceCadastroMensagemGrupo {

	MensagemGrupo salvarMensagemGrupo(MensagemGrupo entity);

	List<MensagemGrupo> listarTodosMensagemGrupos();

	Optional<MensagemGrupo> localizarMensagemGrupoId(Long id);

	void deletarMensagemGrupo(MensagemGrupo entity);

	void deleteMensagemGrupo(Long id);

}