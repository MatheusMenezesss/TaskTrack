package br.ufpe.tasktrack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.ufpe.tasktrack.domain.Instituicao;

public interface InstituicaoRepository extends JpaRepository<Instituicao, Long> {

}
