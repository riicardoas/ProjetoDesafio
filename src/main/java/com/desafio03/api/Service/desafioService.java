package com.desafio03.api.Service;


import com.desafio03.api.model.segundoDesafioModel;
import org.springframework.stereotype.Service;

@Service
public class desafioService {

    public static segundoDesafioModel vogaisConsoantes(String frase) {

        segundoDesafioModel model = new segundoDesafioModel();


        // char[] vogal = {'a', 'e', 'i','o', 'u'};
        // char[] consoante;

        String vogal = "";
        int consoante = 0;

        for (int i = 0; i < frase.length(); i++) {
            char vogaisDaFrase = frase.charAt(i);
            if (vogaisDaFrase == 'a' || vogaisDaFrase == 'e' ||
                    vogaisDaFrase == 'i' || vogaisDaFrase == 'o' || vogaisDaFrase == 'u') {
                vogal = String.valueOf(vogaisDaFrase);
            } else {
                consoante++;
            }
        }
        model.setRetornoNome(frase);
        model.setVogais(vogal);
        model.setConsoantes(consoante);

        return model;
    }
}


