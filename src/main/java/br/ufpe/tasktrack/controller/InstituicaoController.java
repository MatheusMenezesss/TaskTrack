package br.ufpe.tasktrack.controller;

import org.springframework.web.bind.annotation.*;
import br.ufpe.tasktrack.domain.Instituicao;
import br.ufpe.tasktrack.DTO.InstituicaoDTO;
import br.ufpe.tasktrack.repository.InstituicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/instituicao")
public class InstituicaoController {
    @Autowired
    private InstituicaoRepository instituicaoRepository;

    @PostMapping("/instituicoes")
    public Instituicao createInstituicao(@RequestBody InstituicaoDTO instituicaoDTO) {
        Instituicao instituicao = new Instituicao();
        instituicao.setNome(instituicaoDTO.nome());
        instituicao.setSigla(instituicaoDTO.sigla());
        return instituicaoRepository.save(instituicao);
    }

    @GetMapping("/instituicoes")
    public Iterable<Instituicao> getAllInstituicoes() {
        return instituicaoRepository.findAll();
    }



}
