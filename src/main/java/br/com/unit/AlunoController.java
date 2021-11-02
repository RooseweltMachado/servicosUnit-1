package br.com.unit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unit.domain.Aluno;
import br.com.unit.repository.AlunoRepository;

@RestController
public class AlunoController {
	
	@Autowired
	AlunoRepository repository;
	
	@PostMapping("/cadastro/aluno")
	public Object cadastrarAluno(@RequestBody AlunoDTO alunoDTO) {
		try {
			Aluno aluno = new Aluno();
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
}

