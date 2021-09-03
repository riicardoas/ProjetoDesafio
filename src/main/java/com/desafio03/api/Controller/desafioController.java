package com.desafio03.api.Controller;


import com.desafio03.api.Service.desafioService;
import com.desafio03.api.model.segundoDesafioModel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/desafio")
public class desafioController {

@GetMapping(value = "/frase")
 public segundoDesafioModel separaVogaisConsoantes(@RequestParam String frase) {
    return desafioService.vogaisConsoantes(frase);
}





}
