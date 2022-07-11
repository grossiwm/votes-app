package com.votesapp.votesapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.votesapp.votesapp.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{
	public Role findByNome(String nome);

}
