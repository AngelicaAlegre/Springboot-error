package com.practica.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.practica.springboot.error.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;

	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "Angie", "Alegre"));
		this.lista.add(new Usuario(2, "Donna", "Roe"));
		this.lista.add(new Usuario(3, "Agustina", "Alphis"));
		this.lista.add(new Usuario(4, "Sara", "Nore"));
		this.lista.add(new Usuario(5, "Lila", "Gap"));
		this.lista.add(new Usuario(6, "Leonor", "Siggur"));
	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;
		for (Usuario usuario : this.lista) {
			if (usuario.getId().equals(id)) {
				resultado = usuario;
				break;
			}
		}
		return resultado;
	}

}
