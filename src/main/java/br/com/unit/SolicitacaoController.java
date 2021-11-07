package br.com.unit;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unit.domain.Solicitacao;
import br.com.unit.repository.SolicitacaoRepository;


@RestController
public class SolicitacaoController {
	
	@Autowired
	SolicitacaoRepository solicitacaoRepository;
	
	@PostMapping("/solicitacao/cadastro")
	public Object cadastrarSolicitacao(@RequestBody SolicitacaoDTO solicitacaoDTO) {
		try {
			Solicitacao solicitacao = new Solicitacao();
			solicitacao.setMatriculaAluno(solicitacaoDTO.getMatriculaAluno());
			solicitacao.setAtividade(solicitacaoDTO.getAtividade());
			solicitacao.setHomolog(false);
			solicitacao.setNomeCurso(solicitacaoDTO.getNomeCurso());
			solicitacao.setQtdHoras(solicitacaoDTO.getQtdHoras());
			solicitacao.setUrlPdf(solicitacaoDTO.getUrlPdf());	
			solicitacaoRepository.save(solicitacao);
			return solicitacaoDTO;
		} catch (Exception e) {
			return false;
		}
	}
	
	@GetMapping("/solicitacao/lista")
	public ResponseEntity <List<Solicitacao>> lista(){
		try {
			List<Solicitacao> solicitacoes = (List<Solicitacao>) solicitacaoRepository.findAll();
			return ResponseEntity.ok(solicitacoes);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok(null);
		}
	}
	
	@GetMapping("/solicitacao/validar/{id}")
	public ResponseEntity<Solicitacao> updateSolicitacao(@PathVariable ("id") String id ) {
		
	    Long idSolicitacao = Long.parseLong(id);
		Solicitacao solicitacao = solicitacaoRepository.findById(idSolicitacao).orElse(null);

	   if(solicitacao != null) {
		   solicitacao.setHomolog(true);
		   solicitacaoRepository.save(solicitacao);
		   
		   return ResponseEntity.ok(solicitacao);
	   }
	return null;
	    
	}
	
	@GetMapping("/solicitacao/delete/{id}")
	public ResponseEntity<Solicitacao> deleteSolicitacao(@PathVariable ("id") String id ) {
		
	    Long idSolicitacao = Long.parseLong(id);
		Solicitacao solicitacao = solicitacaoRepository.findById(idSolicitacao).orElse(null);

	   if(solicitacao != null) {
		   
		   solicitacaoRepository.delete(solicitacao);
		   
		   return ResponseEntity.ok(solicitacao);
	   }
	return null;
	    
	}
}
