package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoVisitorTest {
    @Test
    void deveAbrirContaBradesco() {
        Bradesco bradesco = new Bradesco("Bradesco");

        BancoVisitor visitor = new BancoVisitor();
        assertEquals("Abertura de conta no banco Bradesco", visitor.abrirConta(bradesco));
    }

    @Test
    void deveAbrirContaCaixa() {
        Caixa caixa = new Caixa("Caixa");

        BancoVisitor visitor = new BancoVisitor();
        assertEquals("Abertura de conta no banco Caixa", visitor.abrirConta(caixa));
    }

    @Test
    void deveAbrirContaItau() {
        Itau itau = new Itau("Itaú");

        BancoVisitor visitor = new BancoVisitor();
        assertEquals("Abertura de conta no banco Itaú", visitor.abrirConta(itau));
    }
}