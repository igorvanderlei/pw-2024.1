package br.edu.ufape.pw.mensageiro.negocio.colecaoNegocio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.pw.mensageiro.dados.ColecaoGrupo;
import br.edu.ufape.pw.mensageiro.negocio.basica.Grupo;

@Service
public class CadastroGrupo implements InterfaceCadastroGrupo {
	@Autowired
	private ColecaoGrupo colecaoGrupo;

	public Grupo salvarGrupo(Grupo entity) {
		return colecaoGrupo.save(entity);
	}

	public List<Grupo> listarTodosGrupos() {
		return colecaoGrupo.findAll();
	}

	public Optional<Grupo> localizarGrupoId(Long id) {
		return colecaoGrupo.findById(id);
	}

	public void deletarGrupo(Grupo entity) {
		colecaoGrupo.delete(entity);
	}

	public void deleteGrupo(Long id) {
		colecaoGrupo.deleteById(id);
	}
	
	
	

}
