package br.ufpe.tasktrack.repository;

import br.ufpe.tasktrack.domain.Equipamento;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {

}
