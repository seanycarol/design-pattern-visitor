package visitor;

public class BancoVisitor implements Visitor {

    public String abrirConta(Banco banco) {
        return banco.aceitar(this);
    }

    @Override
    public String abrirContaBradesco(Bradesco bradesco) {
        return "Abertura de conta no banco " + bradesco.getNome();
    }

    @Override
    public String abrirContaCaixa(Caixa caixa) {
        return "Abertura de conta no banco " + caixa.getNome();
    }

    @Override
    public String abrirContaItau(Itau itau) {
        return "Abertura de conta no banco " + itau.getNome();
    }
}
