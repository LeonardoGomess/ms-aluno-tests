package com.example.prova.repositories;

import com.example.prova.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno , Long> {
}
