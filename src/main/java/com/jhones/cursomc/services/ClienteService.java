package com.jhones.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhones.cursomc.domain.Cliente;
import com.jhones.cursomc.repositories.ClienteRepository;
import com.jhones.cursomc.services.execption.ObjectNotFoundExecption;



@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Cliente obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundExecption("Objeto não encontrado! :Id" + id + ", Tipo: " + Cliente.class.getName());
		}
		
		return obj;
	}

}
