package br.edu.ufape.pw.mensageiro.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufape.pw.mensageiro.negocio.basica.Grupo;

public interface ColecaoGrupo extends JpaRepository<Grupo, Long>{

}
