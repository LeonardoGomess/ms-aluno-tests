package com.example.prova.dto;


import com.example.prova.models.Aluno;
import com.example.prova.models.Status;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class AlunoDTO {

    private Long id;
    private String nome;
    private String email;
    private String password;
    private String rm;
    private String turma;

    @Enumerated(EnumType.ORDINAL)
    private Status status;


    public AlunoDTO(Aluno entity) {
        id = entity.getId();
        nome = entity.getNome();
        email = entity.getEmail();
        password = entity.getPassword();
        rm = entity.getRm();
        turma = entity.getTurma();
        status = entity.getStatus();
    }

}
