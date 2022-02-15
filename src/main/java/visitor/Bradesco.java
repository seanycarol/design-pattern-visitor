package visitor;

public class Bradesco extends Banco {
    public Bradesco(String nome) {
        super(nome);
    }

    @Override
    public String aceitar(Visitor v) {
        return v.abrirContaBradesco(this);
    }
}
