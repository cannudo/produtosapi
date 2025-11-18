package io.github.cannudo.produtosapi.controller;

import io.github.cannudo.produtosapi.model.Produto;
import io.github.cannudo.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    private ProdutoRepository produtoRepository;

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto findByID(@PathVariable("id") String id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable("id") String id) {
        produtoRepository.deleteById(id);
    }

    @GetMapping("ola-mundo")
    public String olaMundo() {
        String letra = """
        Ainda é cedo, amor<br>
        Mal começaste a conhecer a vida<br>
        Já anuncias a hora de partida<br>
        Sem saber mesmo o rumo que irás tomar<br>
        Presta atenção, querida<br>
        Embora eu saiba que estás resolvida<br>
        Em cada esquina cai um pouco tua vida<br>
        Em pouco tempo não serás mais o que és<br>
        Ouça-me bem, amor<br>
        Preste atenção, o mundo é um moinho<br>
        Vai triturar teus sonhos, tão mesquinho<br>
        Vai reduzir as ilusões a pó<br>
        Preste atenção, querida<br>
        De cada amor, tu herdarás só o cinismo<br>
        Quando notares, estás à beira do abismo<br>
        Abismo que cavaste com teus pés<br><br>
        Ainda é cedo, amor<br>
        Mal começaste a conhecer a vida<br>
        Já anuncias a hora de partida<br>
        Sem saber mesmo o rumo que irás tomar<br>
        Preste atenção, querida<br>
        Embora eu saiba que estás resolvida<br>
        Em cada esquina cai um pouco a tua vida<br>
        Em pouco tempo não serás mais o que és<br>
        Ouça-me bem, amor<br>
        Preste atenção, o mundo é um moinho<br>
        Vai triturar teus sonhos, tão mesquinho<br>
        Vai reduzir as ilusões a pó<br>
        Preste atenção, querida<br>
        De cada amor, tu herdarás só o cinismo<br>
        Quando notares, estás à beira do abismo<br>
        Abismo que cavaste com teus pés<br>
        """;

        return letra;
    }
}
