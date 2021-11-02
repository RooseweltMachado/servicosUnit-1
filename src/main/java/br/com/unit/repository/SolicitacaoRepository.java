package br.com.unit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.unit.domain.Solicitacao;
@Repository
public interface SolicitacaoRepository extends CrudRepository<Solicitacao, Long>{

}
