package br.ufpe.tasktrack.service;

import br.ufpe.tasktrack.domain.Cards;



public interface CardService {

    Cards create(Cards card);

    Cards update(Long id, Cards card);

    void delete(Long id);

}
