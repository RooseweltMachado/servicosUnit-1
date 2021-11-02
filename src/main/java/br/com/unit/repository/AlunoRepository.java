package br.com.unit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.unit.domain.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long>{

}
