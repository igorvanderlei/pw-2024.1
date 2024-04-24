package br.edu.ufape.pw.mensageiro.negocio.colecaoNegocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.pw.mensageiro.dados.ColecaoUsuario;
import br.edu.ufape.pw.mensageiro.negocio.basica.Usuario;

@Service
public class CadastroUsuario {
	@Autowired
	private ColecaoUsuario colecaoUsuario;

	public Usuario procurarUsuarioEmail(String email) {
		return colecaoUsuario.findByEmail(email);
	}

	public List<Usuario> listarUsuariosNome(String nome) {
		return colecaoUsuario.findByNomeContainingIgnoreCase(nome);
	}

	public Usuario salvarUsuario(Usuario entity) {
		if(procurarUsuarioEmail(entity.getEmail()) == null)
			return colecaoUsuario.save(entity);
		else
			throw new EntidadeDuplicadaException("O email informado já se encontra cadastrado no sistema");
	}

	public List<Usuario> listarTodosUsuarios() {
		return colecaoUsuario.findAll();
	}

	public void deletarUsuario(Long id) {
		colecaoUsuario.deleteById(id);
	}

	public void deletarUsuario(Usuario entity) {
		colecaoUsuario.delete(entity);
	}
	
	
	

}
