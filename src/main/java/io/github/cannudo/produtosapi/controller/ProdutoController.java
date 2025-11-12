package io.github.cannudo.produtosapi.controller;

import io.github.cannudo.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public void salvar(Produto produto) {
        System.out.println("Produto recebido: " + produto);
    }

}
