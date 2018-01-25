package com.jhones.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhones.cursomc.domain.Categoria;
import com.jhones.cursomc.repositories.CategoriaRepository;
import com.jhones.cursomc.services.execption.ObjectNotFoundExecption;



@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundExecption("Objeto não encontrado! :Id" + id + ", Tipo: " + Categoria.class.getName());
		}
		
		return obj;
	}

}
