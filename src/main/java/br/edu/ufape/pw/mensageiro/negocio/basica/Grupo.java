package br.edu.ufape.pw.mensageiro.negocio.basica;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Grupo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	@ManyToOne
	private Usuario proprietario;
	@ManyToMany
	private List<Usuario> participantes;
	
	public List<Usuario> getParticipantes() {
		if(participantes == null)
			this.participantes = new ArrayList<Usuario>();
		return this.participantes;
	}
}
