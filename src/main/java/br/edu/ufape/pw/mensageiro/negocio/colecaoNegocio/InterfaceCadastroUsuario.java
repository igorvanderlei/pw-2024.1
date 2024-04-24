package br.edu.ufape.pw.mensageiro.negocio.colecaoNegocio;

import java.util.List;

import br.edu.ufape.pw.mensageiro.negocio.basica.Usuario;

public interface InterfaceCadastroUsuario {

	Usuario procurarUsuarioEmail(String email);

	List<Usuario> listarUsuariosNome(String nome);

	Usuario salvarUsuario(Usuario entity);

	List<Usuario> listarTodosUsuarios();

	void deletarUsuario(Long id);

	void deletarUsuario(Usuario entity);

	Usuario procurarUsuarioId(long id);

}