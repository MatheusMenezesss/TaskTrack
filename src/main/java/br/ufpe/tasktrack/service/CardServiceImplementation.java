package br.ufpe.tasktrack.service;

import org.springframework.stereotype.Service;

import br.ufpe.tasktrack.domain.Cards;
import br.ufpe.tasktrack.repository.CardsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CardServiceImplementation implements CardService {
    
    private static final Logger logger = LoggerFactory.getLogger(CardServiceImplementation.class);
    
    private final CardsRepository repository;

    public CardServiceImplementation(CardsRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Cards create(Cards card) {
        Optional<Cards> aux = repository.findById(card.getId());
        if(aux.isPresent()){
            logger.error("Card with id {} already exists", card.getId());
            return null;
        }
        logger.info("Card with id {} added successfully", card.getId());
        return repository.save(card);
    }

    @Override
    @Transactional
    public Cards update(Long id, Cards card) {
        Optional<Cards> existing = repository.findById(card.getId());
        if(existing.isEmpty()){
            logger.error("Card with id {} not found for update", card.getId());
            return null;
        }
        Cards updatedCard = existing.get();
        updatedCard.setTitle(card.getTitle());
        updatedCard.setDescription(card.getDescription());

        logger.info("Card with id {} updated successfully", card.getId());
        return repository.save(updatedCard);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Optional<Cards> existing = repository.findById(id);
        if(existing.isEmpty()){
            logger.error("Card with id {} not found for deletion", id);
            return;
        }
        logger.info("Card with id {} deleted successfully", id);
        repository.delete(existing.get());
    }
}
