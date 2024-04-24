package br.edu.ufape.pw.mensageiro.negocio.colecaoNegocio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.pw.mensageiro.dados.ColecaoMensagemGrupo;
import br.edu.ufape.pw.mensageiro.negocio.basica.MensagemGrupo;

@Service
public class CadastroMensagemGrupo implements InterfaceCadastroMensagemGrupo {
	@Autowired
	private ColecaoMensagemGrupo colecaoMensagemGrupo;

	public MensagemGrupo salvarMensagemGrupo(MensagemGrupo entity) {
		return colecaoMensagemGrupo.save(entity);
	}

	public List<MensagemGrupo> listarTodosMensagemGrupos() {
		return colecaoMensagemGrupo.findAll();
	}

	public Optional<MensagemGrupo> localizarMensagemGrupoId(Long id) {
		return colecaoMensagemGrupo.findById(id);
	}

	public void deletarMensagemGrupo(MensagemGrupo entity) {
		colecaoMensagemGrupo.delete(entity);
	}

	public void deleteMensagemGrupo(Long id) {
		colecaoMensagemGrupo.deleteById(id);
	}
}
