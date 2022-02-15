package visitor;

public interface Visitor {
    String abrirContaBradesco(Bradesco bradesco);
    String abrirContaCaixa(Caixa caixa);
    String abrirContaItau(Itau itau);
}
