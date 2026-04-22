package br.ufpe.tasktrack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "estoque_equipamento")
@jakarta.persistence.IdClass(Estoque_Equipamento.Estoque_EquipamentoId.class)
public class Estoque_Equipamento {

    public static class Estoque_EquipamentoId implements java.io.Serializable {
        private Integer id_estoque;
        private Integer id_equipamento;
    }

    @Id
    private Integer id_estoque;

    @Id
    private Integer id_equipamento;

    @Column
    private Integer quantidade_total;

    @Column
    private Integer quantidade_disponivel;

    // Getters e Setters
    public void setQuantidade_total(Integer quantidade_total){
        this.quantidade_total = quantidade_total;
    }

    public void setQuantidade_disponivel(Integer quantidade_disponivel){
        this.quantidade_disponivel = quantidade_disponivel;
    }


}
