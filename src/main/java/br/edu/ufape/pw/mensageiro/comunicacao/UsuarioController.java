package br.edu.ufape.pw.mensageiro.comunicacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufape.pw.mensageiro.negocio.basica.Usuario;
import br.edu.ufape.pw.mensageiro.negocio.fachada.Fachada;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private Fachada fachada;
	
	@PostMapping
	public Usuario salvarUsuario(@RequestBody Usuario u) {
		return fachada.salvarUsuario(u);
	}
	
	@GetMapping("/{id}")
	public Usuario localizarUsuario(@PathVariable long id) {
		Usuario usuario = fachada.procurarUsuarioId(id);
		return usuario;
	}
	

}
