package visitor;

public class Caixa extends Banco {
    public Caixa(String nome) {
        super(nome);
    }

    @Override
    public String aceitar(Visitor v) {
        return v.abrirContaCaixa(this);
    }
}
