package br.com.unit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unit.domain.Aluno;
import br.com.unit.domain.Solicitacao;
import br.com.unit.repository.AlunoRepository;

@RestController
public class AlunoController {
	
	@Autowired
	AlunoRepository repository;
	
	@PostMapping("/cadastro/aluno")
	public Object cadastrarAluno(@RequestBody AlunoDTO alunoDTO) {
		try {
			Aluno aluno = new Aluno();
			aluno.setNomeAluno(alunoDTO.getNomeAluno());
			aluno.setMatricula(alunoDTO.getMatricula());
			aluno.setFotourl(alunoDTO.getFotourl());
			aluno.setSenha(alunoDTO.getSenha());
			aluno.setTurno(alunoDTO.getTurno());
			repository.save(aluno);
			return aluno;
		} catch (Exception e) {
			return false;
		}
	}
	@GetMapping("/aluno/lista")
	public ResponseEntity <List<Aluno>> lista(){
		try {
			List<Aluno> alunos = (List<Aluno>) repository.findAll();
			return ResponseEntity.ok(alunos);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok(null);
		}
	}
	
	@GetMapping("/busca/aluno/{matricula}")
	public ResponseEntity<Aluno> getAlunoByMatricula(@PathVariable ("matricula") String matricula){
		
		try {
			Aluno aluno = repository.findByMatricula(matricula);
		return ResponseEntity.ok(aluno);
		}
		catch (Exception e) {
			
			e.printStackTrace();
		return ResponseEntity.ok(null);
		
		}
	}
}

