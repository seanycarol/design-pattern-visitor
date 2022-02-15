package visitor;

public class Itau extends Banco {
    public Itau(String nome) {
        super(nome);
    }

    @Override
    public String aceitar(Visitor v) {
        return v.abrirContaItau(this);
    }
}
