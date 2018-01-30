package com.jhones.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhones.cursomc.domain.Pedido;
import com.jhones.cursomc.repositories.PedidoRepository;
import com.jhones.cursomc.services.execption.ObjectNotFoundExecption;



@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundExecption("Objeto não encontrado! :Id" + id + ", Tipo: " + Pedido.class.getName());
		}
		
		return obj;
	}

}
