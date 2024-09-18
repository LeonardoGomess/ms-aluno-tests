package com.example.prova.tests;


import com.example.prova.models.Aluno;
import com.example.prova.models.Status;

import java.math.BigDecimal;

// Classe para instanciar objetos
public class Factory {

    public static Aluno createAluno(){

        Aluno aluno = new Aluno(1L,"leo","leo@gmail.com","1234",
                "94003",Status.MATRICULADO,"3SIPF");
        return aluno;
    }
}
