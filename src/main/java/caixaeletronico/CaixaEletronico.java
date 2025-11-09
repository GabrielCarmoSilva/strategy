package caixaeletronico;

public class CaixaEletronico {

    private float saldo;
    private float valor;

    public CaixaEletronico(float saldo, float valor){
        this.saldo = saldo;
        this.valor = valor;
    }

    public float fazerOperacao(Operacao operacao){
        return operacao.fazerOperacao(saldo, valor);
    }
}
