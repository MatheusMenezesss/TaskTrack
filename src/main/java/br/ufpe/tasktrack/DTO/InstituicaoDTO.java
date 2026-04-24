package br.ufpe.tasktrack.DTO;

import jakarta.persistence.Column;

public record InstituicaoDTO(String nome, String sigla) {
        public InstituicaoDTO {
            // Removed redundant validations
        }

}
