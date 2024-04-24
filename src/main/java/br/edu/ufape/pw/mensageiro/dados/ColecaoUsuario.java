package br.edu.ufape.pw.mensageiro.dados;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.pw.mensageiro.negocio.basica.Usuario;

@Repository
public interface ColecaoUsuario extends JpaRepository<Usuario, Long>{
	public Usuario findByEmail(String email);
	public List<Usuario> findByNomeContainingIgnoreCase(String nome);

}
