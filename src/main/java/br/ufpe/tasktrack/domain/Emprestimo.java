package br.ufpe.tasktrack.domain;

import java.time.LocalDateTime;

//import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

/*
    id_emprestimo (PK): Inteiro.

    id_usuario (FK): Quem pegou.

    id_equipamento (FK): O que pegou.

    id_estoque (FK): De onde saiu.

    qtd_emprestada: Inteiro.

    qtd_devolvida: Inteiro (Default 0).

    data_saida: Timestamp.

    data_retorno_prevista: Date.

    data_retorno_real: Timestamp (Null até ser devolvido).

    status: Enum ('Ativo', 'Finalizado', 'Parcial').
*/

@Entity
@Table(name = "emprestimo")
public class Emprestimo {
    @Id
    @GeneratedValue
    private Integer id_emprestimo;

    @Column(nullable = false)
    private Integer id_usuario;

    @Column(nullable = false)
    private Integer id_equipamento;

    @Column(nullable = false)
    private Integer id_estoque;

    @Column
    private Integer qtd_emprestada;

    @Column
    private Integer qtd_devolvida = 0;

    @Column
    private LocalDateTime data_saida;

    @Column
    private LocalDateTime data_retorno_prevista;

    @Column
    private LocalDateTime data_retorno_real;

    @Column
    private String status;

    // Getters e Setters

    public Integer getID_emprestimo(){
        return this.id_emprestimo;
    }

    public Integer getID_usuario(){
        return this.id_usuario;
    }

    public Integer getID_equipamento(){
        return this.id_equipamento;
    }

    public Integer getID_estoque(){
        return this.id_estoque;
    }

    public Integer getQtd_emprestada(){
        return this.qtd_emprestada;
    }

    public Integer getQtd_devolvida(){
        return this.qtd_devolvida;
    }

    public LocalDateTime getData_saida(){
        return this.data_saida;
    }

    public LocalDateTime getData_retorno_prevista(){
        return this.data_retorno_prevista;
    }

    public LocalDateTime getData_retorno_real(){
        return this.data_retorno_real;
    }

    public String getStatus(){
        return this.status;
    }

    







}
