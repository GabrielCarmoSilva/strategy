package caixaeletronico;

public class OperacaoSaque implements Operacao {

    public float fazerOperacao(float saldo, float valor){
        return saldo - valor;
    }
}
