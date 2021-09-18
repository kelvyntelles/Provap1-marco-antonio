package exercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarEscolaridade() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Pessoa pessoa = new Pessoa("Kelvyn");
        pessoa.setEscolaridade(escolaridade);
        assertEquals("Mestrado", pessoa.getDescricaoEscolaridade());
    }

    @Test
    void deveRetornarSemEscolaridade() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Pessoa pessoa = new Pessoa("Kelvyn");
        assertEquals("Sem escolaridade", pessoa.getDescricaoEscolaridade());
    }
}