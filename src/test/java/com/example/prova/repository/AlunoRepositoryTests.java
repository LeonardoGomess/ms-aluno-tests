package com.example.prova.repository;

import com.example.prova.models.Aluno;
import com.example.prova.repositories.AlunoRepository;
import com.example.prova.tests.Factory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class AlunoRepositoryTests {

    @Autowired
    private AlunoRepository repository;

    private Long existingId;
    private Long nonExistingId;
    private Long countTotalPagamento;

    //Vai ser executado antes de cada teste
    @BeforeEach
    void setup() throws Exception{
        existingId = 1L;
        nonExistingId = 100L;
        //verificar quanto registro tem no seed
        countTotalPagamento = 3L;
    }

    @Test
    @DisplayName("Deveria excluir pagamento quando Id existe")
    public void deleteShouldDeletObjectWhenIdExists() {
        // Act
        repository.deleteById(existingId);
        // Assert
        Optional<Aluno> result = repository.findById(existingId);
        //testa se existe um obj dentro do Optional
        Assertions.assertFalse(result.isPresent());
    }

    @Test
    @DisplayName("save Deveria salvar objeto com auto incremento quando Id é nulo")
    public void saveShouldPersistWithAutIncrementWhenIdIsNull(){

        Aluno pagamento = Factory.createAluno();
        pagamento.setId(null);
        pagamento = repository.save(pagamento);
        Assertions.assertNotNull(pagamento.getId());
        // verifica se é o próximo ID
        Assertions.assertEquals(countTotalPagamento + 1, pagamento.getId());
    }

}










