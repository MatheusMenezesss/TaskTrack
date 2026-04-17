package br.ufpe.tasktrack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.ufpe.tasktrack.domain.Cards ;
import br.ufpe.tasktrack.DTO.CardDTO ;
import br.ufpe.tasktrack.service.CardService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
   @Column(nullable = false)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(nullable = false)
    private String createdAt;

    @Column(nullable = false)
    private int position;

    @Column(nullable = false)
    private String assignedTo;
*/

@RestController
@RequestMapping("/cards")
public class CardController {
    private final List<CardDTO> cardDTOs;
    private static final Logger logger = LoggerFactory.getLogger(CardController.class);

    public CardController(List<CardDTO> cardDTOs) {
        this.cardDTOs = cardDTOs;
    }

    @GetMapping("/all")
    public List<CardDTO> getAllCards() {
        logger.info("Iniciando busca por todos os cards");
        List<CardDTO> cards = new ArrayList<>(cardDTOs);

}
