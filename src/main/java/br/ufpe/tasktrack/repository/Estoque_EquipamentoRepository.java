package br.ufpe.tasktrack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.ufpe.tasktrack.domain.Estoque_Equipamento;


public interface Estoque_EquipamentoRepository extends JpaRepository<Estoque_Equipamento, Long> {

}
