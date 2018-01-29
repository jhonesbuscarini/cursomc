package com.jhones.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhones.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
