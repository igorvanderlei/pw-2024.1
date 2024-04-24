package br.edu.ufape.pw.mensageiro.negocio.colecaoNegocio;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.pw.mensageiro.negocio.basica.Grupo;

public interface InterfaceCadastroGrupo {

	Grupo salvarGrupo(Grupo entity);

	List<Grupo> listarTodosGrupos();

	Optional<Grupo> localizarGrupoId(Long id);

	void deletarGrupo(Grupo entity);

	void deleteGrupo(Long id);

}