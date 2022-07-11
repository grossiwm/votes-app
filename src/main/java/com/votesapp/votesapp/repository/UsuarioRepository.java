package com.votesapp.votesapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.votesapp.votesapp.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	
	public Usuario findByEmail(String email);
}
