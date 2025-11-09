package caixaeletronico;

public class Cliente {

    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void fazerDeposito(float saldo, float valor){
        CaixaEletronico caixa = new CaixaEletronico(saldo, valor);
        this.saldo = caixa.fazerOperacao(new OperacaoDeposito());
    }

    public void fazerSaque(float saldo, float valor){
        CaixaEletronico caixa = new CaixaEletronico(saldo, valor);
        this.saldo = caixa.fazerOperacao(new OperacaoSaque());
    }

    public void fazerParcelamento(float saldo, float valor){
        CaixaEletronico caixa = new CaixaEletronico(saldo, valor);
        this.saldo = caixa.fazerOperacao(new OperacaoParcelamento());
    }

    public void fazerConsultaSaldo(float saldo, float valor){
        CaixaEletronico caixa = new CaixaEletronico(saldo, valor);
        this.saldo = caixa.fazerOperacao(new OperacaoConsultarSaldo());
    }
}
