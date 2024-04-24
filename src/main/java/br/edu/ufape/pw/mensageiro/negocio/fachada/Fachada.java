package br.edu.ufape.pw.mensageiro.negocio.fachada;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.pw.mensageiro.negocio.basica.Grupo;
import br.edu.ufape.pw.mensageiro.negocio.basica.MensagemGrupo;
import br.edu.ufape.pw.mensageiro.negocio.basica.MensagemPrivada;
import br.edu.ufape.pw.mensageiro.negocio.basica.Usuario;
import br.edu.ufape.pw.mensageiro.negocio.colecaoNegocio.InterfaceCadastroGrupo;
import br.edu.ufape.pw.mensageiro.negocio.colecaoNegocio.InterfaceCadastroMensagemGrupo;
import br.edu.ufape.pw.mensageiro.negocio.colecaoNegocio.InterfaceCadastroMensagemPrivada;
import br.edu.ufape.pw.mensageiro.negocio.colecaoNegocio.InterfaceCadastroUsuario;

@Service
public class Fachada {
	@Autowired
	private InterfaceCadastroGrupo cadastroGrupo;
	@Autowired
	private InterfaceCadastroMensagemGrupo cadastroMensagemGrupo;
	@Autowired
	private InterfaceCadastroMensagemPrivada cadastromensagemPrivada;
	@Autowired
	private InterfaceCadastroUsuario cadastroUsuario;
	
	public void adicionarUsuarioGrupo(Long idGrupo, String emailUsuario) {
		Optional<Grupo> optionalGrupo = localizarGrupoId(idGrupo);
		if(optionalGrupo.isPresent()) {
			Usuario usuario = procurarUsuarioEmail(emailUsuario);
			if(usuario != null) {
				Grupo grupo = optionalGrupo.get();
				if(!grupo.getParticipantes().contains(usuario)) {
					grupo.getParticipantes().add(usuario);
					salvarGrupo(grupo);
				}
			} else {
				throw new RegistroNaoEncontradoException("Usuario não encontrado");
			}
		} else {
			throw new RegistroNaoEncontradoException("Grupo não encontrado");
		}
	}
	
	
	
	
	
	public Usuario procurarUsuarioId(long id) {
		return cadastroUsuario.procurarUsuarioId(id);
	}





	public Grupo salvarGrupo(Grupo entity) {
		return cadastroGrupo.salvarGrupo(entity);
	}
	public List<Grupo> listarTodosGrupos() {
		return cadastroGrupo.listarTodosGrupos();
	}
	public Optional<Grupo> localizarGrupoId(Long id) {
		return cadastroGrupo.localizarGrupoId(id);
	}
	public void deletarGrupo(Grupo entity) {
		cadastroGrupo.deletarGrupo(entity);
	}
	public void deleteGrupo(Long id) {
		cadastroGrupo.deleteGrupo(id);
	}
	public MensagemGrupo salvarMensagemGrupo(MensagemGrupo entity) {
		return cadastroMensagemGrupo.salvarMensagemGrupo(entity);
	}
	public List<MensagemGrupo> listarTodosMensagemGrupos() {
		return cadastroMensagemGrupo.listarTodosMensagemGrupos();
	}
	public Optional<MensagemGrupo> localizarMensagemGrupoId(Long id) {
		return cadastroMensagemGrupo.localizarMensagemGrupoId(id);
	}
	public void deletarMensagemGrupo(MensagemGrupo entity) {
		cadastroMensagemGrupo.deletarMensagemGrupo(entity);
	}
	public void deleteMensagemGrupo(Long id) {
		cadastroMensagemGrupo.deleteMensagemGrupo(id);
	}
	public MensagemPrivada salvarMensagemPrivada(MensagemPrivada entity) {
		return cadastromensagemPrivada.salvarMensagemPrivada(entity);
	}
	public List<MensagemPrivada> listarTodosMensagemPrivadas() {
		return cadastromensagemPrivada.listarTodosMensagemPrivadas();
	}
	public Optional<MensagemPrivada> localizarMensagemPrivadaId(Long id) {
		return cadastromensagemPrivada.localizarMensagemPrivadaId(id);
	}
	public void deletarMensagemPrivada(MensagemPrivada entity) {
		cadastromensagemPrivada.deletarMensagemPrivada(entity);
	}
	public void deleteMensagemPrivada(Long id) {
		cadastromensagemPrivada.deleteMensagemPrivada(id);
	}
	public Usuario procurarUsuarioEmail(String email) {
		return cadastroUsuario.procurarUsuarioEmail(email);
	}
	public List<Usuario> listarUsuariosNome(String nome) {
		return cadastroUsuario.listarUsuariosNome(nome);
	}
	public Usuario salvarUsuario(Usuario entity) {
		return cadastroUsuario.salvarUsuario(entity);
	}
	public List<Usuario> listarTodosUsuarios() {
		return cadastroUsuario.listarTodosUsuarios();
	}
	public void deletarUsuario(Long id) {
		cadastroUsuario.deletarUsuario(id);
	}
	public void deletarUsuario(Usuario entity) {
		cadastroUsuario.deletarUsuario(entity);
	}
	
	

}
