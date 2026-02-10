package br.ufpe.tasktrack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

//vamos utilizar para armazenar os logs de movimentação dos cards,
//  para isso precisamos armazenar o id do card,
//  a coluna de origem, a coluna de destino e a data da movimentação

@Entity
@Table(name = "card_history")
public class CardHistory {


}
