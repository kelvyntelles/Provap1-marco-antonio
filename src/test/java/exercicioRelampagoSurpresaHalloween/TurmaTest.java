package exercicioRelampagoSurpresaHalloween;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {

    @Test
    void deveRetornarNomeProfessor() {
        Professor professor = new Professor("Kelvyn");
        Turma turma = new Turma(professor);


        assertEquals("Kelvyn", professor.getNome());
    }

    @Test
    void deveRetornarSetNomeProfessor() {
        Professor professor = new Professor("Kelvyn");
        Professor professor1 = new Professor("Telles");
        Turma turma = new Turma(professor);
        turma.setProfessor(professor1);

        assertEquals("Telles", turma.getNomeProfessor());
    }

}