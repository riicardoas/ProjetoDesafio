package com.desafio03.api.Service;

import com.desafio03.api.model.segundoDesafioModel;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class desafioService {

    public static segundoDesafioModel vogaisConsoantes(String frase) {

        segundoDesafioModel model = new segundoDesafioModel();

        List<String> vogais= new ArrayList<>();
        vogais.add("A");
        vogais.add("a");
        vogais.add("E");
        vogais.add("e");
        vogais.add("I");
        vogais.add("i");
        vogais.add("O");
        vogais.add("o");
        vogais.add("U");
        vogais.add("u");

        List<String> vogaisEncontradas = new ArrayList<>();
        List<String> consoantesEncontradas = new ArrayList<>();

        for (int i = 0; i < frase.length(); i++) {
            String c = frase.substring(i, i + 1);
            if (vogais.contains(c)) {
                vogaisEncontradas.add(c);
            } else {
                consoantesEncontradas.add(c);
            }
        }

        model.setRetornoNome(frase);
        model.setVogaisRetorno(vogaisEncontradas);
        model.setConsoantesRetorno(consoantesEncontradas);

        return model;
    }
}


