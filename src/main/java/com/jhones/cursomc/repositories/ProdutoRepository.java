package com.jhones.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhones.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
