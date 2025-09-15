package com.prova.guilhermeyudi.infrastructure.repository;

import com.prova.guilhermeyudi.infrastructure.entity.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteRepositoy extends JpaRepository<Estudante, Long> {

}
