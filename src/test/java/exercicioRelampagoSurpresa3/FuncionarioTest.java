package exercicioRelampagoSurpresa3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveInstanciarFuncionario() {
        Funcionario funcionario = new Funcionario("Telles", 1500, 100, 200);
        Funcionario administrador = new Funcionario("Kelvyn", 1500, 100, 200);
        administrador.setAdministrador(true);

        assertEquals("Telles", funcionario.getNome(administrador));
    }

    @Test
    void deveRetornarExcecaoAdministradorNulo() {
        try {
            Funcionario funcionario = new Funcionario("Kelvyn", 1000, 100, 200);
            funcionario.getNome(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Precisa ser administrador para acessar nome do funcionário", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoFuncionarioNaoAdministrador() {
        try {
            Funcionario funcionario = new Funcionario("Telles", 1500, 100, 200);
            Funcionario administrador = new Funcionario("Kelvyn", 1500, 100, 200);
            funcionario.getNome(administrador);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Precisa ser administrador para acessar nome do funcionário", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeVazio() {
        try {
            Funcionario funcionario = new Funcionario("Kelvyn", 1000, 200, 100);
            funcionario.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveCalcularSalarioLiquido() {
        Funcionario funcionario = new Funcionario("Kelvyn", 1000, 200, 100);

        assertEquals(1100.0f, funcionario.calcularSalarioLiquido());
    }

}