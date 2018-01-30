package com.jhones.cursomc.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jhones.cursomc.domain.Pedido;
import com.jhones.cursomc.services.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value= "/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Pedido obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
		
		/*Pedido cat1 = new Pedido(null, "Informatica");
		Pedido cat2 = new Pedido(null, "Escritorio");
		
		List<Pedido> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;*/
	}

}
