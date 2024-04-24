package br.edu.ufape.pw.mensageiro.negocio.colecaoNegocio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.pw.mensageiro.dados.ColecaoMensagemPrivada;
import br.edu.ufape.pw.mensageiro.negocio.basica.MensagemPrivada;

@Service
public class CadastroMensagemPrivada implements InterfaceCadastroMensagemPrivada {
	@Autowired
	private ColecaoMensagemPrivada colecaoMensagemPrivada;

	public MensagemPrivada salvarMensagemPrivada(MensagemPrivada entity) {
		return colecaoMensagemPrivada.save(entity);
	}

	public List<MensagemPrivada> listarTodosMensagemPrivadas() {
		return colecaoMensagemPrivada.findAll();
	}

	public Optional<MensagemPrivada> localizarMensagemPrivadaId(Long id) {
		return colecaoMensagemPrivada.findById(id);
	}

	public void deletarMensagemPrivada(MensagemPrivada entity) {
		colecaoMensagemPrivada.delete(entity);
	}

	public void deleteMensagemPrivada(Long id) {
		colecaoMensagemPrivada.deleteById(id);
	}
}
