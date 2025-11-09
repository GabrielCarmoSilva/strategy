package caixaeletronico;

public class OperacaoDeposito implements Operacao {

    public float fazerOperacao(float saldo, float valor){
        return saldo + valor;
    }
}
